package librerias.estructurasDeDatos.lineales;

/**
 * Write a description of class LEGListaConPIOrdenada here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LEGListaConPIOrdenada<E extends Comparable<E>> extends LEGListaConPI<E> {
    // instance variables - replace the example below with your own
  
    /**
     * Constructor for objects of class LEGListaConPIOrdenada
     */
    public LEGListaConPIOrdenada() {
       super();
    }
    
     /** Inserta e en una ListaConPI antes del Elemento  
     *  que ocupa su PI, que permanece INalterado
     *  
     *  @param e un Elemento de tipo generico E
     */
    
    public void insertar(E e) {
        inicio();
        while(!esFin() && recuperar().compareTo(e) < 0) {
            siguiente();
        }
        super.insertar(e);
    }

    
   
}
