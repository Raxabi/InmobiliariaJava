/**
 * En esta clase crearemos la vista de nuestra Inmobiliaria.
 */

import Enumeraciones.*;

import java.awt.*;
//import java.lang.reflect.Array;
//import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.*;//import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
//import javax.swing.border.TitledBorder;

public class InmobiliariaVista extends JPanel{

    private JComboBox<TipoPropiedad> jcPropiedad;
    private JComboBox<TipoVivienda> jcVivienda;
    private JComboBox<TipoTerreno> jcTerreno;
    private JComboBox<Integer> numDormitorios,numBanios;
    private JTextField jtCodigo,jtPrecio,jtDireccion,jtSuperficie;
    private JTextArea jtaDescripcion;
    private JRadioButton luzSi,luzNo,aguaSi,aguaNo,viviendaSi,viviendaNo;
    private JButton jbGuardar,jbBorrar,jbLimpiar;

    public InmobiliariaVista(){
        JPanel panMain = new JPanel();
        panMain.setLayout(new BoxLayout(panMain,BoxLayout.Y_AXIS));

        panMain.add(panelDGenerales());
        panMain.add(panelViviendas());
        panMain.add(panelFincas());
        panMain.add(panelInferior());
      
        panMain.setPreferredSize(new Dimension(600,550));

		panMain.setBorder(new EmptyBorder(10,10,10,10));
		this.add(panMain);
    }

    private JPanel panelDGenerales(){

       JLabel jlCodigo = new JLabel("Código :"); 
       this.jtCodigo = new JTextField(3);
       this.jtCodigo.setHorizontalAlignment(SwingConstants.RIGHT);

       JLabel jlPropiedad = new JLabel("Tipo Propiedad :");
       this.jcPropiedad = new JComboBox<TipoPropiedad>(TipoPropiedad.values());
       this.jcPropiedad.setSelectedItem(TipoPropiedad.FINCA);

       JLabel jlPrecio = new JLabel("Precio :");
       this.jtPrecio = new JTextField(5);
       this.jtPrecio.setText("0");
       this.jtPrecio.setHorizontalAlignment(SwingConstants.RIGHT);

       JLabel jlSuperficie = new JLabel("Superfice :");
       this.jtSuperficie = new JTextField(5);
       this.jtSuperficie.setText("0");
       this.jtSuperficie.setHorizontalAlignment(SwingConstants.RIGHT);

       JLabel jlDireccion = new JLabel("Direccion :");
       this.jtDireccion = new JTextField(40);
       this.jtDireccion.setHorizontalAlignment(SwingConstants.RIGHT);

       JLabel jlDescripcion = new JLabel("Descripcion :");
       this.jtaDescripcion = new JTextArea();
       this.jtaDescripcion.setPreferredSize(new Dimension(450,60));

       JPanel jpDGeneral = new JPanel(); 
       jpDGeneral.setLayout(new FlowLayout());
       jpDGeneral.setPreferredSize(new Dimension(300,115)); 

       jpDGeneral.add(jlCodigo);
       jpDGeneral.add(jtCodigo);
       jpDGeneral.add(jlPropiedad);
       jpDGeneral.add(jcPropiedad);
       jpDGeneral.add(jlPrecio);
       jpDGeneral.add(jtPrecio);
       jpDGeneral.add(jlSuperficie);
       jpDGeneral.add(jtSuperficie);
       jpDGeneral.add(jlDireccion);
       jpDGeneral.add(jtDireccion);
       jpDGeneral.add(jlDescripcion);
       jpDGeneral.add(jtaDescripcion);  

      estableceBorde(jpDGeneral,"Datos generales");

       return jpDGeneral;
    }

  private JPanel panelViviendas(){
    JLabel jlVivienda = new JLabel("Tipo de vivienda :");
    this.jcVivienda = new JComboBox<TipoVivienda>(TipoVivienda.values());
    jcVivienda.setEnabled(false);

    JLabel jlDormitorios = new JLabel("Número Dormitorios :");
    this.numDormitorios = new JComboBox<Integer>();
    numDormitorios.setEnabled(false);

    JLabel jlBanios = new JLabel("Número Baños");
    this.numBanios = new JComboBox<Integer>();
    numBanios.setEnabled(false);

    JPanel jpViviendas = new JPanel(new FlowLayout());
    jpViviendas.setPreferredSize(new Dimension(300,20)); 

    jpViviendas.add(jlVivienda);
    jpViviendas.add(jcVivienda);
    jpViviendas.add(jlDormitorios);
    jpViviendas.add(numDormitorios);
    jpViviendas.add(jlBanios);
    jpViviendas.add(numBanios);

    estableceBorde(jpViviendas, "Datos específicos para las viviendas");

    return jpViviendas;
  }

  private JPanel panelFincas(){
    JLabel jlTerreno = new JLabel("Tipo terreno: ");
    this.jcTerreno = new JComboBox<TipoTerreno>(TipoTerreno.values());
    
    JLabel jlElectricidad = new JLabel("Suministro eléctrico:");
    ButtonGroup bgElectricidad = new ButtonGroup();
    this.luzSi = new JRadioButton("Si");
    this.luzNo = new JRadioButton("No");
    bgElectricidad.add(luzSi);
    bgElectricidad.add(luzNo);
    luzSi.setSelected(true);

    JPanel panelElectricidad = new JPanel();
    panelElectricidad.add(luzSi);
    panelElectricidad.add(luzNo);

    JLabel jlAgua = new JLabel("Suministro agua:");
    ButtonGroup bgAgua = new ButtonGroup();
    this.aguaSi = new JRadioButton("Si");
    this.aguaNo = new JRadioButton("No");
    bgAgua.add(aguaSi);
    bgAgua.add(aguaNo);
    aguaSi.setSelected(true);

    JPanel panelAgua = new JPanel();
    panelAgua.add(aguaSi);
    panelAgua.add(aguaNo);

    JLabel jlDvivienda = new JLabel("Dispone vivienda:");
    ButtonGroup bgVivienda = new ButtonGroup();
    this.viviendaSi = new JRadioButton("Si");
    this.viviendaNo = new JRadioButton("No");
    bgVivienda.add(viviendaSi);
    bgVivienda.add(viviendaNo);
    viviendaSi.setSelected(true);

    JPanel panelVivienda = new JPanel();
    panelVivienda.add(viviendaSi);
    panelVivienda.add(viviendaNo);

    JPanel jpFinca = new JPanel(new GridLayout(4,1));
   // jpFinca.setPreferredSize(new Dimension(300,30)); 
    
    jpFinca.add(jlTerreno);
    jpFinca.add(jcTerreno);
    jpFinca.add(jlElectricidad);
    jpFinca.add(panelElectricidad);
    jpFinca.add(jlAgua);
    jpFinca.add(panelAgua);
    jpFinca.add(jlDvivienda);
    jpFinca.add(panelVivienda);
  
    estableceBorde(jpFinca,"Datos específicos para fincas rústicas");
    return jpFinca;

  }

  private JPanel panelInferior(){
    this.jbGuardar = new JButton("Guardar propiedad");
    this.jbBorrar = new JButton("Borrar propiedad");
    this.jbLimpiar = new JButton("Limpiar formulario");
    
    JPanel jpBotones = new JPanel(new FlowLayout());
    jpBotones.setPreferredSize(new Dimension(300,20)); 

    jpBotones.add(jbGuardar);
    jpBotones.add(jbBorrar);
    jpBotones.add(jbLimpiar);
    
    estableceBorde(jpBotones,"Operaciones disponibles");
    return jpBotones;

  }


  /**
* Método que coloca un borde compuesto a un panel
* - Un borde vacío
* - Y un borde con línea y texto
*
* @param p --> Panel para ponerle el borde
* @param textoBorde --> Texto que vamos a poner en la leyenda del borde
*/
private void estableceBorde(JPanel p, String textoBorde) {
  p.setBorder(new CompoundBorder(
  new EmptyBorder(5,5,5,5),
  new TitledBorder(new LineBorder(Color.gray,1,true),textoBorde))
  );
  }

  public void controlador() {
    InmobiliariaControlador controlasion = new InmobiliariaControlador(this);
    this.jbLimpiar.addActionListener(controlasion);
    this.jbBorrar.addActionListener(controlasion);
}


  //Getters y Setters

  public JComboBox<TipoPropiedad> getJcPropiedad() {
    return jcPropiedad;
  }

  public void setJcPropiedad(JComboBox<TipoPropiedad> jcPropiedad) {
    this.jcPropiedad = jcPropiedad;
  }

  public JComboBox<TipoVivienda> getJcVivienda() {
    return jcVivienda;
  }

  public void setJcVivienda(JComboBox<TipoVivienda> jcVivienda) {
    this.jcVivienda = jcVivienda;
  }

  public JComboBox<TipoTerreno> getJcTerreno() {
    return jcTerreno;
  }

  public void setJcTerreno(JComboBox<TipoTerreno> jcTerreno) {
    this.jcTerreno = jcTerreno;
  }

  public JComboBox<Integer> getNumDormitorios() {
    return numDormitorios;
  }

  public void setNumDormitorios(JComboBox<Integer> numDormitorios) {
    this.numDormitorios = numDormitorios;
  }

  public JComboBox<Integer> getNumBanios() {
    return numBanios;
  }

  public void setNumBanios(JComboBox<Integer> numBanios) {
    this.numBanios = numBanios;
  }

  public JTextField getJtCodigo() {
    return jtCodigo;
  }

  public void setJtCodigo(JTextField jtCodigo) {
    this.jtCodigo = jtCodigo;
  }

  public JTextField getJtPrecio() {
    return jtPrecio;
  }

  public void setJtPrecio(JTextField jtPrecio) {
    this.jtPrecio = jtPrecio;
  }

  public JTextField getJtDireccion() {
    return jtDireccion;
  }

  public void setJtDireccion(JTextField jtDireccion) {
    this.jtDireccion = jtDireccion;
  }

  public JTextField getJtSuperficie() {
    return jtSuperficie;
  }

  public void setJtSuperficie(JTextField jtSuperficie) {
    this.jtSuperficie = jtSuperficie;
  }

  public JTextArea getJtaDescripcion() {
    return jtaDescripcion;
  }

  public void setJtaDescripcion(JTextArea jtaDescripcion) {
    this.jtaDescripcion = jtaDescripcion;
  }

  public JRadioButton getLuzSi() {
    return luzSi;
  }

  public void setLuzSi(JRadioButton luzSi) {
    this.luzSi = luzSi;
  }

  public JRadioButton getLuzNo() {
    return luzNo;
  }

  public void setLuzNo(JRadioButton luzNo) {
    this.luzNo = luzNo;
  }

  public JRadioButton getAguaSi() {
    return aguaSi;
  }

  public void setAguaSi(JRadioButton aguaSi) {
    this.aguaSi = aguaSi;
  }

  public JRadioButton getAguaNo() {
    return aguaNo;
  }

  public void setAguaNo(JRadioButton aguaNo) {
    this.aguaNo = aguaNo;
  }

  public JRadioButton getViviendaSi() {
    return viviendaSi;
  }

  public void setViviendaSi(JRadioButton viviendaSi) {
    this.viviendaSi = viviendaSi;
  }

  public JRadioButton getViviendaNo() {
    return viviendaNo;
  }

  public void setViviendaNo(JRadioButton viviendaNo) {
    this.viviendaNo = viviendaNo;
  }

  public JButton getJbGuardar() {
    return jbGuardar;
  }

  public void setJbGuardar(JButton jbGuardar) {
    this.jbGuardar = jbGuardar;
  }

  public JButton getJbBorrar() {
    return jbBorrar;
  }

  public void setJbBorrar(JButton jbBorrar) {
    this.jbBorrar = jbBorrar;
  }

  public JButton getJbLimpiar() {
    return jbLimpiar;
  }

  public void setJbLimpiar(JButton jbLimpiar) {
    this.jbLimpiar = jbLimpiar;
  }

 
}