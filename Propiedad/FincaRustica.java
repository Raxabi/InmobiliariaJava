package Propiedad;

import Enumeraciones.TipoPropiedad;
import Enumeraciones.TipoTerreno;

/*La o las clases que consideres necesarias para guardar la información de aquellas propiedades que
tengan “características especiales”, como por ejemplo las fincas rústicas. Esta o estas clases deben
proporcionar, como mínimo, los mismos métodos que la clase Propiedad, en el caso de la redefinición
del método toString, se debe añadir la información sobre esas “características especiales”. */

//Esta es una clase especial Tipo Finca Rustica
/*fincas rústicas también interesa conocer el
tipo de terreno (por ejemplo regadío, secano, olivos, etc.), y si dispone de luz, agua y vivienda.  */
public class FincaRustica extends Propiedad {

    private TipoTerreno tipoTerreno;
    private boolean luz;
    private boolean agua;
    private String vivienda;

    public FincaRustica(Propiedad tPropiedad, float beneficioObtenido, int codigo, float superficie, String descripcion,
            String direccion, float precio,TipoTerreno tipoTerreno,boolean luz,boolean agua) {

        super(TipoPropiedad.FINCA,beneficioObtenido, codigo, superficie, descripcion, direccion, precio);

        this.tipoTerreno = tipoTerreno;
        this.luz = luz;
        this.agua = agua;
        
    }
    
    @Override
    public String toString() {

            return
             super.toString()
              + "\nTipo de terreno :" + this.tipoTerreno
              +"\n Luz :" + (luz == true?"si":"no")
              +"\n Agua :" + (agua == true?"si":"no")
              +"\n Vivienda :" + this.vivienda;

              //Repito lo mismo del beneficio
    
}
}
