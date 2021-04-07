#pragma once
#include "Filtro.cpp"
#include "Filtro1.cpp"
#include "Filtro2.cpp"
#include <vector>
using namespace std;

class FilterChain
{
    private:
        vector<Filtro*> *filtros;
    
    public:
        FilterChain()
        {
            filtros = new vector<Filtro*>();
        }

        void aniadirFiltro(Filtro *f)
        {
            (*filtros).push_back(f);
        }

        void ejecutarFiltros()
        {
            for(int i = 0; i < filtros->size(); i++)
            {
                (*filtros)[i]->ejecutar();
            }
                
        }

        void vaciarFiltro()
        {
            (*filtros).clear();
        }
};