import 'package:flutter/material.dart';
import 'package:get_it/get_it.dart';
import 'package:notes/services/notes_service.dart';
import 'package:notes/views/note_list.dart';
// setup pra puxar a rest api
void setupLocator () {
  GetIt.I.registerLazySingleton(() => NotesService()); //"I" é  tipo um atalho pra instance (obrigado youtube)
  
}
void main() {
  setupLocator();
  runApp(App());
} // tive q transformar a main num body pra poder chamar

class App extends StatelessWidget {

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        primarySwatch: Colors.blue, 
      ),
      home: NoteList(),
    );
  }
}