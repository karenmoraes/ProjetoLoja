package Loja;




public class Fornecedor extends CategoriaProduto {

    private String nome;
    private String cnpj;
    private String telefone;

    @Override
    public String toString() {
        return "Fornecedor{" + "nome=" + nome + ", cnpj=" + cnpj + ", telefone=" + telefone + '}';
    }

    public Fornecedor(){
        
    }
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}