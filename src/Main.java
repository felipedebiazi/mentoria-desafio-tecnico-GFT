import desafios.Macaco;
import desafios.NumeroReverso;
import desafios.funcionarios.Consultor;
import desafios.funcionarios.Vendedor;

public class Main {

    public static void main(String[] args) {

       // NumeroReverso.numeroReverso();

        /*
        Macaco macaco1 = new Macaco();
        Macaco macaco2 = new Macaco();

        macaco1.comer("banana");
        macaco1.comer("uva");
        macaco1.comer("batata");

        macaco2.comer("pera");
        macaco2.comer("mandioca");
        macaco2.comer("pera");

        macaco1.digerir();

         */

        Vendedor vendedor = new Vendedor("Felipe Debiazi", 78945612310L, 500,10);
        System.out.println(vendedor.calcularSalario());

        Consultor consultor = new Consultor("Charles Bronw",36985214714L,25, 10);
        System.out.println(consultor.calcularSalario());
    }
}
