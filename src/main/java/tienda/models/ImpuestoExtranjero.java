package tienda.models;

public class ImpuestoExtranjero extends Impuesto {

    private double impuesto;

    // Derecho aduanero 6%
    // Iva 19%
    @Override
    public void CalcularImpuesto(Pedido order) {
        impuesto = order.getMontoTotal() * 0.06 + (order.getMontoTotal() * 1.06) * 0.19;
        System.out.println("Impuesto a pagar: " + impuesto);
    }
}
