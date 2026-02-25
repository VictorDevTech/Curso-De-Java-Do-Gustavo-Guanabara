import java.util.Scanner;

public class Soma_De_Dois_Numeros {
    
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

            System.out.print("Digite o Primeiro número: ");
            float numero1 = teclado.nextFloat();

            System.out.print("Digite o Segundo número: ");
            float numero2 = teclado.nextFloat();

            float soma = numero1 + numero2;

            System.out.println("A soma entre os números é: " + soma);
    }
}
