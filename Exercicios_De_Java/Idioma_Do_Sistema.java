import java.util.Locale;

public class Idioma_Do_Sistema {
    
    public static void main(String[] argd) {

        // Locale é a classe que guarda informações de idioma e país
        // getDefault() pega a configuração atual do computador
        Locale loc = Locale.getDefault();

        // loc.getDisplayLanguage()
        // getDisplayLanguage() pega o nome do idioma por extenso
        // Exemplo: Português, English, Español
        String idioma = loc.getDisplayLanguage();

        // System.out.println()
        // Mostra algo na tela e pula para a próxima linha
        // O + junta (concatena) o texto com a variável idioma
        System.out.println("Seu sistema está em " + idioma);

    }
}
