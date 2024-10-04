import 'package:notes/models/note_for_listening.dart';
import 'package:notes/database_helper.dart';

class  NotesService {

  List<NoteForListening> getNotesList() {
    return [
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
  }

}