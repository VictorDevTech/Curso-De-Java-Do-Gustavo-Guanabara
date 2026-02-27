import java.util.Scanner;

public class Media_Das_Notas_Dos_Aluno {

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = teclado.nextLine();

        System.out.print("Digite a primeira nota: ");
        float primeiraNota = teclado.nextFloat();

        System.out.print("Digite a segunda nota: ");
        float segundaNota = teclado.nextFloat();

        System.out.print("Digite a terceira nota: ");
        float terceiraNota = teclado.nextFloat();

        System.out.print("Digite a quarta nota: ");
        float quartaNota = teclado.nextFloat();

        double media = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;

        if (media >= 60){
            System.out.format("O aluno %s foi APROVADO com média %.2f", nomeAluno, media);
        } else {
            System.out.format("O aluno %s foi REPROVADO com média %.2f", nomeAluno, media);
        }

        teclado.close();
    }
}
