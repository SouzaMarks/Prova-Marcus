package Classes;

public class Produtineos {
    int codigo, quantidade;
    String nome;
    double valor;

    public Produtineos(int codigo, int quantidade, String nome, double valor) {
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.nome = nome;
        this.valor = valor;
    }
    @Override
    public String toString() {
        return "Produtineos:" + "\n > Código = "  + codigo + "\n > Nome = " + nome + "\n > Quantidade = " + quantidade + "\n > Valor = " + valor;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}

