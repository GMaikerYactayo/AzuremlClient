/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import modelo.Modelo;
import org.primefaces.json.JSONException;
import org.primefaces.json.JSONObject;

/**
 *
 * @author L8
 */
public class Diabetes {

    public Double obtenerDatos(Modelo modelo) throws IOException, JSONException {
        System.out.println(":DD");
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, "{\r\n  \"Inputs\": {\r\n    \"Datos de entrada\": [\r\n      {        \r\n        \"Embarazos\": " + modelo.getEmbarazos() + ",\r\n        \"Glucosa\": " + modelo.getGlucosa() + ",\r\n        \"Presión sanguínea\": " + modelo.getPresionSanguinea()+ ",\r\n        \"Pliegue cutáneo\": " + modelo.getPliegue_cutaneo() + ",\r\n        \"Insulina\": " + modelo.getInsulina() + ",\r\n        \"Índice de masa corporal\": " + modelo.getIMC() + ",\r\n        \"Pedigrí diabetes\": " + modelo.getPedigri_diabetes() + ",\r\n        \"Edad\": " + modelo.getEdad() + ",\r\n        \"Diabetes\": \"\",\r\n        \"Medicación previa\": \"\",\r\n        \"Observaciones\": \"\",\r\n        \"Fecha de diagnóstico\": \"\"\r\n      }\r\n    ]\r\n  },\r\n  \"GlobalParameters\": {}\r\n}");
        Request request = new Request.Builder()
                .url("https://ussouthcentral.services.azureml.net/workspaces/cfb378a7cea24a20982ad9a312b22c6a/services/7b2754ab5b4942789954e8864c6c48d2//execute?api-version=2.0&format=swagger")
                .method("POST", body)
                .addHeader("Authorization", "Bearer FLaiYj/HCQ3d6spZGO2kXPhg6lMZKMLzvkPRPdtTeDAbymgxLqFhF1ezDdo9/xaDdAnXdeySWSZsuhYx+Ssbdw==")
                .addHeader("Content-Type", "application/json")
                .build();
        Response response = client.newCall(request).execute();
        if (!response.isSuccessful()) {
            throw new IOException("Unexpected code " + response);
        }

        Gson gson = new Gson();
        JSONObject jsonObject = new JSONObject(response.body().string());
        Object xd = jsonObject.getJSONObject("Results")
                .getJSONArray("Predicción ")
                .getJSONObject(0)
                .get("Scored Probabilities");
        return Double.valueOf(xd.toString());
    }

}
