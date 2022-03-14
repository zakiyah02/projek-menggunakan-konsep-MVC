
package edu.zakiyah.latihanmvc.controller;

import edu.zakiyah.latihanmvc.model.pelangganmodel;
import edu.zakiyah.latihanmvc.view.pelangganview;

public class pelanggancomtroller {
    
    private pelangganmodel model;

    public void setModel(pelangganmodel model) {
        this.model = model;
    }
    
    
    public void resetForm(pelangganview view){
        
        String Nama = view.getTxtnama().getText();
        String Email = view.getTxtemail().getText();
        String NomorTelp = view.getTxtnomor().getText();
        
        if (Nama.equals("") && Email.equals("") && NomorTelp.equals("")){
        } else {
           model.resetForm();
        }
    
    }
    
   
    public void simpanForm(pelangganview view){
        String Nama = view.getTxtnama().getText();
        String Email = view.getTxtemail().getText();
        String NomorTelp = view.getTxtnomor().getText();
        
        if (Nama.trim().equals("")){
            JOptionsPane.showMassageDialog(view, "Nama Masih Kosong");
        } else if (Email.trim().equals("")){
            JOptionsPane.showMassageDialog(view, "Email Masih Kosong");
        }else if (NomorTelp.trim().equals("")){
            JOptionsPane.showMassageDialog(view, "NomorTelp Masih Kosong");
        }else{
            model.simpanForm();
        }
    }
}
