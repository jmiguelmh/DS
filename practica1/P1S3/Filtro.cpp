#pragma once
#include "Comida.cpp"

class Filtro
{
    protected:
        Comida *comida;

    public:
        Filtro(){}
        Filtro(Comida *c){}
        virtual void ejecutar(){}
        virtual void setComida(Comida *c){}
};