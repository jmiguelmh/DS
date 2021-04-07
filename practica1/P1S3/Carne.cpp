#pragma once
#include "Comida.cpp"
#include <iostream>
using namespace std;
class Carne : public Comida
{    
    public:
        Carne() :Comida()
        {  
            precio = 5.0;
        }

        double getPrecio()
        {
            return precio;
        }

        void setPrecio(double p)
        {
            precio = p;
        }

        string toString()
        {
            string resultado = "La carne cuesta " + to_string(precio);
            return resultado;
        }
};