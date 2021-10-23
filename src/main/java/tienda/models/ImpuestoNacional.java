package tienda.models;

public class ImpuestoNacional extends Impuesto {

    private double impuesto;

    // IGV 18%
    @Override
    public void CalcularImpuesto(Pedido order) {
        impuesto = 0.18 * order.getMontoTotal();
        System.out.println("Impuesto a pagar: " + impuesto);
    }
}
