package Loja;

import java.util.Date;




public class Cliente extends Pessoa {

    private String codigo;
    private String email;
    private int dependente;

    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + ", email=" + email + ", dependente=" + dependente + ", salario=" + salario + ", limite=" + limite + '}';
    }
    private double salario;
    private double limite;

    public Cliente(String codigo, String email, int dependente, double salario, double limite, String nome, String cpf, String rg, Date datanascimento, int sexo, String telefone, String rua, String bairro, String cidade, int numero, String cep) {
        super(nome, cpf, rg, datanascimento, sexo, telefone, rua, bairro, cidade, numero, cep);
        this.codigo = codigo;
        this.email = email;
        this.dependente = dependente;
        this.salario = salario;
        this.limite = limite;
    }

  
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

