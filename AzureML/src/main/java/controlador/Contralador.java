package controlador;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import servicio.Diabetes;
import modelo.Modelo;

@Named(value = "contralador")
@SessionScoped
public class Contralador implements Serializable {

    private Modelo modelo;
    private Diabetes servicio;

    public Contralador() {
        modelo = new Modelo();
        servicio = new Diabetes();
    }

    public void obtener() throws Exception {
        try {
            Double probabilidad = servicio.obtenerDatos(modelo);
            System.out.println(probabilidad);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

}
