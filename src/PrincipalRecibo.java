import java.util.ArrayList;
import java.util.List;

public class PrincipalRecibo {
    private List<Recibo> recibos = new ArrayList();

    public PrincipalRecibo() {
        this.recibos.add(new Recibo(100.20, "Pago Renta"));
        this.recibos.add(new Recibo(99.90, "Netflix"));
    }

    public void ImprimirDatos() {
        for (int i = 0; i < this.recibos.size(); i++) {
            System.out.println(String.format("El recibo número %s es:", i));
            System.out.println(String.format("el concepto es: %s", this.recibos.get(i).ConceptoDePago));
            System.out.println(String.format("la cantidad es: %s", this.recibos.get(i).CantidadPago));
        }
    }
}
