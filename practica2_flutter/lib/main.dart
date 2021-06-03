import 'package:flutter/material.dart';
import 'package:flutter_practica2/Producto.dart';

List<String> favoritos = [];
List<Producto> _lista = [];

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Lista de la Compra',
      theme: ThemeData(
        primarySwatch: Colors.red,
      ),
      home: MyHomePage(),
    );
  }
}

class MyHomePage extends StatefulWidget {
  @override
  _MyHomePageState createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Lista de la compra'),
        backgroundColor: Colors.red,
        centerTitle: true,
        actions: [
          IconButton(
              icon: Icon(Icons.list), onPressed: comidasFavoritas),
        ],
      ),
      body: BodyWidget(),
      resizeToAvoidBottomInset: false,
    );
  }

  void comidasFavoritas() {
    Navigator.of(context).push(
      MaterialPageRoute<void>(
        builder: (BuildContext context) {
          final tiles = favoritos.map(
                (String str) {
              return ListTile(
                title: Text(
                  str,
                  style: TextStyle(
                    fontSize: 18.0,
                    color: Colors.black,
                  ),
                ),
                onTap: () {
                  setState(() {
                    Producto p = new Producto(str, 1);

                    bool encontrado = false;
                    for (int i = 0; i < _lista.length && !encontrado; i++)
                      if(_lista[i].nombre == str)
                        encontrado = true;

                    if (!encontrado) {
                      _lista.add(p);
                    }
                  });
                },
              );
            },
          );
          final divided = ListTile.divideTiles(
            context: context,
            tiles: tiles,
          ).toList();

          return Scaffold(
            appBar: AppBar(
              title: Text('Comidas favoritas'),
            ),
            body: ListView(children: divided),
          );
        },
      ),
    );
  }
}

class BodyWidget extends StatefulWidget {
  @override
  _BodyWidgetState createState() => _BodyWidgetState();
}

class _BodyWidgetState extends State<BodyWidget> {
  String _nombreLista = '';
  String nombreProducto = '';
  int cantidadProducto = 1;


  @override
  Widget build(BuildContext context) {
    return Container(
      color: Colors.grey[350],
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.stretch,
        children: <Widget>[
          TituloLista(),
          Botones(),
          Lista(),
        ],
        mainAxisAlignment: MainAxisAlignment.start,
      )
    );
  }

  Widget TituloLista() {
    return Container(
      margin: EdgeInsets.all(15.0),
      child: Row(
        children: <Widget>[
          Center(
            child: Text(
                'Nombre de la lista: $_nombreLista',
                style: TextStyle(
                  fontSize: 18.0,
                  color: Colors.black,
                )
            ),
          ),
          Flexible(
              child: TextField(
                  decoration: InputDecoration(border: InputBorder.none),
                  style: TextStyle(
                    fontSize: 18.0,
                    color: Colors.black,
                  )
              )
          )
        ],
      ),
    );
  }

  Widget Lista() {
    return Container(
      height: 500.0,
      child: ListView(
        children: _lista.map((producto) {
          bool aniadidoFavorito = favoritos.contains(producto.nombre);
          return Card(
              margin: EdgeInsets.fromLTRB(15.0, 15.0, 15.0, 0.0),
              child: Padding(
                padding: const EdgeInsets.fromLTRB(15.0, 2.0, 15.0, 2.0),
                child: Column(
                    crossAxisAlignment: CrossAxisAlignment.stretch,
                    children: <Widget>[
                      Row(
                          mainAxisAlignment: MainAxisAlignment.spaceBetween,
                          children: <Widget>[
                            Text(
                                producto.nombre,
                                style: TextStyle(
                                  fontSize: 18.0,
                                  color: Colors.black,
                                )
                            ),
                            Text(
                              'Cantidad: ${producto.cantidad}',
                              style: TextStyle(
                                fontSize: 18.0,
                                color: Colors.black,
                              )
                            ),
                            Container(
                              child: Row(
                                children: <Widget>[
                                  IconButton(
                                    onPressed: () {
                                      setState(() {});
                                    },
                                    icon: IconButton(
                                        onPressed: () {
                                          setState(() {
                                            if(!aniadidoFavorito) {
                                              favoritos.add(producto.nombre);
                                              print('Añadido a Favorito');
                                              print(favoritos);
                                            }
                                            else {
                                              favoritos.remove(producto.nombre);
                                              print('Quitado de Favorito');
                                              print(favoritos);
                                            }
                                          });
                                        },
                                        icon: Icon(aniadidoFavorito ? Icons.favorite : Icons.favorite_border),
                                        color: Colors.red,
                                    ),
                                    color: Colors.red,
                                  ),
                                  IconButton(
                                    onPressed: () {
                                      setState(() {
                                        _lista.remove(producto);
                                      });
                                    },
                                    icon: Icon(Icons.delete),
                                    color: Colors.red,
                                  )
                                ],
                              )
                            ),
                          ]
                      ),
                    ]
                ),
              )
          );
        }).toList(),
      )
    );
  }

  Widget Botones() {
    return Container(
      margin: EdgeInsets.all(15.0),
      child: Row(
        children: <Widget>[
          Flexible(
            child: TextField(
              decoration: InputDecoration(hintText: 'Nombre'),
              onChanged: (String nombre){
                nombreProducto = nombre;
              },
            ),
          ),
          Flexible(
            child: TextField(
              decoration: InputDecoration(hintText: 'Cantidad'),
              onChanged: (String cantidad){
                cantidadProducto = int.parse(cantidad);
              },
            )
          ),
          FloatingActionButton(
            backgroundColor: Colors.red,
            child: Icon(Icons.add),
            onPressed: () {
              print('Nombre producto: ${nombreProducto}');
              print('Cantidad producto: ${cantidadProducto}');

              Producto p = new Producto(nombreProducto, cantidadProducto);

              setState(() {
                if(p.nombre.isNotEmpty) {
                  bool encontrado = false;
                  for (int i = 0; i < _lista.length && !encontrado; i++)
                    if (_lista[i].nombre == nombreProducto) {
                      _lista[i].cantidad += cantidadProducto;
                      if (_lista[i].cantidad <= 0)
                        _lista[i].cantidad = 1;
                      encontrado = true;
                    }

                  if (!encontrado) {
                    if (p.cantidad <= 0)
                      p.cantidad = 1;
                    _lista.add(p);
                  }
                }
              });
            },
          )
        ],
      ),
    );
  }
}





