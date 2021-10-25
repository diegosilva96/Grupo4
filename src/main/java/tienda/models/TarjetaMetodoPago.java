package tienda.models;

public class TarjetaMetodoPago implements MetodoPago{
   
    private String TarjetaId;
    
    @Override
    public  void pagarPedido(Pedido order){
        TarjetaPayOrder(order);
    }

    public double devolverComision(Double montoTotal){
        return montoTotal*0.10;
    }

    public void TarjetaPayOrder(Pedido order){
        /* Doing Tarjeta Validation */
        System.out.println("Procesando el pago con Banco "+getTarjetaId()+" | total: "+order.getMontoTotal() + " comision: " +this.devolverComision(order.getMontoTotal()));
    }

    public String getTarjetaId() {
        if(this.TarjetaId == null){
            setTarjetaId("D5P000000000000");
        }
        return TarjetaId;
    }

    public void setTarjetaId(String TarjetaId){
        this.TarjetaId= TarjetaId;
    }
}

