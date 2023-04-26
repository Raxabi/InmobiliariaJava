package Enumeraciones;

public enum TipoPropiedad {
    LOCAL("Local comercial"),
    APARCAMIENTO("Plaza de aparcamiento"),
    VIVIENDA("Vivienda"),
    FINCA("Finca rústica"),
    SOLAR("Solar");

    /*Variable de instancia para la enumeración TipoPropiedad*/


    private String tipos; //Tipo de propiedad que van a ser nuestras propiedades

    /*Constructor, se ejecutará por cada constante definida
	 * en la enumreación  */
    
    private TipoPropiedad (String tipo){
        this.tipos = tipo; 
    } 

    /**
     * Devuélve el tipo de Propiedad que es nuestra enumaración
     * @return tipos
     */

    String getTipos() {return tipos;}
}