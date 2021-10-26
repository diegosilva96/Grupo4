
package tienda.models;

public class Producto {
    private String id;
    private String producto;
    private Double precio;
    private String unidadMedida;
    private String marca;
    private int cantidadMaxima;
    
    public Producto() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    public void setCantidadMaxima(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }
    
    public String imprimeDatosProducto()  {

        StringBuffer salida = new StringBuffer();
        salida.append("Producto Id: " + this.id);
        salida.append("\nProducto: " + this.producto);
        salida.append("\nPrecio: " + this.precio);
        salida.append("\nUnidad de medida: " + this.unidadMedida);
        salida.append("\nMarca: " + this.marca);
        salida.append("\nCantidad M?xima: " + this.cantidadMaxima);
        return salida.toString();
    }
}
