package br.com.karenaraujo.projetoloja.model;

public class Venda  {

    private int qntvendido;
   
    public Venda() {
    }

   
    public Venda(int qntvendido) {
        this.qntvendido = qntvendido;
    }

    public int getQntvendido() {
        return qntvendido;
    }

    public void setQntvendido(int qntvendido) {
        this.qntvendido = qntvendido;
    }


    
    @Override
    public String toString() {
        return "Venda{" + "qntvendido=" + qntvendido + '}';
    }
}
