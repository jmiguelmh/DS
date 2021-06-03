require('./Comida.rb');
require('./Tienda.rb');

public
class Cliente

	public
	def initialize()

		
	end
  
  def crearProducto(factoria, num)
    tienda = factoria.crearTienda(num)
    Thread.new do tienda.run() end
  end
end
