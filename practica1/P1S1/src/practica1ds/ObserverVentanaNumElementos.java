package practica1ds;

import GUI.VentanaNumElementos;
import java.util.Observable;
import java.util.Observer;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

public class ObserverVentanaNumElementos implements Observer {
	private VentanaNumElementos ventana;
        private Elementos observable;
        private int num, numP = 0, numI = 0;
        DefaultCategoryDataset ds = new DefaultCategoryDataset();
        JFreeChart jf = ChartFactory.createBarChart3D("Comparación números", "Numeros", "Canridad", ds);

        public ObserverVentanaNumElementos(Elementos el, VentanaNumElementos vent) {
            observable = el;
            ventana = vent;
            ChartFrame f = new ChartFrame("Elementos", jf);
            f.setSize(1000, 600);
            f.setLocationRelativeTo(null);
            f.setVisible(true);
        }
        
        @Override
	public void update(Observable aO, Object aArg) {
            ventana.setNumElementos(aO.toString());
            num = Integer.parseInt(aO.toString());
            
            if(num % 2 == 0)
                numP++;
            else
                numI++;
            
            try{
                
                ds.addValue(numP, "Pares", "");
                ds.addValue(numI, "impares", "");
                
                jf = ChartFactory.createBarChart3D("Comparación números", "Numeros", "Canridad", ds);
            }catch(Exception e){

            }
	}
}