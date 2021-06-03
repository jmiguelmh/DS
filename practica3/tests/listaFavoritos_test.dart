// fichero de prueba : listaFavoritos_test

import 'package:flutter_practica2/ListaFavoritos.dart';
import 'package:test/test.dart';

void main () {
  group('Lista Favoritos', () {
    test('value should start at 0', () {
      final lista = new ListaFavoritos();
      expect(lista.getNumFavoritos(), 0);
    });

    test('value should be 1', () {
      final lista = new ListaFavoritos();
      String producto = 'Patatas';
      lista.aniadirFavorito(producto);
      expect(lista.getNumFavoritos(), 1);
    });

    test('value should be 0', () {
      final lista = new ListaFavoritos();
      String producto = 'Patatas';
      lista.aniadirFavorito(producto);
      lista.eliminarFavorito(producto);
      expect(lista.getNumFavoritos(), 0);
    });

    test('value should be true', () {
      final lista = new ListaFavoritos();
      String producto = 'Patatas';
      lista.aniadirFavorito(producto);
      expect(lista.esFavorito(producto), true);
    });
  });
}