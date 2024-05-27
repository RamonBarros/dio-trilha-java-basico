public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {

    public void tocar() {
        System.out.println("Tocando Música");
    }

    public void pausar() {
        System.out.println("Música Pausada");
    }

    public void selecionarMusical(String musica) {
        System.out.println("Foi Selecionada a Música: " + musica);
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo Página: " + url);
    }

    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    public void atender() {
        System.out.println("Atendendo Ligação");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando Pagina");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando Nova Aba");
    }
}