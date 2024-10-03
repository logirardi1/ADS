import 'package:flutter/material.dart';
import 'package:notes/models/note_for_listening.dart';
import 'package:notes/views/note_delete.dart';
import 'package:notes/views/note_modify.dart';


class NoteList  extends StatelessWidget {

  final notes = [
    new NoteForListening(
      noteID: "1",
      createDateTime: DateTime.now(),
      lastestEditDateTime: DateTime.now(),
      noteTitle: "Note 1"
      ),
      new NoteForListening(
      noteID: "2",
      createDateTime: DateTime.now(),
      lastestEditDateTime: DateTime.now(),
      noteTitle: "Note 2"
      ),
      new NoteForListening(
      noteID: "3",
      createDateTime: DateTime.now(),
      lastestEditDateTime: DateTime.now(),
      noteTitle: "Note 3"
      ),
  ];

  String formatDateTime(DateTime dateTime) {
    return '${dateTime.day}/${dateTime.month}/${dateTime.year}';
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text('List of Notes')),
      floatingActionButton: FloatingActionButton(
        onPressed: () {
          Navigator.of(context)
            .push(MaterialPageRoute(builder: (_) => NoteModify()));

        },
        child: Icon(Icons.add),
      ),
      body: ListView.separated(separatorBuilder: (_, __) => Divider(height: 1, color: Colors.green),
      itemBuilder: (_, index) {
        return Dismissible(
          key: ValueKey(notes[index].noteID),
          direction: DismissDirection.startToEnd,
          onDismissed: (direction) {
          },

          confirmDismiss: (direction) async {
            final result = await showDialog(
              context: context,
              builder: (_) => NoteDelete()
            );
            print(result);
            return result;
            
          },
          //viadagem frufru do slide vermelho com  lixeira
          background: Container(
            color: Colors.red,
            padding: EdgeInsets.only(left: 16), //da pra alterar e fazer um chan legal aqui colocar 16 no 32 pra ficar certo
            child: Align(child: Icon(Icons.delete, color:Colors.white), alignment: Alignment.centerLeft),
          
          ),
          child: ListTile(
            title: Text(
            notes[index].noteTitle,
            style: TextStyle(color: Theme.of(context).primaryColor),
          ),
          subtitle: Text('Última vez editado em ${formatDateTime(notes[index].lastestEditDateTime)}'),
          onTap: () {
            Navigator.of(context)
              .push(MaterialPageRoute(builder: (_) => NoteModify(noteID: notes[index].noteID)));
          }
                ),
        );
     },
     itemCount: notes.length,
   ),
 );
}
}