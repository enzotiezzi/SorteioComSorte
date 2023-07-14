import 'dart:math';

import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Sorteio com sorte',
      theme: ThemeData(
        colorScheme: ColorScheme.fromSeed(seedColor: Colors.black),
        useMaterial3: true,
      ),
      home: const MyHomePage(),
    );
  }
}

class MyHomePage extends StatefulWidget {
  const MyHomePage({super.key});

  @override
  State<MyHomePage> createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  final _numbers = <int>[];

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text("Sorteio com sorte"),
      ),
      body: Column(
        children: [
          const Padding(
            padding: EdgeInsets.all(8.0),
            child: Row(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [Text("Mega Sena", textScaleFactor: 1.5,)],
            ),
          ),
          _numbers.isNotEmpty
              ? Expanded(
                  child: ListView(
                    children: [
                      Row(
                        mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                        mainAxisSize: MainAxisSize.max,
                        children: [
                          Column(
                            mainAxisAlignment: MainAxisAlignment.spaceBetween,
                            mainAxisSize: MainAxisSize.max,
                            children: List.generate(
                                3,
                                (index) => CircleAvatar(
                                      maxRadius: 64,
                                      child: Text(_numbers[index].toString(), textScaleFactor: 2),
                                    )),
                          ),
                          Column(
                            mainAxisAlignment: MainAxisAlignment.spaceBetween,
                            mainAxisSize: MainAxisSize.max,
                            children: List.generate(
                                3,
                                (index) => CircleAvatar(
                                      maxRadius: 64,
                                      child:
                                          Text(_numbers[index + 3].toString(), textScaleFactor: 2),
                                    )),
                          )
                        ],
                      )
                    ],
                  ),
                )
              : Container(),
        ],
      ),
      floatingActionButton: FloatingActionButton(
        child: const Icon(Icons.refresh),
        onPressed: () {
          final newNumbers = <int>[];

          do {
            final random = Random();

            final number = random.nextInt(60) + 1;

            if (!newNumbers.contains(number)) newNumbers.add(number);
          } while (newNumbers.length < 6);

          _numbers.clear();

          setState(() {
            _numbers.addAll(newNumbers);
          });
        },
      ),
    );
  }
}
