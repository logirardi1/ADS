import 'package:flutter/material.dart';

class NoteDelete extends StatefulWidget {
  const NoteDelete({Key? key}) : super(key: key);

  @override
  _NoteDeleteState createState() => _NoteDeleteState();
}

class _NoteDeleteState extends State<NoteDelete> {
  @override
  Widget build(BuildContext context) {
    return AlertDialog(
      title: Text('Cuidado!'),
      content: Text('Você tem certeza que deseja deletar essa nota??'),
      actions: <Widget> [
        TextButton(
          child: Text('Sim'),
          onPressed: () {
            Navigator.of(context).pop(true);
          },
        ),
        TextButton(
          child: Text('Não'),
          onPressed: () {
            Navigator.of(context).pop(false);
          },
        ),
      ],
    );
  }
}