
package br.com.karenaraujo.projetoloja.model;



public class AssistenciaTecnica  {
  
    private Produto pro;
    private String descricao;

    public AssistenciaTecnica() {
    }

    public Produto getP() {
        return pro;
    }

    public void setP(Produto p) {
        this.pro = p;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

   
  


    @Override
    public String toString() {
        return "AssistenciaTecnica{" + "p=" + pro + ", descricao=" + descricao + '}';
    }
    
   
    }
    
    

