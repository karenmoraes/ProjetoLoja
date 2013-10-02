package Loja;



import java.util.Date;

public class Funcionario extends Pessoa {

    private String codigo;
    private Date admissao;
    private double salario;
    private String cargo;

    public Funcionario(String codigo, Date admissao, double salario, String cargo, String nome, String cpf, String rg, Date datanascimento, int sexo, String telefone, String rua, String bairro, String cidade, int numero, String cep) {
        super(nome, cpf, rg, datanascimento, sexo, telefone, rua, bairro, cidade, numero, cep);
        this.codigo = codigo;
        this.admissao = admissao;
        this.salario = salario;
        this.cargo = cargo;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "codigo=" + codigo + ", admissao=" + admissao + ", salario=" + salario + ", cargo=" + cargo + '}';
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getAdmissao() {
        return admissao;
    }

    public void setAdmissao(Date admissao) {
        this.admissao = admissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
