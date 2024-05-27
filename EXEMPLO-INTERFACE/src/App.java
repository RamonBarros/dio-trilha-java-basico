import copiadora.Xerox;
import digitalizadora.Scanner;
import impressora.Laserjet;
import impressora.Deskjet;
import impressora.Impressora;
import copiadora.Copiadora;

public class App {
    public static void main(String[] args) throws Exception {
       
        Copiadora copiadora = new Xerox();
 
        copiadora.copiar();

        Scanner digitalizadora = new Scanner();

        digitalizadora.digitalizar();

        Impressora deskjet = new Deskjet();

        deskjet.imprimir();
        
        Impressora laserjet = new Laserjet();

        laserjet.imprimir();
        
    }
}
