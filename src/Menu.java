import model.Pedido;
import util.Cores;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int opcao = 0;
        System.out.println(Cores.TEXT_YELLOW + "*******************************************************************************************" + Cores.TEXT_RESET);
        System.out.println("                                                     ");
        System.out.println(Cores.ANSI_BLACK_BACKGROUND + " __  __  ______  _       _____   _                 _   _   _____  _    _  ______   _____\n" +
                "|  \\/  ||  ____|| |     |_   _| | |         /\\    | \\ | | / ____|| |  | ||  ____| / ____|\n" +
                "| \\  / || |__   | |       | |   | |        /  \\   |  \\| || |     | |__| || |__   | (___\n" +
                "| |\\/| ||  __|  | |       | |   | |       / /\\ \\  | . ` || |     |  __  ||  __|   \\___ \\\n" +
                "| |  | || |____ | |____  _| |_  | |____  / ____ \\ | |\\  || |____ | |  | || |____  ____) |\n" +
                "|_|  |_||______||______||_____| |______|/_/    \\_\\|_| \\_| \\_____||_|  |_||______||_____/\n" +
                "\n" +
                "\n"+Cores.TEXT_RESET);
        System.out.println("                                                     ");
        System.out.println(Cores.TEXT_YELLOW + "*******************************************************************************************" + Cores.TEXT_RESET);
        System.out.println("                                                     ");
        System.out.println("               1 - Produto                           ");//Gabriel Galvão (criar pedido e listar no final o pedido)
        System.out.println("               2 - Pedido                            ");
        System.out.println("               7 - SAIR                              ");
        System.out.println("                                                     ");
        System.out.println("*****************************************************");
        System.out.println("Digite a opção desejada:                             ");
        System.out.println("                                                     ");

//        opcao = leia.nextInt();
//
//        if (opcao == 7) {
//            System.out.println("MeLi Lanches \nAgradece a sua preferência e volte sempre!");
//            leia.close();
//            System.exit(0);
//
//        }
//
//        switch (opcao) {
//            case 1:
//                System.out.println("\nCriar Pedido");
//                System.out.println("*** CRIAR PEDIDO ***");
//                Pedido pedido = new Pedido("X_java",19.99, 1);
//                pedido.VisualizarPedido();
//                break;
//            case 2:
//                System.out.println("\n");
//                System.out.println("*** MOSTRAR PEDIDO ***");
//                //incluir método
//                break;
//            case 3:
//                System.out.println("\n");
//                System.out.println("*** ITENS DO PEDIDO ***");
//                //incluir método
//                break;
//            case 4:
//                System.out.println("\n");
//                System.out.println("*** DATA DO PEDIDO ***");
//                //incluir método
//                break;
//            case 5:
//                System.out.println("");
//                System.out.println("*** VALOR DO PEDIDO ***");
//                //incluir método
//                break;
//            case 6:
//                System.out.println("\n");
//                System.out.println("*** STATUS DO PEDIDO ***");
//                //incluir método
//                break;
//        }

    }
}
