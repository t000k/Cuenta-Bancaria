
package cuentas;

import javax.swing.JOptionPane;

public class menu {
    String opciones[];
    final int SALIR =6;
    cuenta p1 = new cuenta();
    
    public menu(){
        opciones = new String[6];
        opciones[0] = "Alta de cuenta";
        opciones[1] = "Depositar";
        opciones[2] = "Retirar";
        opciones[3] = "Transferir";
        opciones[4] = "Consultar saldo";
        opciones[5] = "Salir";
    }
    
    public String desplegarOpciones(){
        String str="";
        int nOpc;
        for (int i = 0; i <opciones.length; i++) {
            nOpc = i+1;
            str += nOpc +"."+ opciones[i]+"\n";
        }
        return str;
    }
    
    public void procesarOpcion(int opc){
        
          
        switch(opc){
            case 1:
                JOptionPane.showMessageDialog(null,"Ha seleccionado: Alta de cuenta...");
                p1.inInfo();
                JOptionPane.showMessageDialog(null, p1.getInfo());
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Ha seleccionado: Despositar...");
                String sdeposito;
                sdeposito=JOptionPane.showInputDialog(null,"Monto a depositar: ");
                double deposito = Double.parseDouble(sdeposito);
                p1.depositar(deposito);
                JOptionPane.showMessageDialog(null, p1.getInfo());
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"Ha seleccionado: Retirar...");
                String sretiro;
                sretiro = JOptionPane.showInputDialog(null,"Monto a retirar: ");
                double retiro = Double.parseDouble(sretiro);
                p1.retirar(retiro);
                 JOptionPane.showMessageDialog(null, p1.getInfo());
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"Ha seleccionado: Transeferir...");
                String nombree;
                nombree= JOptionPane.showInputDialog(null,"Nombre de la persona a transferir: ");
                String sTransferencia;
                sTransferencia = JOptionPane.showInputDialog(null,"Monto a transferir: ");
                double tranfer = Double.parseDouble(sTransferencia);
                p1.transferir(nombree,tranfer);
                JOptionPane.showMessageDialog(null, p1.getInfo());
            
                
                
                
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"Ha seleccionado: Consultar saldo...");
                JOptionPane.showMessageDialog(null, p1.getInfo());
                break;
            case 6:
                JOptionPane.showMessageDialog(null,"Ha seleccionado: Salir...");
                break;
        }
      } 
    
    public void desplegarMenuJOP(){
        int opcSelected;
        String OpcionStr;
        do{
            OpcionStr= JOptionPane.showInputDialog(null,desplegarOpciones());
            opcSelected=Integer.parseInt(OpcionStr);
            procesarOpcion(opcSelected);
        }while(opcSelected !=SALIR);
        JOptionPane.showMessageDialog(null, "Saliendo...Gracias!!");
    }
    
}
   

