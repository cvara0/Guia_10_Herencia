
package e1exG10Paquete;


public class Cliente {
    private String nombreCliente;
    private String documentoCliente;

    public Cliente() {
    }

    public Cliente(String nombreCliente, String documentoCliente) {
        this.nombreCliente = nombreCliente;
        this.documentoCliente = documentoCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDocumentoCliente() {
        return documentoCliente;
    }

    public void setDocumentoCliente(String documentoCliente) {
        this.documentoCliente = documentoCliente;
    }
    
}
