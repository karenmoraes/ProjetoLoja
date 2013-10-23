
package br.com.karenaraujo.projetoloja.model;

import java.util.Date;



public class AssistenciaTecnica extends Cliente {
    private Produto p = new Produto();
    private String descricao;

    public AssistenciaTecnica() {
    }

   
  

    public Produto getP() {
        return p;
    }

    public void setP(Produto p) {
        this.p = p;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "AssistenciaTecnica{" + "p=" + p + ", descricao=" + descricao + '}';
    }
    
   
    }
    
    

