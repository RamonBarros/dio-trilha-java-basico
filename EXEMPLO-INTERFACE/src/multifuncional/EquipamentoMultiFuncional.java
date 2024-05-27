package multifuncional;

import copiadora.Copiadora;
import digitalizadora.Digitalizadora;
import impressora.Impressora;

public class EquipamentoMultiFuncional implements Impressora, Digitalizadora, Copiadora {
    public void imprimir(){
        System.out.println("IMPRIMINDO NO EQUIPAMENTO MULTIFUNCIONAL");
    }
    public void copiar(){
        System.out.println("COPIANDO NO EQUIPAMENTO MULTIFUNCIONAL");
    }
    public void digitalizar(){
        System.out.println("DIGITALIZANDO NO EQUIPAMENTO MULTIFUNCIONAL");
    }
}
