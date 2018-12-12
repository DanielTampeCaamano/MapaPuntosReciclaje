package modelo;

import datos.Archivo;
import datos.ArchivoJson;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PuntoReciclaje {

    private String direccion;
    private double latitud;
    private double longitud;
    private ArrayList<Categoria> categorias;
    private double cantidadReciclada;
    private int cantidadVecesVisitada;
    private static String rutaDatosPuntosReciclaje = "datos/datospuntosreciclaje/puntosreciclaje.json";
//    private static String rutaCoincidenciasPuntosReciclaje = "datos/coincienciaspuntosreciclaje/puntosreciclaje.json";
//    private static String rutaResultadoPuntoReciclaje = "datos/resultadopuntoreciclaje/puntoreciclaje.json";

    public PuntoReciclaje(String direccion, double latitud, double longitud, ArrayList<Categoria> categorias) {
        this.direccion = direccion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.categorias = categorias;
        this.cantidadReciclada = 0;
        this.cantidadVecesVisitada = 0;
    }

    public PuntoReciclaje(String direccion, double latitud, double longitud, ArrayList<Categoria> categorias, double cantidadReciclada, int cantidadVecesVisitada) {
        this.direccion = direccion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.categorias = categorias;
        this.cantidadReciclada = cantidadReciclada;
        this.cantidadVecesVisitada = cantidadVecesVisitada;
    }

    public PuntoReciclaje(String direccion, double latitud, double longitud, ArrayList<Categoria> categorias, int cantidadVecesVisitada) {
        this.direccion = direccion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.categorias = categorias;
        this.cantidadReciclada = 0;
        this.cantidadVecesVisitada = cantidadVecesVisitada;
    }

    public PuntoReciclaje(String direccion, double latitud, double longitud, ArrayList<Categoria> categorias, double cantidadReciclada) {
        this.direccion = direccion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.categorias = categorias;
        this.cantidadReciclada = cantidadReciclada;
        this.cantidadVecesVisitada = 0;
    }

    public String getDireccion() {
        return direccion;
    }

    public double getLatitud() {
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }

    public double getCantidadReciclada() {
        return cantidadReciclada;
    }

    public int getCantidadVecesVisitada() {
        return cantidadVecesVisitada;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public void setCategorias(ArrayList<Categoria> categorias) {
        this.categorias = categorias;
    }

    public void setCantidadReciclada(double cantidadReciclada) {
        this.cantidadReciclada = cantidadReciclada;
    }

    public void setCantidadVecesVisitada(int cantidadVecesVisitada) {
        this.cantidadVecesVisitada = cantidadVecesVisitada;
    }

    public static void guardarDatosPuntoReciclaje(PuntoReciclaje ptoReciclaje) {
        if (Archivo.existeArchivo(rutaDatosPuntosReciclaje)) {// Verifica si existe el archivo indicado en la ruta
            ArrayList<PuntoReciclaje> listaDatosPuntosReciclaje = ArchivoJson.recurperarPuntosReciclaje();
            listaDatosPuntosReciclaje.add(ptoReciclaje);
            ArchivoJson.almacenarPuntosReciclaje(listaDatosPuntosReciclaje);
        } else {
            ArrayList<PuntoReciclaje> listaDatosPuntosReciclaje = new ArrayList<>();
            listaDatosPuntosReciclaje.add(ptoReciclaje);
            ArchivoJson.almacenarPuntosReciclaje(listaDatosPuntosReciclaje);
        }
    }

    public static void guardarCoincidenciasPuntosReciclaje(ArrayList<PuntoReciclaje> coincidenciasPtosReciclaje) {
        ArchivoJson.almacenarCoincidenciasPuntosReciclaje(coincidenciasPtosReciclaje);
    }

    public static void guardarResultadoPuntoReciclaje(PuntoReciclaje ptoReciclaje) {
        ArchivoJson.almacenarResultadoPuntoReciclaje(ptoReciclaje);
    }

    public static ArrayList<PuntoReciclaje> mostrarDatosPuntosReciclaje() {
        ArrayList<PuntoReciclaje> datosPuntosReciclaje = ArchivoJson.recurperarPuntosReciclaje();
        return datosPuntosReciclaje;
    }

    public static ArrayList<PuntoReciclaje> mostrarCoincidenciasPuntosReciclaje() {
        ArrayList<PuntoReciclaje> datosPuntosReciclaje = ArchivoJson.recurperarCoincidenciasPuntosReciclaje();
        return datosPuntosReciclaje;
    }

    public static PuntoReciclaje mostrarResultadoPuntoReciclaje() {
        PuntoReciclaje datosPuntosReciclaje = ArchivoJson.recurperarResultadoPuntoReciclaje();
        return datosPuntosReciclaje;
    }

    public static void editarDatosPuntoReciclaje(PuntoReciclaje ptoReciclaje) {
            List<PuntoReciclaje> listaDatosPuntosReciclaje = ArchivoJson.recurperarPuntosReciclaje();
            listaDatosPuntosReciclaje.stream().filter((PuntoReciclaje puntoReciclaje) -> {
                if (puntoReciclaje.getDireccion().equalsIgnoreCase(ptoReciclaje.getDireccion())
                        || puntoReciclaje.getLatitud() == ptoReciclaje.getLatitud()
                        && puntoReciclaje.getLongitud() == ptoReciclaje.getLongitud()) {
                    if (ptoReciclaje.getCantidadVecesVisitada() != 0
                            && ptoReciclaje.getCantidadVecesVisitada() != puntoReciclaje.getCantidadVecesVisitada()) {
                        puntoReciclaje.setCantidadVecesVisitada(ptoReciclaje.getCantidadVecesVisitada());
                    }
                    if (ptoReciclaje.getCantidadReciclada() != 0
                            && ptoReciclaje.getCantidadReciclada() != puntoReciclaje.getCantidadReciclada()) {
                        puntoReciclaje.setCantidadReciclada(ptoReciclaje.getCantidadReciclada());
                    }
                    if (ptoReciclaje.getCategorias() != null
                            && ptoReciclaje.getCategorias() != puntoReciclaje.getCategorias()) {
                        puntoReciclaje.setCategorias(ptoReciclaje.getCategorias());
                    }
                }
                return true;
            }).distinct().collect(Collectors.toList());
            ArchivoJson.almacenarPuntosReciclaje((ArrayList<PuntoReciclaje>) listaDatosPuntosReciclaje);
    }

    public static void borrarDatosPuntoReciclaje(PuntoReciclaje ptoReciclaje) {
            ArrayList<PuntoReciclaje> listaDatosPuntosReciclaje = ArchivoJson.recurperarPuntosReciclaje();
            ArrayList<PuntoReciclaje> listaPorAlmacenar=ArchivoJson.recurperarPuntosReciclaje();
            listaDatosPuntosReciclaje.forEach((PuntoReciclaje puntoReciclaje) -> {
                if (puntoReciclaje.getDireccion().equalsIgnoreCase(ptoReciclaje.getDireccion())
                        || puntoReciclaje.getLatitud() == ptoReciclaje.getLatitud()
                        && puntoReciclaje.getLongitud() == ptoReciclaje.getLongitud()
                        || puntoReciclaje.getCategorias() == ptoReciclaje.getCategorias()) {
                    listaPorAlmacenar.remove(puntoReciclaje);
                }
            });
            ArchivoJson.almacenarPuntosReciclaje(listaPorAlmacenar);
    }

    @Override
    public String toString() {
        return "PuntoReciclaje{" + "direccion=" + direccion + ", latitud=" + latitud + ", longitud=" + longitud + ", categorias=" + categorias + ", cantidadReciclada=" + cantidadReciclada + ", cantidadVecesVisitada=" + cantidadVecesVisitada + '}';
    }

}
