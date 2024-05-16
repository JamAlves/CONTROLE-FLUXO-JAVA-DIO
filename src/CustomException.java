
public class CustomException {

    public static void main(String[] args) {
        
    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {


        int contagem = parametroDois - parametroUm;


    }
}

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String errorMessage) {
        super(errorMessage);
    }
}
