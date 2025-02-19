package aulaheranca;

import javax.swing.JOptionPane;

/**
 *
 * @author adaltoss
 */
public class Carro extends Veiculo{
    
    public int qtdPortas;
    private double tamPortaMalas;
    
    public Carro(){
        super();
    }
    
    public Carro(String marca, int ano, int qtdPortas){
        super(marca, ano);
        this.qtdPortas = qtdPortas;
        super.setId();
    }
    
    public void setTamPortaMalas(double tamanho){
        if( tamanho > 0 ){
            this.tamPortaMalas = tamanho;
        }
    }
    
    public void imprimir(){
        String texto = "Marca: " + this.marca;
        texto += "\nPortas: " + this.qtdPortas;
        texto += "\nTamanho do Porta-Malas: " 
                + this.tamPortaMalas;
        texto += "\nAno: " + this.ano;
        texto += "\nId: " + this.getId();
        JOptionPane.showMessageDialog(null, texto);
    }
}








