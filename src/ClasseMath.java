public class ClasseMath {
    public static void main(String[] args) {
        double power = Math.pow(5,3);
        System.out.println(power);

        int pass = (int) (1111111   + Math.random() * (9999999-1111111));

        System.out.println("Sua nova senha é: " + pass);


        double nota = 4.1;
        double notaFinal = Math.round(nota);

        System.out.println("A nota final desse aluno ficará = " + notaFinal);
    }
}
