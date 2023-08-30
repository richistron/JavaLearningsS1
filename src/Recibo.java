public class Recibo {
    private final String Nombre;
    private final Double CantidadPago;
    private final String ConceptoPago;

    public Recibo(String nombre, Double Cantidad, String concepto) {
        Nombre = nombre;
        ConceptoPago = concepto;
        CantidadPago = Cantidad;
    }

    public void ImprimirDatos() {
        System.out.printf("el nombre es: %s%n", Nombre);
        System.out.printf("el concepto es: %s%n", ConceptoPago);
        System.out.printf("la cantidad es: %s%n", CantidadPago);
    }
}