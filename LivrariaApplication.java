import java.util.Scanner;

public class LivrariaApplication {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome");
        System.out.println("Digite a sua idade");
        int idade = sc.nextInt();
        String nome = sc.nextLine();

        sc.close();
        
        if (idade > 18){
            System.out.println("Maior de idade");
        } else{
            System.out.println("Menor de idade");
        }
        
        System.out.println("Olá, " + nome +"!");

    }
}
