public class Recibo {
    private final String Nombre;
    private final Double CantidadPago;
    private final String ConceptoPago;

    public Recibo(String nombre, Double cantidad, String concepto) {
        Nombre = nombre;
        ConceptoPago = concepto;
        CantidadPago = cantidad;
    }

    public void ImprimirDatos() {
        System.out.printf("el nombre es: %s%n", this.Nombre);
        System.out.printf("el concepto es: %s%n", this.ConceptoPago);
        System.out.printf("la cantidad es: %s%n", this.CantidadPago);
    }
}