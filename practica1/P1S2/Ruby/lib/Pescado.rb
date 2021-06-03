require('./Comida.rb');

public
class Pescado < Comida

  attr_accessor :esta_malo
  
	# @ReturnType Comida
	public
	def clonar()
		aux = Pescado.new
    aux.esta_malo = @esta_malo
    return aux
	end

	public
	def initialize()

		@esta_malo = false
	end
end
