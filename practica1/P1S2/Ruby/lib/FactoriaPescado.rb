require('./Comida.rb');
require('./Tienda.rb');
require('./FactoriaProducto.rb');
require_relative 'Pescado'
require_relative 'Pescaderia'
#encoding:utf-8
#!/bin/env ruby

public
class FactoriaPescado < FactoriaProducto

	# @ReturnType Comida
	public
	def crearComida()
		pescado_aux = @pescado.clonar()
    puts("Se ha creado un pescado.")
    return pescado_aux
	end

	# @ReturnType Tienda
	public
	def crearTienda(n)
		pescaderia = Pescaderia.new(self.crearComida(), n)
    puts("Creada pescaderia: #{n}")
    return pescaderia
	end

	public
	def initialize()
		@pescado = Pescado.new()
    if(rand(2)==1)
      @pescado.esta_malo = true
    end
	end
end
