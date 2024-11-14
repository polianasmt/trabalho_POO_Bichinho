import java.util.Scanner;
public class Animal {
    static Scanner input = new Scanner(System.in);

    private String nome, classe, familia;
    private int idade, forca, caloria;
    private boolean estado;

    public Animal(String nome, String classe, String familia) {
        this.nome = nome;
        this.classe = classe;
        this.familia = familia;
        this.idade = 0;
        this.forca = 10;
        this.caloria = 10;
        this.estado = true;
    }

    public void apresentaDados(){
        System.out.println("O animal se chama "+nome+" é da classe "+classe+" da família "+familia+". " +
                "O animal possui força "+forca+", caloria de "+caloria+" e "+idade+" idade.");
    }

    public int menu(){
        System.out.print("\nO que o "+nome+" vai fazer agora?\n" +
                "1- Comer\n" +
                "2- Correr\n" +
                "3- Dormir\n" +
                "4- Morrer\n" +
                "Escolha uma opção:");
        return Integer.parseInt(input.nextLine());
    }

    public void comer(){
        if(caloria < 100){
            setCaloria(caloria + 10);
            setForca(forca - 2);
            System.out.println("\nO animal comeu e agora sua força é "+forca+" e suas calorias valem "+caloria+".");
        } else {
            System.out.println("\nNão foi possível realizar a ação. O animal está cheio.");
        }
    }

    public void correr(){
        if(forca > 0) {
            setCaloria(caloria - 5);
            setForca(forca - 5);
            System.out.println("\nO animal está correndo!! Agora sua força é de "+forca+" e suas calorias vale "+caloria);
        } else {
            System.out.println("\nNão foi possível realizar a ação. O animal está exausto.");
        }
    }

    public void dormir(){
        setCaloria(caloria - 2);
        setForca(forca + 10);
        System.out.println("\nO animal está dormindo agora! Sua força aumentou para "+forca+" e suas calorias diminuíram para "+caloria+".");
    }

    public void morrer(){
        setEstado(false);
        System.out.println("\nO animal morreu!");
    }

    public static Scanner getInput() {
        return input;
    }

    public static void setInput(Scanner input) {
        Animal.input = input;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getCaloria() {
        return caloria;
    }

    public void setCaloria(int caloria) {
        this.caloria = caloria;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
