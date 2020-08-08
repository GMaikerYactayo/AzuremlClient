package controlador;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import servicio.Diabetes;
import modelo.Modelo;
import org.primefaces.json.JSONObject;

@Named(value = "diabetesController")
@SessionScoped
public class DiabetesController implements Serializable {

    private Modelo modelo;
    private Diabetes servicio;

    public DiabetesController() {
        modelo = new Modelo();
        servicio = new Diabetes();
    }

    public void obtener() throws Exception {
        try {
            JSONObject probabilidad = servicio.obtenerDatos(modelo);
            String diabetes = probabilidad.getString("Scored Labels");
            System.out.println(probabilidad);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Predicción ", "Diabetes: " + diabetes));

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
