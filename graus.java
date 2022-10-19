import java.util.Scanner;

public class graus {
    public static void main(String[] arg) {
        
        Scanner input = new Scanner(System.in);

        float grau = 0;

        System.out.println("Insira a temperatura em graus: ");
        grau = input.nextFloat();

        System.out.printf("Temperatura convertida em Fahrenheit: " + (grau * 9 / 5 + 32));
    }
}
