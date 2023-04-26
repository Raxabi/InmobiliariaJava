package ClaseInmobiliaria;


import java.util.Comparator;

import Propiedad.Propiedad;

/*Método que devuelve una cadena con todas las
propiedades ordenadas por su precio. */

public class OrdenPrecio implements Comparator<Propiedad> {

    @Override
    public int compare(Propiedad ar0, Propiedad ar1) {
       
       return Float.compare(ar0.getPrecio(),ar1.getPrecio());
        
    }
    
}
