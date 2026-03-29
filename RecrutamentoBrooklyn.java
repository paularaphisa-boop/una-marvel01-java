import java.util.Scanner;

public class RecrutamentoBrooklyn {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("--- POSTO DE RECRUTAMENTO: EXÉRCITO DOS EUA ---");

        System.out.print("Nome do candidato: ");
        String nome = teclado.nextLine();

        System.out.print("Idade: ");
        int idade = teclado.nextInt();

        if (idade < 18) {
            System.out.println("Candidato: " + nome);
            System.out.println("Resultado: Acesso Negado: Muito jovem para a guerra.");
        } else { 
            System.out.print("Peso (kg): ");
            double peso = teclado.nextDouble();

        if (peso < 50.0) {
            System.out.println("Status: " + nome + " é franzino, mas tem determinação.");
            System.out.println("Decisão: Encaminhar para o Dr. Erskine (Projeto Renascimento).");
            } else { 
            System.out.println("Status: Candidato com porte padrão.");
            System.out.println("Decisão: Infantaria convencional.");
                    }
        }
    
    teclado.close();
    System.out.println("--- Fim do Processo ---");
}
}
