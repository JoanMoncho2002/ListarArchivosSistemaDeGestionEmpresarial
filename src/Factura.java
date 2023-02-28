import java.util.Date;

public class Factura {
    private String numeroFactura;
    private String numeroCliente;
    private Date fecha;

    public Factura(String numeroFactura, String numeroCliente, Date fecha) {
        this.numeroFactura = numeroFactura;
        this.numeroCliente = numeroCliente;
        this.fecha = fecha;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }


}
