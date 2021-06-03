require('./Comida.rb');
require('./Tienda.rb');
require('./FactoriaProducto.rb');
require_relative 'Carne'
require_relative 'Carniceria'
#encoding:utf-8
#!/bin/env ruby

public
class FactoriaCarne < FactoriaProducto

	# @ReturnType Comida
	public
	def crearComida()
		carne_aux = @carne.clonar()
    puts("Se ha creado una carne.")
    return carne_aux
	end

	# @ReturnType Tienda
	public
	def crearTienda(n)
		carniceria = Carniceria.new(self.crearComida(), n)
    puts("Creada carniceria: #{n}")
    return carniceria
	end

	public
	def initialize()
		@carne = Carne.new
    if(rand(2)==1)
      @carne.esta_malo = true
    end
	end
end
