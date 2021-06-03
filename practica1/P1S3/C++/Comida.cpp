#pragma once
#include <string>
using namespace std;

class Comida
{    
    protected:
        double precio;

    public:
        Comida(){}
        
        virtual double getPrecio(){ return precio; }

        virtual void setPrecio(double p){}

        virtual string toString(){ return ""; }
};