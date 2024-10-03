import 'package:flutter/material.dart';

class Tela2 extends StatelessWidget {
  const Tela2({super.key});

  @override
  Widget build(BuildContext context) {
    final dados = ModalRoute.of(context)!.settings.arguments;

    return Scaffold(
      appBar: AppBar(
        title: const Text("Tela 2"),
      ),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            const Text('Tela 2', style: TextStyle(fontSize: 50)),
            Text(dados.toString(), style: const TextStyle(fontSize: 30))
          ],
        ),
      ),
    );
  }
}
