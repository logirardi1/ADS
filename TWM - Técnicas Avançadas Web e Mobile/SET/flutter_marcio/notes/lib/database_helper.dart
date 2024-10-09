import 'package:path/path.dart';
import 'package:sqflite/sqflite.dart';

class DatabaseHelper {
  static final DatabaseHelper _instance = DatabaseHelper.internal();

factory DatabaseHelper() => _instance;

static Database? _database;

Future<Database> get database async {
  if (_database != null) return _database!;
  _database = await initDb();
  return _database!;
}

DatabaseHelper.internal();

initDb() async {
  String path = join(await getDatabasesPath(), 'notes.db');
  return await openDatabase(path, version: 1, onCreate: _createDb);
}

void _createDb(Database db, int version) async {
  await db.execute('''
        CREATE TABLE notes (
          title TEXT NOT NULL,
          content TEXT NOT NULL
        )
        ''');
}
}