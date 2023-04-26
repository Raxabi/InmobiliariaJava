import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import ClaseInmobiliaria.Inmobiliaria;
import Enumeraciones.*;
import Propiedad.Propiedad;

public class InmobiliariaControlador implements ItemListener,ActionListener {
    /**
     * Variables de instancia
     */
    private InmobiliariaVista miVista;

    public InmobiliariaControlador(InmobiliariaVista miVista) {
        this.miVista = miVista;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton bp = (JButton)e.getSource();
        try {
            Inmobiliaria inmEventos= new Inmobiliaria();
            if(bp == this.miVista.getJbLimpiar()){
         
                this.miVista.getJtCodigo().setText(" ");
                this.miVista.getJcPropiedad().setSelectedItem(TipoPropiedad.FINCA);
                this.miVista.getJtPrecio().setText("0");
                this.miVista.getJtSuperficie().setText("0");
                this.miVista.getJtDireccion().setText(" ");
                this.miVista.getJtaDescripcion().setText(" ");
                this.miVista.getJcTerreno().setSelectedItem(TipoTerreno.REGADIO);
                this.miVista.getLuzSi().setSelected(true);
                this.miVista.getAguaSi().setSelected(true);
                this.miVista.getViviendaSi().setSelected(true);
    
                JOptionPane.showMessageDialog(miVista, "El formulario ha sido borrado y/o restablecido");
            } else if(bp == miVista.getJbBorrar()){
                 
                boolean borrado = inmEventos.borra(Integer.valueOf(miVista.getJtCodigo().getText()));

                if(borrado){
                    JOptionPane.showMessageDialog(miVista, "La propiedad ha sido borrada");  
                } 
                
            }
        } catch (Exception except) {
            // TODO: handle exception
        }
        
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
      
    }


}
