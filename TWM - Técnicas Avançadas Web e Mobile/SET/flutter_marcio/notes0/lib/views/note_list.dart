import 'package:crud_api_app/models/note_for_listening.dart';
import 'package:flutter/material.dart';
import 'package:notes/lib/models/note_for_listening.dart';

class NoteList  extends StatelessWidget {

  final notes = [
    new NoteForListening(
      noteID: "1",
      createDateTime: DataTime.now(),
      lastEditDateTime: DateTime.now(),
      noteTitle: "Note 1"
      ),
      new NoteForListening(
      noteID: "2",
      createDateTime: DataTime.now(),
      lastEditDateTime: DateTime.now(),
      noteTitle: "Note 2"
      ),
      new NoteForListening(
      noteID: "3",
      createDateTime: DataTime.now(),
      lastEditDateTime: DateTime.now(),
      noteTitle: "Note 3"
      ),
  ];

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text('List of Notes')),
      floatingActionButton: FloatingActionButton(
        onPressed: () {

        },
        child: Icon(Icons.add),
      ),
      body: ListView.separated(separatorBuilder: (_, __) => Divider(height: 1, color: Colors.green),
      itemBuilder: (_, index) {
        return ListTile(
          title: Text(
          'Hello',
          style: TextStyle(color: Theme.of(context).primaryColor),
        ),
        subtitle: Text('Last edited on  21/02/2021'),
      );
     },
     itemCount: 30,
   ),
 );
}
}