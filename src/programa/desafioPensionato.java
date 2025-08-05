package programa;

import entidades.Pessoas;

import java.util.Scanner;

public class desafioPensionato {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num, number;
        String name;
        String email;

        // criando registro
        System.out.println("Choose a room from 1 to 10");
        System.out.print("How many will be rented? ");
        num = entrada.nextInt();

        // criando o vetor
        Pessoas[] quarto = new Pessoas[10];

        for (int i = 0; i < num; i++){
            System.out.println();// pula uma linha
            System.out.printf("Rent #%d\n", i + 1);
            entrada.nextLine();
            System.out.print("Name: ");
            name = entrada.nextLine();
            System.out.print("Email: ");
            email = entrada.nextLine();
            System.out.print("Room: ");
            number = entrada.nextInt();

            quarto[number] = new Pessoas(name, email, number);
        }

        // exibindo os quartos que foram registrados
        System.out.println(); // pula uma linha
        System.out.println("Busy rooms:");
        for (int i = 0; i < 10; i++){
            if (quarto[i] != null){
                System.out.println(quarto[i]);
            }
        }


        entrada.close();
    }
}