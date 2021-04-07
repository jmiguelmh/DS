#include "FilterManager.cpp"

class Cliente
{
    private:
        FilterManager gestorFiltros;

    public:
        Cliente(FilterManager gestor)
        {
            gestorFiltros = gestor;
        }

        void Request()
        {
            gestorFiltros.ejecutarFiltros();
        }

};