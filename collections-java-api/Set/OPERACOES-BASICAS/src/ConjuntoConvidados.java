import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidados(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoASerRemovido = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoASerRemovido = c;
                break;
            }
        }

        convidadoSet.remove(convidadoASerRemovido);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.err.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        conjuntoConvidados.adicionarConvidados("convidado1",3234);
        conjuntoConvidados.adicionarConvidados("convidado2",2223);
        conjuntoConvidados.adicionarConvidados("convidado3",3234);
        conjuntoConvidados.adicionarConvidados("convidado4",4546);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados()+" convidados dentro do set de Convidados");
        conjuntoConvidados.exibirConvidados();
    }

}
