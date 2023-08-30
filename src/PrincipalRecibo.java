import java.util.ArrayList;

public class PrincipalRecibo {
    private final ArrayList<Recibo> recibos = new ArrayList<>();

    public PrincipalRecibo() {
        this.recibos.add(new Recibo("Ricardo", 100.20, "Pago Renta"));
        this.recibos.add(new Recibo("Cornelio", 99.90, "Netflix"));
    }

    public void ImprimirDatos() {
        for (int i = 0; i < this.recibos.size(); i++) {
            System.out.printf("El recibo número %s%n", i);
            this.recibos.get(i).ImprimirDatos();
        }
    }
}
