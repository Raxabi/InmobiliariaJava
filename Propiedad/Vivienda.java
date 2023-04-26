package Propiedad;

import Enumeraciones.TipoPropiedad;
import Enumeraciones.TipoVivienda;

public class Vivienda extends Propiedad {

    private TipoVivienda tipoVivienda;
    private int numeroBaños;
    private int dormitorios;



    public Vivienda(Propiedad tPropiedad, float beneficioObtenido, int codigo, float superficie, String descripcion,
            String direccion, float precio,TipoVivienda tipoVivienda,int numeroBaños,int dormitorios
            ) {

        super(TipoPropiedad.VIVIENDA, beneficioObtenido, codigo, superficie, descripcion, direccion, precio);
        
        this.tipoVivienda = tipoVivienda;
        this.numeroBaños = numeroBaños;
        this.dormitorios = dormitorios;

    }

    //Debería haber redefinido el override beneficio de la clase propiedad

    @Override
    public String toString() {

            return
            super.toString()
            + "\nTipo de vivienda :" + this.tipoVivienda
            +"\nNúmero de baños :" + this.numeroBaños
            +"\nNúmero de dormitorios :" + this.dormitorios; 

}

}