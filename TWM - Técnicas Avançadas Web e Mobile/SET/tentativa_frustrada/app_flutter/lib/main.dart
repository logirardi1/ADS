import 'package:flutter/material.dart';
import 'database_helper.dart';
import 'api_service.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'CRUD + API App',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: HomePage(),
    );
  }
}

class HomePage extends StatefulWidget {
  const HomePage({Key? key}) : super(key: key);

  @override
  _HomePageState createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  final DatabaseHelper dbHelper = DatabaseHelper();
  final ApiService apiService = ApiService();
  final TextEditingController nameController = TextEditingController();
  List<Map<String, dynamic>> items = [];
  List<dynamic> users = [];

  @override
  void initState() {
    super.initState();
    _loadItems();
  }

  Future<void> _loadItems() async {
    final data = await dbHelper.getItems();
    setState(() {
      items = data;
    });
  }

  Future<void> _addItem() async {
    if (nameController.text.isNotEmpty) {
      await dbHelper.insertItem(nameController.text);
      nameController.clear();
      _loadItems();
    }
  }

  Future<void> _updateItem(int id) async {
    if (nameController.text.isNotEmpty) {
      await dbHelper.updateItem(id, nameController.text);
      nameController.clear();
      _loadItems();
    }
  }

  Future<void> _deleteItem(int id) async {
    await dbHelper.deleteItem(id);
    _loadItems();
  }

  Future<void> _fetchUsers() async {
    final data = await apiService.fetchUsers();
    setState(() {
      users = data;
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('CRUD + API App'),
      ),
      body: Padding(
        padding: const EdgeInsets.all(8.0),
        child: Column(
          children: [
            TextField(
              controller: nameController,
              decoration: const InputDecoration(labelText: 'Nome'),
            ),
            Row(
              children: [
                ElevatedButton(
                  onPressed: _addItem,
                  child: const Text('Adicionar'),
                ),
                const SizedBox(width: 10),
                ElevatedButton(
                  onPressed: _fetchUsers,
                  child: const Text('Carregar Usuários da API'),
                ),
              ],
            ),
            Expanded(
              child: ListView.builder(
                itemCount: items.length,
                itemBuilder: (context, index) {
                  final item = items[index];
                  return ListTile(
                    title: Text(item['name']),
                    trailing: Row(
                      mainAxisSize: MainAxisSize.min,
                      children: [
                        IconButton(
                          icon: const Icon(Icons.edit),
                          onPressed: () {
                            nameController.text = item['name'];
                            _updateItem(item['id']);
                          },
                        ),
                        IconButton(
                          icon: const Icon(Icons.delete),
                          onPressed: () => _deleteItem(item['id']),
                        ),
                      ],
                    ),
                  );
                },
              ),
            ),
            if (users.isNotEmpty) ...[
              const Divider(),
              const Text('Usuários da API:'),
              Expanded(
                child: ListView.builder(
                  itemCount: users.length,
                  itemBuilder: (context, index) {
                    final user = users[index];
                    return ListTile(
                      title: Text(user['name']),
                      subtitle: Text(user['email']),
                    );
                  },
                ),
              ),
            ],
          ],
        ),
      ),
    );
  }
}
