import java.util.Scanner;
public class TiposPrimitivos {
     public static void main(String[] args) {
         char letter = 'E';
         byte age = 16;
         float height = 1.75F;
         boolean marred = false;
         System.out.println("My name start with the letter " + letter + ". I'm " + age + " years old, and I'm " + height + "m tall.");
         if (marred) {
             System.out.println("I'm marred!");
         } else {
             System.out.println("I'm not marred!");
         }

         Scanner keyboard = new Scanner(System.in);
         System.out.print("Digite seu nome aqui: ");
         String name = keyboard.nextLine();
         System.out.print("Digite seu salário aqui: ");
         float income = keyboard.nextFloat();

         if (income <= 1000.00) {
             System.out.printf("Olá %s seu salário é de %.2f, logo você é pobre. SEU PLEBE COM PRIME!\n", name, income);
         } else if (income <= 1320.00) {
             System.out.printf("Olá %s seu salário é de %.2f, logo você é um brasileiro de classe média. FAZ O L CARALHO!", name, income);
         } else {
             System.out.printf("Olá %s seu salário é de %.2f, logo você é rico. You are my sugar daddy UwU", name, income);
         }

         /* Não funciona, pois o tipo “int” não pode ser atribuído ao tipo String!
            int idade = 16;
            String value = idade;
         */

         // Dessa forma podemos fazer o código anterior funcionar.
         int idade = 16;
         String value = Integer.toString(idade); // Usando o método toString() da classe Integer transformamos int em String.
         System.out.println(value); // Sucesso: 16
     }
}