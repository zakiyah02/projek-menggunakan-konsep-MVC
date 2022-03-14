/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.zakiyah.latihanmvc.model;

import edu.zakiyah.latihanmvc.event.pelangganListener;
import edu.zakiyah.latihanmvc.view.pelangganview;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class pelangganmodel {
    private String nama;
    private String email;
    private String nomorTelp;
    
    private pelangganListener pelangganListener;

    public pelangganListener getPelangganListener() {
        return pelangganListener;
    }
    

    public String getNama() {
        return nama;
    }
    public void setNama(String nama){
        this.nama=nama;
        fireOnChange();
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email){
        this.email=email;
        fireOnChange();
    }

    public String getNomorTelp() {
        return nomorTelp;
    }
    public void setnomorTelp(String nomorTelp){
        this.nomorTelp=nomorTelp;
        fireOnChange();
    }
    
    protected void fireOnChange(){
        if (pelangganListener!=null){
            pelangganListener.onChange(this);
            
        }
    }
    
    public void resetForm(){
        setNama("");
        setEmail("");
        setnomorTelp("");
        
    }
    
    public void simpanForm(){
        JOptionPane.showMessageDialog(null,"Berhasil Disimpan");
    
    }

    public void setpelangganListener(pelangganview aThis) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
