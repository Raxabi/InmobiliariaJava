/* Diseñar una clase llamada PROPIEDAD, en la que al menos aparezcan los siguientes métodos:
 Constructor, métodos get y set.
 Método que calcule el beneficio.
 Método para poder comparar si dos propiedades son iguales. Se considerará que dos propiedades
son iguales si coincide si código.
 Redefinición del método toString, que devuelva la información sobre una propiedad con un
formato similar al siguiente:
LOCAL COMERCIAL
Beneficio obtenido: 600.0€
Código: 23
Superficie: 70.0 metros cuadrados
Descripción: El local no tiene baño e instalaciones de agua, luz y teléfono
Dirección: C/Infante, 45
Precio: 60000.0 €
 */
package Propiedad;

import Enumeraciones.TipoPropiedad;

public class Propiedad implements Comparable<Propiedad> {
   private Propiedad tPropiedad;
   private float beneficioObtenido;
   public int codigo;
   private float superficie;
   private String descripcion;
   private String direccion;
   public float precio;


     //Constructor

     public Propiedad(Propiedad tPropiedad,float beneficioObtenido, int codigo, float superficie, String descripcion, String direccion,float precio) {
            this.tPropiedad = tPropiedad;
            this.beneficioObtenido = beneficioObtenido;
            this.codigo = codigo;
            this.superficie = superficie;
            this.descripcion = descripcion;
            this.direccion = direccion;
            this.precio = precio;
    }

    public Propiedad(TipoPropiedad especiales, float beneficioObtenido2, int codigo2, float superficie2, String descripcion2,
    String direccion2, float precio2) {
    }
  
    //Getters y Setter

    public float getBeneficioObtenido() {
        return beneficioObtenido;
    }

    public void setBeneficioObtenido(float beneficioObtenido) {
        this.beneficioObtenido = beneficioObtenido;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getSuperficie() {
        return superficie;
    }

    public void setSuperficie(float superficie) {
        this.superficie = superficie;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

   
    //Método que calcule el beneficio
    //No le tendría que haber pasado el tipo de propiedad, tendría que haber redefinido
    public float calculoBeneficio(TipoPropiedad tipoPropiedad){

        float casosGenerales = (this.precio * (0.75f/100))+150;

        //Mover esto a la clase VIVIENDA y clase FINCA que tenemos que crear

      if(tipoPropiedad == TipoPropiedad.VIVIENDA){
        float totalV = casosGenerales + (this.precio*(0.25f/100));
        return totalV;
      }

      if(tipoPropiedad == TipoPropiedad.FINCA){
        float totalF = casosGenerales + (this.precio*(0.5f/100));
        return totalF;
      }

      else return casosGenerales;


    }

    //Método que sirve para saber si dos propiedades son iguales
    //Lo podemos hacer con un compareTo
    @Override
    public int compareTo (Propiedad arg0){
        return this.codigo - arg0.getCodigo();
        //return Integer.valueof(this.codigo).compareTo(Integer.valueof(arg0.getCodigo()));
    } 

   //Método toString

    @Override
    public String toString() {
        return 
            this.tPropiedad 
            + "\n"
            +"\nBeneficio obtenido :" + beneficioObtenido 
            + "\nCódigo :" + codigo
            + "\nSuperficie :" + superficie
            + "\nDescripcion :" + descripcion 
            + "\nDireccion :" + direccion 
            + "\nPrecio :" + precio;
    }

    //equals and hashCode

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((tPropiedad == null) ? 0 : tPropiedad.hashCode());
        result = prime * result + Float.floatToIntBits(beneficioObtenido);
        result = prime * result + codigo;
        result = prime * result + Float.floatToIntBits(superficie);
        result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
        result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
        result = prime * result + Float.floatToIntBits(precio);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Propiedad other = (Propiedad) obj;
        if (tPropiedad == null) {
            if (other.tPropiedad != null)
                return false;
        } else if (!tPropiedad.equals(other.tPropiedad))
            return false;
        if (Float.floatToIntBits(beneficioObtenido) != Float.floatToIntBits(other.beneficioObtenido))
            return false;
        if (codigo != other.codigo)
            return false;
        if (Float.floatToIntBits(superficie) != Float.floatToIntBits(other.superficie))
            return false;
        if (descripcion == null) {
            if (other.descripcion != null)
                return false;
        } else if (!descripcion.equals(other.descripcion))
            return false;
        if (direccion == null) {
            if (other.direccion != null)
                return false;
        } else if (!direccion.equals(other.direccion))
            return false;
        if (Float.floatToIntBits(precio) != Float.floatToIntBits(other.precio))
            return false;
        return true;
    }
  
}