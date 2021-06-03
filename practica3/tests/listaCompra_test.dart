// fichero de prueba : listaCompra_test

import 'package:flutter_practica2/ListaCompra.dart';
import 'package:flutter_practica2/Producto.dart';
import 'package:test/test.dart';

void main () {
  group('Lista Compra', () {
    test('value should start at 0', () {
      final lista = new ListaCompra();
      expect(lista.getNumProductos(), 0);
    });

    test('value should be 1', () {
      final lista = new ListaCompra();
      Producto p = new Producto('Patatas', 1);
      lista.aniadirProducto(p);
      expect(lista.getNumProductos(), 1);
    });

    test('value should be 0', () {
      final lista = new ListaCompra();
      Producto p = new Producto('Patatas', 1);
      lista.aniadirProducto(p);
      lista.eliminarProducto(p);
      expect(lista.getNumProductos(), 0);
    });

    test('value should be 1', () {
      final lista = new ListaCompra();
      Producto p = new Producto('Patatas', 5);
      lista.aniadirFavorito(p);
      expect(lista.lista[0].cantidad, 1);
    });

    test('value should be 5', () {
      final lista = new ListaCompra();
      Producto p = new Producto('Patatas', 5);
      lista.aniadirProducto(p);
      expect(lista.lista[0].cantidad, 5);
    });
  });
}
