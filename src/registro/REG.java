package registro;

import javax.swing.JOptionPane;

public class REG {


public REG (){
   
}
    int DIA = 0;
    int MES = 0;
    int AÑO = 0;
   String ciudad=" ";
   String departamento=" ";
   String genero="";
   String ocupacion="";

public void getfecha(String a , String b ,String c){
        
DIA = Integer.parseInt(a);
MES=Integer.parseInt(b);
AÑO=Integer.parseInt(c);
}
public void getciuidad (String ciu){
    ciudad=ciu ;
}
public void getdepartamento(String dep){
    departamento=dep;
}
public void getgenero(String gen){
    genero=gen;
}
public void getocupacion(String ocup){
    ocupacion=ocup;
}
public  void getmostrar(){
    JOptionPane.showMessageDialog(null,"DIA  "+DIA+" / "+"MES  "+MES+" / "+"AÑO  "+" "+AÑO);
    JOptionPane.showMessageDialog(null,"CIUDAD "+ciudad+ "\n"+"DEPARTAMENTO "+departamento+"\n" );
    JOptionPane.showMessageDialog(null,"El genero es: "+genero+"\n");
    JOptionPane.showMessageDialog(null,"La ocupacion es: "+ocupacion+"\n" );
}




    
}
