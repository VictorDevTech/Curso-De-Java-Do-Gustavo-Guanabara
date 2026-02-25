
import java.util.Scanner;

public class Tipos_Primitivos {
    
    public static void main(String[] args) {

        float nota = (float) 8.5; 
        // Cria uma variável chamada "nota" do tipo float (número com decimal)
        // e guarda o valor 8.5 dentro dela.

        String nome = "Victor"; 
        // Cria uma variável do tipo texto (String) chamada "nome"
        // e coloca "Victor" dentro dela.

        System.out.print("A nota do " + nome + " é " +  nota + "\n"); 
        // Mostra a frase na tela juntando texto + variável.
        // O + serve para juntar as partes.
        // O "\n" faz pular para a próxima linha.

        System.out.println("A nota do " + nome + " é " + nota); 
        // Também mostra a frase na tela.
        // A diferença é que o println já pula linha automaticamente no final.

        System.out.printf("A nota do %s é %.2f \n", nome, nota); 
        // Aqui usamos um modelo de formatação.
        // %s é substituído pelo texto (nome).
        // %.2f mostra o número com 2 casas decimais.
        // \n pula linha.

        System.out.format("A nota do %s é %.2f \n", nome, nota); 
        // Funciona praticamente igual ao printf.
        // Também usa %s para texto e %.2f para número com 2 casas decimais.

        Scanner teclado = new Scanner(System.in);
            System.out.print("Digite o nome do aluno: "); 
            // Mostra uma mensagem pedindo para o usuário digitar um nome.

            String nome1 = teclado.nextLine(); 
            // Lê o nome digitado (linha inteira de texto)
            // e guarda na variável "nome1".

            System.out.print("Digite a nota do aluno: "); 
            // Mostra uma mensagem pedindo para digitar a nota.

            float nota1 = teclado.nextFloat(); 
            // Lê o número decimal digitado
            // e guarda na variável "nota1".

            System.out.format("A nota de %s é %.1f \n", nome1, nota1); 
            // Mostra na tela o nome e a nota digitados.
            // %.1f faz o número aparecer com 1 casa decimal.
            // \n pula linha.
        
    }
}
