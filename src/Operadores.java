import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        int birth = 2006;
        int actualYear = 2023;
        int age = actualYear - birth;

        System.out.println("Você tem " + age + " anos de idade!");


        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite sua idade aqui: ");
        byte idade = teclado.nextByte();
        byte cinquenta = (byte) (idade + 50);

        System.out.println("Você terá " + cinquenta + " anos daqui a 50 anos!");


        System.out.println(20*43);
        System.out.println(30/2);
        System.out.println(2003%10);


        int n1 = 13;
        int n2 = 8;
        int res = n1 * --n2;
        System.out.println(res);
        System.out.println(n1);
        System.out.println(n2);
    }
}
