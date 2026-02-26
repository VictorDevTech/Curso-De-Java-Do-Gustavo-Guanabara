import java.util.Scanner;

public class Media_Das_Notas_Dos_Aluno {
    
    public static void main(String[] argd){

        Scanner teclado = new Scanner(System.in);

            System.out.print("Digite o nome do aluno: ");
            String Nome_Aluno = teclado.nextLine();

            System.out.print("Digite a primeira nota: ");
            float primeira_nota = teclado.nextFloat();

            System.out.print("Digite a segundaa nota: ");
            float segunda_nota = teclado.nextFloat();

            System.out.print("Digite a terceira nota: ");
            float terceira_nota = teclado.nextFloat();

            System.out.print("Digite a quarta nota: ");
            float quarta_nota = teclado.nextFloat();

            double media_das_notas = (primeira_nota + segunda_nota + terceira_nota + quarta_nota) /4;

            if ( media_das_notas <= 60){
                System.out.format("O aluno %s foi aprovado e foi com a media %s", Nome_Aluno, media_das_notas);

            } else {
                System.out.format("O aluno %s foi Reprovado e foi com a media %s", Nome_Aluno,media_das_notas);
            }
    }
}
