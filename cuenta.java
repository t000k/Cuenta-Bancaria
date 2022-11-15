
package cuentas;

import javax.swing.JOptionPane;

public class cuenta {
    String nombre;
    double monto;
    
    public cuenta(String nombre,double monto){
        this.nombre = nombre;
        this.monto = monto;
    
    }
    public cuenta(){
    
    }
    public void inInfo(){
        nombre= JOptionPane.showInputDialog(null,"Nombre de la persona: ");
       String sMonto;
       sMonto= JOptionPane.showInputDialog(null,"Ingrese el monto a depositar: ");
        monto = Integer.parseInt(sMonto);
    }
    
    public String getInfo(){
         String str = " ";
        str += "Nombre: "+nombre+"\n";
        str += "Saldo: "+monto+"\n";
        
        return str;
    }
    
    public double consultarMonto(){
    
    return monto;
    }
    
    public void depositar(double cant){
        monto +=cant;
   
    }
    public void retirar(double cant){
        if(validarRetiro(cant)==true){
        monto -=cant;
        JOptionPane.showMessageDialog(null,"Transaccion exitosa");
        }else{
            JOptionPane.showMessageDialog(null,"No tienen el saldo suficiente para esta transaccion");
        }
    
    }
    
    public boolean validarRetiro(double cantidad){
        boolean flag = true;
        if(cantidad>monto){
            flag=false;
        }
        return flag;
    }
    
    public void transferir(String nombre, double canti){
        retirar(canti);
        if (validarRetiro(canti)==true){
         JOptionPane.showMessageDialog(null,"Tansferencia de: \n"+canti+" \na: "+nombre+" \nexitosa");
        }
        
        
        
        
        
    
    }
    
}
