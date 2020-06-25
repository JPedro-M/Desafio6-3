package desafio6.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author troll
 */
public class Desafio63 {
    public static void main(String[] args) {
        int contagem, numero, numDentro, numFora;
        
        numDentro = 0;
        numFora = 0;
        contagem = 1;
        while(contagem <= 10){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
            if(numero>=10 && numero<=20){
                numDentro += 1;
            }else{
                numFora += 1;
            }
            contagem += 1;
        }
        
        JOptionPane.showMessageDialog(null,"Dentro do intervalo de  10 e 20 existem: "+numDentro+"\nFora do intervalo existem: "+numFora);    
    }    
}