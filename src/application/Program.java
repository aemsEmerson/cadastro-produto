package application;

import entities.Produto;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do Produto: ");
        String nome = sc.nextLine();
        System.out.print("Digite o valor do Produto: ");
        double preco = sc.nextDouble();
        System.out.print("Digite a Quantidade: ");
        int quantidade = sc.nextInt();

        Produto produto = new Produto(nome, preco, quantidade);
        System.out.println(produto);

        System.out.print("Deseja adicionar produtos ao estoque? (s/n): ");
        char resp = sc.next().charAt(0);
        if(resp == 's'){
            System.out.print("Digite a quantidade: ");
            quantidade = sc.nextInt();
            produto.adicionarEstoque(quantidade);
        }
        System.out.println(produto);

        System.out.print("Deseja remover produtos do estoque (s/n): ");
        resp = sc.next().charAt(0);
        if (resp == 's'){
            System.out.print("Digite a quantidade: ");
            quantidade = sc.nextInt();
            produto.removerEstoque(quantidade);
        }
        System.out.println(produto);

        sc.close();
    }
}
