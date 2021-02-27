package projetohash;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import java.util.*;

public class ProjetoHash {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int i = 1;
        int j = 0;
        double entrada = 0;

        Caixa Cadastro = new Caixa(i);

        Caixa MeuCaixa;
        Produto MeuProduto;

        while (true) {

            System.out.print("|------------------------------------------|\n");
            System.out.print("| Opção 1 - Adicionar Produto              |\n");     // JA FOI
            System.out.print("| Opção 2 - Sair Produto                   |\n");     // JA FOI - PRODUTO VENDIDO
            System.out.print("| Opção 3 - Remover Produto                |\n");     // JA FOI - PRODUTO REMOVIDO
            System.out.print("| Opção 4 - Listar Produtos                |\n");     // JA FOI
            System.out.print("| Opção 5 - Valor em caixa                 |\n");     // JA FOI
            System.out.print("| Opção 6 - Sair                           |\n");     // JA FOI
            System.out.print("|------------------------------------------|\n");
            System.out.print("Digite uma opção: ");

            int opcao = S.nextInt();
            ConsoleClear();

            if (opcao == 6) {
                System.out.print("\nEncerrando...");
                S.close();
            }

            switch (opcao) {
                case 1:
                    System.out.print("\n========== CADASTRO PRODUTO ==========\n");

                    MeuProduto = new Produto(j);
                    MeuProduto.LêProduto();
                    entrada += MeuProduto.Valor;
                    Cadastro.GravaDados(MeuProduto);
                    ConsoleClear();
                    break;

                case 2:
                    System.out.print("\n========== SAIDA PRODUTO ==========\n");
                    entrada = Cadastro.SaidaProduto(entrada);
                    ConsoleClear();
                    break;

                case 3:
                    System.out.print("\n========== REMOVE PRODUTO ==========\n");
                    Cadastro.RemoveProduto();
                    ConsoleClear();
                    break;

                case 4:
                    System.out.print("\n========== LISTAR PRODUTOS ==========\n");
                    Cadastro.ListaProdutos();
                    System.out.print("======================================\n");
                    System.out.print("\nPRESSIONE ENTER PARA RETORNAR AO MENU.\n");
                    S.nextLine();
                    S.nextLine();
                    ConsoleClear();
                    break;
                    
                    
                case 5:
                    if (entrada<=0){
                        System.out.print("\n========== VALOR EM CAIXA ==========\n");
                        System.out.println("VOCÊ TEM UM LUCRO DE "+(entrada*(-1))+"!");
                        System.out.print("======================================\n");
                        break;
                    }
                    if (entrada>0){
                        System.out.print("\n========== VALOR EM CAIXA ==========\n");
                        System.out.println("VOCÊ TEM UM PREJUIZO ATUAL DE: "+entrada+"");
                        System.out.print("======================================\n");
                        break;
                    }
                    

                default:
                    System.out.print("\n============================================");
                    System.out.print("\nNAO EXISTE ESSA OPCAO, ENTER PARA RETORNAR");
                    System.out.print("\n============================================\n");
                    S.nextLine();
                    S.nextLine();
                    ConsoleClear();
                    break;
            }

        }

    }

    static void ConsoleClear() {
        try {
            Robot robot = new Robot();

            robot.setAutoDelay(3);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_L);

            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_L);

        } catch (AWTException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
