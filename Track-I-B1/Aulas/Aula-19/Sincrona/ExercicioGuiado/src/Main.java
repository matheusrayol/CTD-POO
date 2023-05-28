import models.Empregado;
import models.EmpregadoRelacaoDep;
import models.Empresa;
import models.FabricaEmpregado;

public class Main {
    public static void main(String[] args) {

        Empresa batata = new Empresa("123456789/01234");
        FabricaEmpregado fabrica = FabricaEmpregado.getInstance();

        Empregado empregado1 = fabrica.criaEmpregado("EMP-INT");

        batata.addEmmpregado(empregado1);
        System.out.println(batata.calculaSalario(30));
    }
}