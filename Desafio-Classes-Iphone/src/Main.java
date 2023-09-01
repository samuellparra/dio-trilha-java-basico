public class Main {
    public static void main(String[] args) {
        iPhone myPhone = new iPhone();

        // Teste dos comportamentos do ReprodutorMusical
        myPhone.tocar();
        myPhone.pausar();
        myPhone.selecionarMusica("Música Legal");

        // Teste dos comportamentos do AparelhoTelefonico
        myPhone.ligar("123456789");
        myPhone.atender();
        myPhone.iniciarCorreioVoz();

        // Teste dos comportamentos do NavegadorInternet
        myPhone.exibirPagina("https://www.example.com");
        myPhone.adicionarNovaAba("https://www.example2.com");
        myPhone.atualizarPagina();
    }
}
