
public class ParametrosInvalidosException extends Exception {

    public ParametrosInvalidosException(){
        super();
    }
    
    public ParametrosInvalidosException(String message) {
        super(message);
    }

}

class SegundoParametroMaiorException extends ParametrosInvalidosException{

    public SegundoParametroMaiorException(String message) {
        super(message);
    }
}

class ParametroNegativoException extends ParametrosInvalidosException{

    public ParametroNegativoException(String message) {
        super(message);
    }

}
class ParametroNuloException extends ParametrosInvalidosException{

    public ParametroNuloException(String message) {
        super(message);
    }
}