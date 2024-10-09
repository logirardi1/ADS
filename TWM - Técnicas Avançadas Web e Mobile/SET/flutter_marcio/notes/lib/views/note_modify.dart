import 'package:flutter/material.dart';

class NoteModify extends StatelessWidget {
  final String? noteID; // 
  bool get isEditing => noteID != null;

  NoteModify({this.noteID}); // noteID é um parâmetro opcional  (nao  podia ser sincrono)

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text(isEditing ? 'Editar  nota' : 'Criar nota')),
      body: Padding(
        padding: const EdgeInsets.all(8.0),
        child: Column(
          children: <Widget>[
            TextField(
              decoration: InputDecoration(
                hintText: 'Note Title'
              ),
            ),

            Container(height: 8),

            TextField(
              decoration: InputDecoration(
                hintText: 'Conteudo da nota'
              ),
            ),

            Container(height: 16),

            SizedBox(
              width: double.infinity,
              height: 35,
              child: ElevatedButton(
                child: Text('Submit', style: TextStyle(color: Colors.white)),
                style: ElevatedButton.styleFrom(backgroundColor: Theme.of(context).primaryColor),
                onPressed: () {
                  Navigator.of(context).pop();
                },
              ),
            )
          ],
        ),
      ),
    );
  }
}