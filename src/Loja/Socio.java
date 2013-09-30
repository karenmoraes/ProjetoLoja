
package Loja;


public class Socio extends Pessoa{
    private String cnpj;
    private String enpresa;
    private double investimento;

    public double getInvestimento() {
        return investimento;
    }

    public void setInvestimento(double investimento) {
        this.investimento = investimento;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEnpresa() {
        return enpresa;
    }

    public void setEnpresa(String enpresa) {
        this.enpresa = enpresa;
    }
    
    
    
}
