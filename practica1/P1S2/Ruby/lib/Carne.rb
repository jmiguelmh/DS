require('./Comida.rb');

public
class Carne < Comida

  attr_accessor :esta_malo
  
	# @ReturnType Comida
	public
	def clonar()
		aux = Carne.new
    aux.esta_malo = @esta_malo
    return aux
	end

	public
	def initialize()

		@esta_malo = false
	end
end
