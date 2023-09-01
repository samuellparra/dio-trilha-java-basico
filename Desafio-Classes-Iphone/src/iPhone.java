class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private boolean isPlaying;

    @Override
    public void tocar() {
        isPlaying = true;
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        isPlaying = false;
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página web: " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Nova aba adicionada: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }

}

