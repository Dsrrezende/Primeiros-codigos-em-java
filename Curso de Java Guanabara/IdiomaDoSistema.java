import java.util.Locale;

public class IdiomaDoSistema {
    public static void main(String[] args) {
        Locale idioma = Locale.getDefault();//pega o idioma do sistema
        System.out.println("O Idioma do sistema é: "+ idioma.getDisplayLanguage());//mostra o idioma do sistema
    }
}