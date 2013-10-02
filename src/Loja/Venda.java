
package Loja;

import javax.swing.JOptionPane;

public class Venda extends Produto{   
    private int qntvendido;
    private Cliente c = new Cliente();
    private CategoriaProduto p = new CategoriaProduto();
    
    public void clientecompra(){
        c.getNome();
        c.getSexo();
        c.getCodigo();
        c.getLimite();
        qntvendido = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade do produto comprado"));
        p.setNome("Informe o nome do produto");
        p.setCodigo("Informe o código do produto");
        
    }
    public void funcionariovenda(double total){
        total = qntvendido + (p.getValor()*0.10);
        JOptionPane.showMessageDialog(null, "O funcionario ganhou " + total + " comissão ");
              
        
    }
    
}
