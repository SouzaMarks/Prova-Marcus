package Classes;

public class Vendas {
    static int dataVenda;
    int qntVenda;

    public static int getDataVenda() {
        return dataVenda;
    }
    public void setDataVenda(int dataVenda) {
        Vendas.dataVenda = dataVenda;
    }
    public int getQntVenda() {
        return qntVenda;
    }
    public void setQntVenda(int qntVenda) {
        this.qntVenda = qntVenda;
    }
}

