
#pragma once
#include "Filtro.cpp"
#include "Filtro1.cpp"
#include "Filtro2.cpp"
#include "FilterChain.cpp"

class FilterManager
{
    private:
        FilterChain cadena;

    public:
        FilterManager(){}

        FilterManager(FilterChain c)
        {
            cadena = c;
        }

        void aniadirFiltro(Filtro *f)
        {
            cadena.aniadirFiltro(f);
        }

        void ejecutarFiltros()
        {
            cadena.ejecutarFiltros();
        }

        void vaciarFiltro()
        {
            cadena.vaciarFiltro();
        }
};