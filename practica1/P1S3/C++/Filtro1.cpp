#pragma once
#include "Filtro.cpp"
#include "Comida.cpp"
#include <iostream>
#include "Carne.cpp"
using namespace std;

class Filtro1 : public Filtro
{
    public:
    Filtro1(){}

    Filtro1(Comida *c)
    {
        comida = c;
    }

    void ejecutar()
    {
        cout << "Se ha descontado el 21% del IVA" << endl;
        comida->setPrecio(comida->getPrecio() * 0.79);
    }

    void setComida(Comida *c)
    {
        comida = c;
    }
    
};
