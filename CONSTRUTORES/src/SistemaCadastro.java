public class SistemaCadastro {
    public static void main(String[] args) throws Exception {
        Pessoa marcos = new Pessoa("06724506716","MARCOS SILVA");
        System.out.println("Cpf: "+marcos.getCpf()+", Nome: " + marcos.getNome());
    }
}
