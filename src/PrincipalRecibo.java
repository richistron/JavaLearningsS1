import java.util.ArrayList;

public class PrincipalRecibo {
    private final ArrayList<Recibo> recibos = new ArrayList();

    public PrincipalRecibo() {
        this.recibos.add(new Recibo(100.20, "Pago Renta"));
        this.recibos.add(new Recibo(99.90, "Netflix"));
    }

    public void ImprimirDatos() {
        for (int i = 0; i < this.recibos.size(); i++) {
            System.out.printf("El recibo número %s es:%n", i);
            System.out.printf("el concepto es: %s%n", this.recibos.get(i).ConceptoPago);
            System.out.printf("la cantidad es: %s%n", this.recibos.get(i).CantidadPago);
        }
    }
}
