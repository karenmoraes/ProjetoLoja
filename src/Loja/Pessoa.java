package Loja;



import java.util.Date;


public class Pessoa extends Endereco{
    
    private String nome;
    private String cpf;
    private String rg;
    private Date datanascimento;
    private int sexo;
    private String telefone;

    

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", datanascimento=" + datanascimento + ", sexo=" + sexo + ", telefone=" + telefone + '}';
    }

    public Pessoa(String nome, String cpf, String rg, Date datanascimento, int sexo, String telefone, String rua, String bairro, String cidade, int numero, String cep) {
        super(rua, bairro, cidade, numero, cep);
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.datanascimento = datanascimento;
        this.sexo = sexo;
        this.telefone = telefone;
    }
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(Date datanascimento) {
        this.datanascimento = datanascimento;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
   
    
}
