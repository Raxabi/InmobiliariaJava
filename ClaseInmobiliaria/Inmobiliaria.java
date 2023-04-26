/* Diseñar una clase llamada INMOBILIARIA, esta clase almacenará una colección de las propiedades que la
inmobiliaria tiene a la venta. La colección debe estar ordenada de forma ascendente por el código de la
propiedad, y no debe permitir que haya dos propiedades con el mismo código. Utiliza la colección que
estimes más conveniente.

La clase debe ofrecer, al menos, los siguientes métodos:
🍗 Constructor, métodos get y set.
🏴‍☠️ boolean añade(Propiedad ob): Método al cual le llegue una propiedad y la añada a la lista de
propiedades que mantiene la inmobiliaria.
🍗 Propiedad buscar(int cod). Método que permita buscar una propiedad a partir de su código en
la colección.
🍗 boolean buscar(Propiedad p). Método que comprueba si una determinada propiedad existe en
la colección.
🍗 boolean borra. Método sobrecargado que permita borrar una propiedad a partir de su código o
bien a partir del objeto Propiedad.
🍗 Método toString.
🍗 String getPropiedadesOrdenPrecio(). Método que devuelve una cadena con todas las
propiedades ordenadas por su precio. */

package ClaseInmobiliaria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import Propiedad.Propiedad;

public class Inmobiliaria  {

 
//Puede ser tipo TreeSet ya que no se permiten repetidos y tb pq hay q ordenarlos de manera acendente 

//Esto se hace en la clase propiedad

private TreeSet<Propiedad> misPropiedades = new TreeSet<Propiedad>(new AscenteCodigo());


//Getters y setters

public TreeSet<Propiedad> getMisPropiedades() {
    return this.misPropiedades;
}



public void setMisPropiedades(TreeSet<Propiedad> misPropiedades) {
    this.misPropiedades = misPropiedades;
}


//Constructor
public Inmobiliaria(){
    this.misPropiedades = new TreeSet<Propiedad>();
}

public Inmobiliaria(TreeSet<Propiedad> misPropiedades) {
    this.misPropiedades = misPropiedades;
}

//Método que añade propiedades a misPropiedades

/**
 * 
 * @param propiedades
 * @return
 */

public boolean añade(Propiedad propiedades){
    
  return this.misPropiedades.add(propiedades);  

}

//Método que busca una propiedad
/**
 * 
 * @param cod
 * @return 
 */
public Propiedad buscar (int codigo){
  /*   if(this.getMisPropiedades().isEmpty()) return null;
    
    Propiedad propAux = null;
    for (Propiedad propiedad : misPropiedades) {
        if(propiedad.getCodigo() == codigo){
            propAux = propiedad;

        }
    }
   return propAux; */


   if(this.getMisPropiedades().isEmpty()) return null;
   boolean encontrado = false;
   Iterator<Propiedad> i = misPropiedades.iterator();

   Propiedad p = null;

   while(i.hasNext() && !encontrado){
       p = i.next();

       if(p.getCodigo() == codigo){
           i.remove();
           encontrado = true;
       }
       
   }
   return p;

} 

//Método que comprueba si una propiedad existe en nuestra coleccion
/**
 * 
 * @param p
 * @return si la propiedad existe o no
 */
public boolean existe (Propiedad p){
    boolean existe = false;

/*     for (Propiedad propiedad : misPropiedades) {
        if(propiedad.equals(p)){
            existe = true;
        }
    }

    return existe; */

    while (misPropiedades.iterator().hasNext() && existe) {
        if(p.equals(misPropiedades.iterator().next())){
            existe = true;
        }
    }

    return existe;

}

//Método que borra una propiedad de nuestra coleccion
/**
 * 
 * @param propiedades
 * @return si el elemento se ha podido borrar o no
 * @throws Exception
 */
public boolean borra (Propiedad propiedades) throws Exception{

        return this.misPropiedades.remove(propiedades);
} 

public boolean borra (int codigo){
    
    if(this.getMisPropiedades().isEmpty()) return false;

    Iterator<Propiedad> i = misPropiedades.iterator();

    Propiedad p = null;
 
    while(i.hasNext()){
        p = i.next();
 
        if(p.getCodigo() == codigo){
            i.remove();
            return true;
        }
        
    }
        return false;    

}

/*toString */
@Override
public String toString() {
    return "Inmobiliaria [misPropiedades=" + misPropiedades + "]";
}


//Método que devuelve una cadena con todas las propiedades ordenadas por su precio.
/*Como me pide otro método de ordenación, tengo que crear
 * otra coleccion de otro tipo, para poder ordenarlo
 * de esta manera propuesta (precio).
 */
public List<Propiedad> getOrdenPrecio(){
    
    List<Propiedad> temp = new ArrayList<Propiedad>(this.misPropiedades);

    Collections.sort(temp,(ar0,ar1) -> 
        Float.compare(ar0.getPrecio(), ar1.getPrecio()));
        
    return temp;    

}


}