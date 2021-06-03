require('./Tienda.rb');
#encoding:utf-8
#!/bin/env ruby

public
class Carniceria < Tienda

	public
	def initialize(car, n)

		@carne = car
    @num = n
	end
  
  def run
      while true
        puts("Carniceria #{@num} creando carne: ")
        if(@carne.esta_malo == 0)
          puts("La carne esta mala, se tira.")
          sleep(1)
          
        else
          puts("Se prepara la carne.")
          sleep(4)
        end
      end
    end
end
