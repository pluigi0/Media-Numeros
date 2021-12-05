
package MediaConteo;

import javax.swing.JOptionPane;

/*
Programita que Pide 10 numeros. 
Muestra la media de los numeros positivos
media de los negativos y 
cuenta la cantidad de ceros.
 */
public class MediaConteo {
    public static void main(String[] args) {         
    int numero, cuentaCero=0, acumuladorNega=0, acumuladorPosi =0, proNe=0, proPo=0;
    int positivo=0, negativo=0;
    
    
    for(int i = 1; i <=10; i++){
    numero = Integer.parseInt(JOptionPane.showInputDialog("Dame un numero"));
        
        if( numero  > 0){
            acumuladorPosi += numero;
            positivo++;
            proPo = acumuladorPosi / positivo;
        }
        else if (numero < 0){
            acumuladorNega += numero;
            negativo++;
            proNe = acumuladorNega / negativo;
        }
        else {
            cuentaCero++;
        }
        

    }
    JOptionPane.showMessageDialog(null, "La media de positivos: "+proPo);
    
    JOptionPane.showMessageDialog(null, "Hay "+cuentaCero+ " ceros");
    
    JOptionPane.showMessageDialog(null, "La media de los negativos: "+proNe);
   
    }
}