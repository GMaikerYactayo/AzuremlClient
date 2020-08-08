package controlador;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import servicio.Diabetes;
import modelo.Modelo;

@Named(value = "contralador")
@SessionScoped
public class Contralador implements Serializable {

    private Modelo modelo = new Modelo();
    
    public void obtener() throws Exception{
        Diabetes.obtenerDatos(modelo);
    }
    
    public Contralador() {
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }
    
    
    
}
