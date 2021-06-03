require('./Tienda.rb');
#encoding:utf-8
#!/bin/env ruby

public
class Pescaderia < Tienda


	public
	def initialize(pes, n)

		@pescado = pes
    @num = n
	end
  
  def run
      while true
        puts("Pescaderia #{@num} creando pescado: ")
        if(@pescado.esta_malo == 0)
          puts("El pescado esta mala, se tira.")
          sleep(1)
          
        else
          puts("Se prepara el pescado.")
          sleep(5)
        end
      end
    end
    
end
