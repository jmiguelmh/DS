import 'package:flutter/material.dart';
import 'package:flutter_practica2/main.dart';
import 'package:flutter_test/flutter_test.dart';

void main () {
  testWidgets('Añadir Favorito', (WidgetTester tester) async {
    await tester.pumpWidget(MyApp());

    await tester.enterText(find.byKey(new Key('nombre')), 'Patatas');
    await tester.pump(new Duration(seconds: 1));

    await tester.enterText(find.byKey(new Key('cantidad')), '5');
    await tester.pump(new Duration(seconds: 1));

    //await tester.press(find.byKey(new Key('aniadir')));
    FloatingActionButton aniadir = find.byKey(new Key('aniadir')).evaluate().first.widget;
    aniadir.onPressed();
    await tester.pump(new Duration(seconds: 1));

    IconButton favorito = find.byKey(new Key('favoritoBoton')).evaluate().first.widget;
    favorito.onPressed();
    await tester.pump(new Duration(seconds: 1));

    IconButton listaFavoritos = find.byKey(new Key('listaFavoritos')).evaluate().first.widget;
    listaFavoritos.onPressed();
    await tester.pump(new Duration(seconds: 1));

    expect(find.byType(ListTile), findsOneWidget);
  });
}