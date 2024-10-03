import 'package:flutter/material.dart';
import 'lib/telas/tela3.dart';
import 'rotas/telas/tela2.dart';
import 'rotas/telas/tela3.dart';
import 'rotas/telas/tela4.dart';
import 'rotas/model/Pessoa.dart';

class Rotas extends StatelessWidget {
  const Rotas({super.key});
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Utilizando Rotas',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: const MinhasRotas(title: 'Utilizando Rotas'),
      routes: {
        '/tela1': (context) => const Tela1(),
        '/tela2': (context) => const Tela2(),
        '/tela3': (context) => const Tela3(),
        '/tela4': (context) => Tela4.novaInstancia(parametro: "valor")
      },
    );
  }
}

class MinhasRotas extends StatefulWidget {
  const MinhasRotas({super.key, required this.title});

  final String title;

  @override
  State<MinhasRotas> createState() => _MinhasRotasState();
}

class _MinhasRotasState extends State<MinhasRotas> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(widget.title),
      ),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            ElevatedButton(
                onPressed: () {
                  Navigator.pushNamed(context, '/tela1');
                },
                child: const Text('TELA 1')),
            ElevatedButton(
                onPressed: () {
                  Navigator.pushNamed(context, '/tela2',
                      arguments: 'parametro1');
                },
                child: const Text('TELA 2')),
            ElevatedButton(
                onPressed: () {
                  Navigator.pushNamed(context, '/tela3',
                      arguments: Pessoa("Luís", "Felipe"));
                },
                child: const Text('TELA 3')),
            ElevatedButton(
                onPressed: () {
                  Navigator.pushNamed(context, '/tela4');
                },
                child: const Text('TELA 4')),
          ],
        ),
      ),
    );
  }
}
