package br.com.karenaraujo.projetoloja.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class Cliente extends Pessoa {
@Id
@GeneratedValue
    private String id;
    private String email;
    private int dependente;

    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + id + ", email=" + email + ", dependente=" + dependente + ", salario=" + salario + ", limite=" + limite + '}';
    }
    private double salario;
    private double limite;

    public Cliente() {
    }

  
  
        public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDependente() {
        return dependente;
    }

    public void setDependente(int dependente) {
        this.dependente = dependente;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}

