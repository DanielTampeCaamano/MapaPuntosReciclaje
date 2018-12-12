package datos;

import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import modelo.Administrador;
import modelo.PuntoReciclaje;

public class ArchivoJson {

    private static final String RUTADATOSADMINISTRADORES = "datos/datosadministradores/";
    private static final String NOMBREDATOSADMINISTRADORES = "administradores.json";
    private static final String RUTACOINCIDENCIASADMINISTRADOR = "datos/coincidenciasadministradores/";
    private static final String NOMBRECOINCIDENCIASADMINISTRADOR = "administrador.json";
    private static final String RUTADATOSPUNTOSRECICLAJE = "datos/datospuntosreciclaje/";
    private static final String NOMBREDATOSPUNTOSRECICLAJE = "puntosreciclaje.json";
    private static final String RUTACOINCIDENCASPUNTOSRECICLAJE = "datos/coincidenciaspuntosreciclaje/";
    private static final String NOMBRECOINCIDENCIASPUNTOSRECICLAJE = "puntosreciclaje.json";
    private static final String RUTARESULTADOPUNTORECICLAJE = "datos/resultadopuntoreciclaje/";
    private static final String NOMBRERESULTADOPUNTORECICLAJE = "puntoreciclaje.json";

    public static boolean almacenarAdministradores(ArrayList<Administrador> administradores) {
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

    public static boolean almacenarCoincidenciaAdministrador(Administrador administrador) {
        boolean respuesta = false;
        Type tipoJson = new TypeToken<Administrador>() {
        }.getType();
        Gson gson = new Gson();
        String json = gson.toJson(administrador, tipoJson);
        try (FileWriter file = new FileWriter(RUTACOINCIDENCIASADMINISTRADOR + NOMBRECOINCIDENCIASADMINISTRADOR)) {
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

    public static boolean almacenarCoincidenciasPuntosReciclaje(ArrayList<PuntoReciclaje> coincidenciasPtosReciclaje) {
        boolean respuesta = false;
        Type listType = new TypeToken<List<PuntoReciclaje>>() {
        }.getType();
        Gson gson = new Gson();
        String json = gson.toJson(coincidenciasPtosReciclaje, listType);
        try (FileWriter file = new FileWriter(RUTACOINCIDENCASPUNTOSRECICLAJE + NOMBRECOINCIDENCIASPUNTOSRECICLAJE)) {
            file.write(json);
            respuesta = true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return respuesta;
    }

    public static boolean almacenarResultadoPuntoReciclaje(PuntoReciclaje resultadoPtoReciclaje) {
        boolean respuesta = false;
        Type tipoPtoReciclaje = new TypeToken<PuntoReciclaje>() {
        }.getType();
        Gson gson = new Gson();
        String json = gson.toJson(resultadoPtoReciclaje, tipoPtoReciclaje);
        try (FileWriter file = new FileWriter(RUTARESULTADOPUNTORECICLAJE + NOMBRERESULTADOPUNTORECICLAJE)) {
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
        ArrayList<Administrador> administradores
                = gson.fromJson(br, new TypeToken<List<Administrador>>() {
                }.getType());
        return administradores;

    }

    public static Administrador recurperarCoincidenciaAdministrador() {
        Gson gson = new Gson();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(RUTACOINCIDENCIASADMINISTRADOR + NOMBRECOINCIDENCIASADMINISTRADOR));
        } catch (Exception e) {
            e.printStackTrace();
        }
        Administrador administrador
                = gson.fromJson(br, new TypeToken<Administrador>() {
                }.getType());
        return administrador;

    }

    public static ArrayList<PuntoReciclaje> recurperarPuntosReciclaje() {
        Gson gson = new Gson();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(RUTADATOSPUNTOSRECICLAJE + NOMBREDATOSPUNTOSRECICLAJE));
        } catch (Exception e) {
            e.printStackTrace();
        }
        ArrayList<PuntoReciclaje> puntosReciclaje
                = gson.fromJson(br, new TypeToken<List<PuntoReciclaje>>() {
                }.getType());
        return puntosReciclaje;

    }

    public static ArrayList<PuntoReciclaje> recurperarCoincidenciasPuntosReciclaje() {
        Gson gson = new Gson();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(RUTACOINCIDENCASPUNTOSRECICLAJE + NOMBRECOINCIDENCIASPUNTOSRECICLAJE));
        } catch (Exception e) {
            e.printStackTrace();
        }
        ArrayList<PuntoReciclaje> puntosReciclaje
                = gson.fromJson(br, new TypeToken<List<PuntoReciclaje>>() {
                }.getType());
        return puntosReciclaje;

    }

    public static PuntoReciclaje recurperarResultadoPuntoReciclaje() {
        Gson gson = new Gson();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(RUTARESULTADOPUNTORECICLAJE + NOMBRERESULTADOPUNTORECICLAJE));
        } catch (Exception e) {
            e.printStackTrace();
        }
        PuntoReciclaje puntoReciclaje
                = gson.fromJson(br, new TypeToken<PuntoReciclaje>() {
                }.getType());
        return puntoReciclaje;

    }

    public static boolean existeArchivo(String rutaArchivo) {
        boolean verificador;
        verificador = Files.exists(Paths.get(rutaArchivo));
        return verificador;
    }
}
