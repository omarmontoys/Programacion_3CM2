
package analisis_y_diseño_de_algoritmos;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author OMAR
 */
public class Grafica1 {
     
    // grafica
    private JFreeChart grafica;
    // coleccion de series
    private XYSeriesCollection series;
    private String nombre,tituloEjeX,tituloEjeY;

    public Grafica1(String nombre,String ty,String tx) {
     this.grafica = null;
     this.series = new XYSeriesCollection();
     this.nombre = nombre;
     this.tituloEjeX = tx;
     this.tituloEjeY = ty;
    
    }
    
    public void agregarSerie (double[] datosSerie, String nombreSerie){
       // instanciamos la serie
        XYSeries serie = new XYSeries(nombreSerie);
        // recorrer los datos para agregarlos a la serie
        for (int x = 0 ; x < datosSerie.length;x++){
        serie.add(x, datosSerie[x]);
      }
     // agregamos al serie a la coleccion de series
     this.series.addSeries(serie);
    }
    
    public void creaYmuestraGrafica(){
    
        this.grafica = ChartFactory.createXYLineChart(nombre, tituloEjeX, tituloEjeY, series);
        
        // utilizar un panel especial dentro de jfreechart
        ChartFrame panel = new ChartFrame("grafica",grafica);
        panel.pack();
        panel.setVisible(true);
        
        
    }
    
    
}
