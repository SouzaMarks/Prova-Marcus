package Programa;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import Classes.Produtineos;
import Classes.Tela;

public class Programa {
    public static void main(String[] args) {
        List<Produtineos> produtos = new ArrayList<>();
        int opc = 0;
        Scanner ler = new Scanner(System.in);

do {
        Tela.exibirMenuPrincipal();
        opc = ler.nextInt();
        ler.nextLine();

switch (opc) {
case 1 /*Cadastros*/:
int opc1 = 0;
Tela.exibirMenuCadastro();
opc1 = ler.nextInt();

        switch (opc1){

case 01:
    if (produtos.isEmpty()) {
        System.out.println("Não há nenhum produtineo cadastrado");
    } else {
        System.out.println("\n=============  Produtineos  ============== ");
        for (Produtineos produto : produtos) {
        System.out.println("\n" + "->"+ produto);     
    }}
break;

case 02:
    System.out.println("\n===============================================");
    System.out.println("\n            Cadastro de Produtineos");
    System.out.println("\n===============================================");

    System.out.println("\n-> Codigo do produtineo");
    System.out.printf("\nDigite o código:");
    int codigo = ler.nextInt();
    ler.nextLine();

    System.out.println("\n-> Quantidade de produtineos adicionados");
    System.out.printf("\nDigite a quantidade:");
    int quantidade = ler.nextInt();
    ler.nextLine();

    System.out.println("\n-> Nome do produtineo adicionado");
    System.out.printf("\nDigite o nome do Produtineo:");
    String nome = ler.nextLine();

    System.out.println("\n-> Valor do produtineo");
    System.out.printf("\nValor do Produtineo:");
    double valor = ler.nextDouble();

    produtos.add(new Produtineos(codigo, quantidade, nome, valor));
    System.out.println("\n-> O produtineo foi adicionado!");

break;

case 03:
    System.out.println("\n-> Entendido, voltando ao menu!");
break;
}
break;
case 2 /*Relatórios*/:
        int opc2 = 0;
        Tela.exibirRelatorios();
        opc2 = ler.nextInt();

switch (opc2) {
        case 01:
        if (produtos.isEmpty()) {
            System.out.println("Não há nenhum produtineo cadastrado, senhor(a)");
        } else {
        System.out.printf("\n%s\n", "===========================================================================");
        System.out.printf("\t%s\t%20s\t%15s\t%12s", "Código","Produto", "Valor(R$)", "Quantidade");
        System.out.printf("\n%s\n", "===========================================================================");

for(Produtineos produto : produtos) {
        System.out.printf("\t%s\t%20s\t%15.2f\t%12d\n", produto.getCodigo(), produto.getNome(), produto.getValor(), produto.getQuantidade());
}
        DoubleSummaryStatistics stats = produtos.stream().collect(Collectors.summarizingDouble(Produtineos::getValor));
        System.out.printf("%s\n", "================================================================================");
        System.out.printf("Maior Valor: R$ %.2f\tMenor Valor: R$ %.2f\tValor Médio: R$ %.2f\n", stats.getMax(), stats.getMin(), stats.getAverage());
}
break;
        case 04:
        System.out.println("\nOkay! Aplicação encerrada...");
break;
}
break;
case 3/*Vendas*/: 
        int opc3 = -1;
        int quantidade = 0;
        Tela.exibirVendas();
        opc3 = ler.nextInt();
        ler.nextLine();
        

do {    

switch (opc3) {
        case 01:
            System.out.println("============================== AS VENDAS ============================== ");

for(Produtineos produto : produtos) {

            int qntdProdVenda;
            System.out.println("\n+ Código do produtineo a ser vendido");
            System.out.printf("\nDigite o código:");
            ler.nextLine();

            System.out.println("\n+ Digite a quantidade de produtineos vendidos");
            System.out.printf("\nDigite a quantidade:");
            qntdProdVenda = ler.nextInt();
            ler.nextLine();

if (qntdProdVenda <= quantidade) {

                System.out.println("\n+ Não temos essa quantidade em estoque, impossível completar a seguinte venda");

} else {
if (qntdProdVenda > quantidade) {

                produto.setQuantidade(produto.getQuantidade() - qntdProdVenda);
                System.out.println("\nVenda realizada com sucesso!!!");
            }
        }
        break;
 }
} 
break;
} while (opc3 != 0);
break;
        case 0:
            System.out.println("\nOkay! Aplicação encerrada...");
        break;


case 4/*Encerrando*/:
        System.out.println("\nOkay! Aplicação encerrada...");
return;

default: 
        System.out.println("\nEssa opção não conta em nosso sistema! Sorry");
return;




}
        } while (opc != 0);
ler.close();
}

}

    
