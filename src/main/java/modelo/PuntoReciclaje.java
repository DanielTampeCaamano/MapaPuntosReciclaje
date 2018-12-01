package modelo;

import datos.Archivo;
import java.util.ArrayList;
import java.util.List;

public class PuntoReciclaje {

    private String direccion;
    private double latitud;
    private double longitud;
    private ArrayList<Categoria> categorias;
    private double cantidadReciclada;
    private int cantidadVecesVisitada;
    private static String rutaDatosPuntosReciclaje = "datos/datosPuntoReciclaje/PuntosReciclaje.txt";

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

    public static void guardarDatosPuntosReciclaje(PuntoReciclaje puntoReciclaje) {
        if (Archivo.existeArchivo(rutaDatosPuntosReciclaje)) {// Verifica si existe el archivo indicado en la ruta
            List<String> listaDatosPuntosReciclaje = Archivo.leerArchivoComoListaString(rutaDatosPuntosReciclaje);// Se almacena los datos de los administradores en una Lista<String>, cada posicion de la lista equivale a una linea
            String datosPuntoReciclaje;
            String texto = "";
            datosPuntoReciclaje = puntoReciclaje.toString();
            listaDatosPuntosReciclaje.add(datosPuntoReciclaje);
            for (int i = 0; i < listaDatosPuntosReciclaje.size(); i++) {
                texto += listaDatosPuntosReciclaje.get(i) + "\n";
            }
            Archivo.eliminarArchivo(rutaDatosPuntosReciclaje);
            Archivo.crearArchivo(rutaDatosPuntosReciclaje, texto);
        } else {
            String texto;
            texto = puntoReciclaje.toString();
            Archivo.crearArchivo(rutaDatosPuntosReciclaje, texto);
        }
    }

    public static void borrarDatosPuntoReciclaje(String direccion) {
        if (Archivo.existeArchivo(rutaDatosPuntosReciclaje)) {
            String texto = "";

            List<String> listaDatosPuntosReciclaje = Archivo.leerArchivoComoListaString(rutaDatosPuntosReciclaje);
            for (int i = 0; i < listaDatosPuntosReciclaje.size(); i++) {
                if (listaDatosPuntosReciclaje.get(i).contains(direccion)) {
                    listaDatosPuntosReciclaje.remove(i);
                }
            }
            for (int i = 0; i < listaDatosPuntosReciclaje.size(); i++) {
                texto += listaDatosPuntosReciclaje.get(i) + "\n";
            }
            Archivo.eliminarArchivo(rutaDatosPuntosReciclaje);
            Archivo.crearArchivo(rutaDatosPuntosReciclaje, texto);
        } else {
            System.out.println("No existe el archivo en la ruta de destino...");
        }
    }

    public String leerInformacionMapaComoString() {
        String texto = "";// Se crea una variable String para almacenar datos
        if (Archivo.existeArchivo(rutaDatosPuntosReciclaje)) {// Verifica que el Archivo exista en la Ruta indicada
            texto = Archivo.leerArchivoComoString(rutaDatosPuntosReciclaje);// Traspasa la informacion almacenada en el archivo.txt a la variable como String
        }
        return texto;// Retorna el String que contiene los datos obtenidos
    }

    public List<String> leerInformacionMapaComoListaString() {
        List<String> textoLista = null;// Se crea una Lista String para almacenar datos
        if (Archivo.existeArchivo(rutaDatosPuntosReciclaje)) {// Verifica que el Archivo exista en la Ruta indicada
            textoLista = Archivo.leerArchivoComoListaString(rutaDatosPuntosReciclaje);// Traspasa la informacion Almacenada en el Archivo.txt a la lista como Lista<String>
        }
        return textoLista;// Retorna la Lista que contiene los datos obtenidos
    }

    @Override
    public String toString() {
        String linea;
        linea = this.direccion + "," + this.latitud + "," + this.longitud + "," + this.cantidadReciclada + "," + this.cantidadVecesVisitada;
        for (int i = 0; i < this.categorias.size(); i++) {
            linea += "," + categorias.get(i).toString();
        }
        linea += "\n";
        return linea;
    }
}
