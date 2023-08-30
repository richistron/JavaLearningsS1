public class Recibo {
    String ConceptoPago;
    Double CantidadPago;

    public Recibo(Double cantidad, String concepto) {
        ConceptoPago = concepto;
        CantidadPago = cantidad;
    }
}