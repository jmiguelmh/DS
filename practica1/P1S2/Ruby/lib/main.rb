require_relative 'Cliente'
require_relative 'FactoriaPescado'
require_relative 'FactoriaCarne'


@cliente = Cliente.new

for i in 0..4
  ran = rand(2)
  if(ran==0)
    factoria = FactoriaCarne.new
    
  else
    factoria = FactoriaPescado.new
    
  end
  
  @cliente.crearProducto(factoria, i)
end