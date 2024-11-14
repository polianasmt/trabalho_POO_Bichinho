import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Crie o seu novo animal" +
                "\nInsira o nome: ");
        String nome = input.nextLine();

        System.out.println("Insira a classe: ");
        String classe = input.nextLine();

        System.out.println("Insira a familia: ");
        String familia = input.nextLine();

        Animal animal = new Animal(nome,classe,familia);

        animal.apresentaDados();

        while(animal.isEstado()){
            int resposta = animal.menu();

            switch (resposta){
                case 1:
                    animal.comer();
                    break;
                case 2:
                    animal.correr();
                    break;
                case 3:
                    animal.dormir();
                    break;
                case 4:
                    animal.morrer();
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        System.out.println("GAME OVER!!");
    }
}