
package Loja;

import javax.swing.JOptionPane;

public class AssistenciaTecnica extends Cliente {
    private Produto p = new Produto();
    private String descricao;
    
    public void conserto(){
        p.getCodigo();
        p.getNome();
        p.getDatacompra();
       descricao = JOptionPane.showInputDialog("Informe o uqe precisa ser consertado ou o que não esta funcionando");
       
    }
    
    
}
