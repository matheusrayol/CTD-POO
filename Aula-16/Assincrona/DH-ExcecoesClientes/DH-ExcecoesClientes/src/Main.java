public class Main {
    public static void main(String[] args) {

        Cliente cliente  = new Cliente("Matheus", "Ferreira", "597427318", 500.00);

        try {
            cliente.comprar(1000.00);
        } catch (ClientException e) {
            System.err.println(e.getMessage());
        }

        try {
            cliente.pagarDivida(2000.00);
        } catch (ClientException e) {
            System.err.println(e.getMessage());
        }
    }
}
