package application;

import entities.Produto;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //declarando a lista
        List<Produto> produtos = new ArrayList<>();
        while(true) {
            System.out.println("MENU");
            System.out.println("OPÇÕES:");
            System.out.println("(1). Cadastrar Produtos");
            System.out.println("(2). Listar Produtos");
            System.out.println("(3). Adicionar Produtos");
            System.out.println("(4). Remover Produtos");
            System.out.println("(0). Encerrar");
            System.out.print("Por favor digite a opção desejada: ");
            int menu = sc.nextInt();
            System.out.println();
            if (menu == 1) {
                //cadastrar produto.
                sc.nextLine();
                System.out.print("Digite o nome do Produto:");
                String nome = sc.nextLine();
                System.out.print("Digite o valor do Produto: ");
                double valor = sc.nextDouble();
                System.out.print("Digite a quantidade em estoque: ");
                int quantidade = sc.nextInt();
                //cria um objeto
                Produto produto = new Produto(nome, valor, quantidade);
                // e adiciona a lista produtos
                produtos.add(produto);
                System.out.println();
                System.out.println("Produto cadastrado!!!");
                System.out.println();
            } else if (menu == 2) {
                //Listar produtos.
                sc.nextLine();
                for(Produto p : produtos){
                    System.out.println();
                    System.out.println(p);
                    System.out.println();
                }
            } else if (menu == 3) {
                //Adiciona estoque.
                sc.nextLine();
                System.out.print("Digite o nome do Produto que deseja acrescentar ao estoque: ");
                String nome = sc.nextLine();
                for(Produto p : produtos){
                    if(nome.equals(p.getNome())){
                        System.out.print("Quantos produtos deseja acrescentara ao estoque: ");
                        int qtd = sc.nextInt();
                        p.adicionarEstoque(qtd);
                        System.out.println();
                        System.out.println("Sucesso");
                        System.out.println();
                    } else {
                        System.out.println();
                        System.out.println("!!!Nome inválido!!!");
                        System.out.println();
                    }
                }
            } else if (menu == 4) {
                // remove Estoque.
                sc.nextLine();
                System.out.print("Digite o nome do Produto que deseja Remover do Estoque: ");
                String nome = sc.nextLine();
                for(Produto p : produtos){
                    if(nome.equals(p.getNome())){
                        System.out.print("Quantos produtos deseja remover do Estoque: ");
                        int qtd = sc.nextInt();
                        p.removerEstoque(qtd);
                        System.out.println();
                        System.out.println("Sucesso");
                        System.out.println();
                    }  else {
                        System.out.println();
                        System.out.println("!!!Nome inválido!!!");
                        System.out.println();
                    }
                }
            }
            else if (menu == 0){
                System.out.println("Encerrando o Programa");
                break;
            } else {
                System.out.println("Opçao invalida");
            }
        }
        sc.close();
    }
}
