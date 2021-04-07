#include <iostream>
#include "Cliente.cpp"
#include "FilterManager.cpp"
#include "Comida.cpp"
#include "Carne.cpp"
#include "Filtro1.cpp"
#include "Filtro2.cpp"
#include "Pescado.cpp"
#include "FilterChain.cpp"
#include <ctime>
#include <cstdlib>
#include <unistd.h>

using namespace std;

int main()
{
    FilterChain cadenaFiltros;
    FilterManager gestorFiltros(cadenaFiltros);
    Cliente cliente(gestorFiltros);
    srand(time(NULL));
    int random;
    Filtro *filtro1 = new Filtro1();
    Filtro *filtro2 = new Filtro2();
    Comida *comida;
    
    while(true)
    {
        random = rand() % 2;

        if(random == 0)
        {
            comida = new Carne();
            filtro1->setComida(comida);
            filtro2->setComida(comida);
        }
        else
        {
            comida = new Pescado();
            filtro1->setComida(comida);
            filtro2->setComida(comida);
        }

        random = rand() % 2;

        if(random == 0)
            gestorFiltros.aniadirFiltro(filtro1);
        
        random = rand() % 2;

        if(random == 0)
            gestorFiltros.aniadirFiltro(filtro2);

        gestorFiltros.ejecutarFiltros();
        cout << comida->toString() << endl << endl;
        gestorFiltros.vaciarFiltro();
        sleep(2);
    }

    return 0;
}
