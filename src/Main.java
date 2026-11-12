
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n=== BIBLIOTECA UNIVERSITÁRIA ===");
            System.out.println("1 - Verificar empréstimo");
            System.out.println("2 - Consultar regras");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Quantos livros o aluno possui? ");
                    int livros = scanner.nextInt();

                    if (livros < 0) {
                        System.out.println("Quantidade inválida.");
                    } else if (livros < 3) {
                        System.out.println("Empréstimo autorizado!");
                    } else {
                        System.out.println("Empréstimo não autorizado.");
                        System.out.println("Limite de 3 livros atingido.");
                    }
                    break;

                case 2:
                    System.out.println("Limite: 3 empréstimos ativos.");
                    System.out.println("Prazo de devolução: 14 dias.");
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
