/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author OMAR
 */
public interface AlgoritmosdeOrdenamiento1 {
    
  // definir de una forma abstracta los 
  // comportamientos de un algoritmo de ordenamiento 
    public void obtenerDatos(double[] datos);
    public void ordenarDatos();
    public double[] getResultado();
    public double getTiempo_e();
}
    

