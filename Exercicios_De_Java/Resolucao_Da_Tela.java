
import java.awt.Dimension;
import java.awt.Toolkit;

public class Resolucao_Da_Tela {
    
    public static void main(String[] args) {
        
        // Toolkit é a classe que permite acessar informações do sistema
        // getDefaultToolkit() pega as configurações padrão do computador
        // getScreenSize() pega o tamanho da tela (largura e altura)
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();

        // getWidth() pega a largura da tela
        // (int) converte o número para inteiro (sem casas decimais)
        int largura = (int) tela.getWidth();

        // getHeight() pega a altura da tela
        // (int) também converte para número inteiro
        int altura = (int) tela.getHeight();

        // Mostra na tela a resolução no formato largura x altura
        // O + junta os valores com o texto
        System.out.println("A sua tela tem a resolução " + largura + "x" + altura);

    }
}
