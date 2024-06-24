import java.util.List;

import lombok.Data;

@Data
public class Banco {
    private String nome;
    private List<Conta> contas;

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void imprimirContas() {
        System.out.println("Lista de Contas do Banco "+ this.getNome());

        for (Conta conta : contas) {
            conta.imprimirExtrato();
        }
    }

}