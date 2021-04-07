#pragma once
#include "Filtro.cpp"
#include "Comida.cpp"
#include <iostream>
using namespace std;

class Filtro2 : public Filtro
{   
    public:
    Filtro2(){}

    Filtro2(Comida *c)
    {
        comida = c;
    }

    void ejecutar()
    {
        cout << "Se ha aplicado un descuento del 50%" << endl;
        comida->setPrecio(comida->getPrecio() * 0.5);
    }

    void setComida(Comida *c)
    {
        comida = c;
    }
    
};
