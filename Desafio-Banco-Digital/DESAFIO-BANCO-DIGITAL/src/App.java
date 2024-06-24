import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente ramon = new Cliente();
        Cliente fatima = new Cliente();
        ramon.setNome("Ramon");
        ramon.setCPF("1235465478");
        fatima.setNome("Fatima");
        fatima.setCPF("1111111111");
        Conta cc = new ContaCorrente(ramon);
        Conta cp = new ContaPoupanca(fatima);

        List<Conta> contas = new ArrayList<>();

        contas.add(cc);
        contas.add(cp);
        
        cc.depositar(150);

        cc.transferir(100, cp);

        Banco bancoRBG = new Banco();

        bancoRBG.setNome("BANCO RBG");
        bancoRBG.setContas(contas);

        bancoRBG.imprimirContas();





    }
}
