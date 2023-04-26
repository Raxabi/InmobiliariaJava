package ClaseInmobiliaria;

import java.util.Comparator;

import Propiedad.Propiedad;

public class AscenteCodigo implements Comparator<Propiedad> {

    @Override
    public int compare(Propiedad o1, Propiedad o2) {
        
        return o1.codigo - o2.codigo ;
    }

}
