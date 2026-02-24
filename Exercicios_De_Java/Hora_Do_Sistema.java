
import java.util.Date;

public class Hora_Do_Sistema {

    public static void main(String[] args) {

        // Cria um objeto que pega a data e a hora atual do computador
        Date relogio = new Date();

        // Mostra uma frase na tela
        // println = mostra o texto e pula para a próxima linha
        System.out.println("A hora do sistema é: ");

        // relogio.toString()
        // toString() transforma a data e hora em TEXTO
        // Isso é necessário para poder mostrar na tela
        System.out.println(relogio.toString());
    }
}
