package datos;

import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Type;
import java.util.List;
import modelo.Administrador;
import modelo.PuntoReciclaje;

public class ArchivoJson {

    private static final String RUTADATOSADMINISTRADORES = "datosadministradores/";
    private static final String NOMBREDATOSADMINISTRADORES = "adminstradores.json";
    private static final String RUTADATOSPUNTOSRECICLAJE = "datosadministradores/";
    private static final String NOMBREDATOSPUNTOSRECICLAJE = "adminstradores.json";

    public static boolean almacenarADministradores(ArrayList<Administrador> administradores) {
        boolean respuesta = false;
        Type listType = new TypeToken<List<Administrador>>() {
        }.getType();
        Gson gson = new Gson();
        String json = gson.toJson(administradores, listType);
        try (FileWriter file = new FileWriter(RUTADATOSADMINISTRADORES + NOMBREDATOSADMINISTRADORES)) {
            file.write(json);
            respuesta = true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return respuesta;
    }

    public static boolean almacenarPuntosReciclaje(ArrayList<PuntoReciclaje> puntosReciclaje) {
        boolean respuesta = false;
        Type listType = new TypeToken<List<Administrador>>() {
        }.getType();
        Gson gson = new Gson();
        String json = gson.toJson(puntosReciclaje, listType);
        try (FileWriter file = new FileWriter(RUTADATOSPUNTOSRECICLAJE + NOMBREDATOSPUNTOSRECICLAJE)) {
            file.write(json);
            respuesta = true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return respuesta;
    }

    public static ArrayList<Administrador> recurperarAdministradores() {
        Gson gson = new Gson();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(RUTADATOSADMINISTRADORES + NOMBREDATOSADMINISTRADORES));
        } catch (Exception e) {
            e.printStackTrace();
        }
        ArrayList<Administrador> persona
                = gson.fromJson(br, new TypeToken<List<Administrador>>() {
                }.getType());
        return persona;

    }

    public static ArrayList<PuntoReciclaje> recurperarObjetos() {
        Gson gson = new Gson();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(RUTADATOSPUNTOSRECICLAJE + NOMBREDATOSPUNTOSRECICLAJE));
        } catch (Exception e) {
            e.printStackTrace();
        }
        ArrayList<PuntoReciclaje> persona
                = gson.fromJson(br, new TypeToken<List<PuntoReciclaje>>() {
                }.getType());
        return persona;

    }
}
