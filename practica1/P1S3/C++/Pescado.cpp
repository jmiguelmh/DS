#include "Comida.cpp"
#include <iostream>
using namespace std;
class Pescado : public Comida
{    
    public:
        Pescado() :Comida()
        {
            precio = 3.0;
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
            string resultado = "El pescado cuesta " + to_string(precio);
            return resultado;
        }
};