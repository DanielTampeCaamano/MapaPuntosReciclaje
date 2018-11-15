package modelo;

import datos.Archivo;
import java.util.ArrayList;
import java.util.List;

public class Mapa {

    private ArrayList<API> api = new ArrayList<>(); //PENDIENTE IMPLEMENTACION
    private ArrayList<PuntoReciclaje> puntosReciclaje = new ArrayList<>();

    public Mapa() {
        cargarMapa();
    }

    private void cargarMapa() {
        if (Archivo.existeArchivo("datos/datosMapa/Mapa.txt")) {
            List<String> listaTexto;
            listaTexto = leerInformacionMapaComoListaString();
            for (int i = 0; i < listaTexto.size(); i++) {
                String cadena = listaTexto.get(i);
                String[] linea = cadena.split(",");
                ArrayList<Categoria> categorias = null;
                for (int j = 2; j < linea.length - 2; j++) {
                    if (null != linea[j]) {
                        switch (linea[j]) {
                            case "BATERIAPILA": {
                                Categoria categoria = null;
                                categoria = categoria.BATERIAPILA;
                                categorias.add(categoria);
                                break;
                            }
                            case "METAL": {
                                Categoria categoria = null;
                                categoria = categoria.METAL;
                                categorias.add(categoria);
                                break;
                            }
                            case "PAPEL": {
                                Categoria categoria = null;
                                categoria = categoria.PAPEL;
                                categorias.add(categoria);
                                break;
                            }
                            case "PLASTICO": {
                                Categoria categoria = null;
                                categoria = categoria.PLASTICO;
                                categorias.add(categoria);
                                break;
                            }
                            case "VIDRIO": {
                                Categoria categoria = null;
                                categoria = categoria.VIDRIO;
                                categorias.add(categoria);
                                break;
                            }
                            default:
                                break;
                        }
                    }

                }
                PuntoReciclaje puntoReciclaje = new PuntoReciclaje(linea[0], linea[1], categorias, Double.parseDouble(linea[linea.length - 2]), Integer.parseInt(linea[linea.length - 1]));
                this.puntosReciclaje.add(puntoReciclaje);
            }
            System.out.println("Puntos de Reciclaje Cargados...");
            System.out.println("Mapa Cargado...");
        }else{
            System.out.println("Mapa Cargado...");
        }

    }

    public ArrayList<PuntoReciclaje> buscarPuntosReciclajeMedianteDireccion(String direccion) {
        ArrayList<PuntoReciclaje> coincidenciasPuntosReciclaje = null;
        for (int i = 0; i < this.puntosReciclaje.size(); i++) {
            if (this.puntosReciclaje.get(i).getDireccion().contains(direccion)) {
                coincidenciasPuntosReciclaje.add(this.puntosReciclaje.get(i));
            }
        }
        return coincidenciasPuntosReciclaje;
    }
    public ArrayList<PuntoReciclaje> buscarPuntosReciclajeMedianteCategoria(String categoria) {
        ArrayList<PuntoReciclaje> coincidenciasPuntosReciclaje = new ArrayList<>();
        for (int i = 0; i < this.puntosReciclaje.size(); i++) {
            if (this.puntosReciclaje.get(i).toString().contains(categoria)) {
                coincidenciasPuntosReciclaje.add(this.puntosReciclaje.get(i));
            }
        }
        return coincidenciasPuntosReciclaje;
    }

    public void guardarPuntoReciclajeMapa(String direccion, String coordenada, ArrayList<Categoria> categorias, double cantidadReciclada, int cantidadVecesVisitada) {
        PuntoReciclaje puntoReciclaje = new PuntoReciclaje(direccion, coordenada, categorias, cantidadReciclada, cantidadVecesVisitada);
        this.puntosReciclaje.add(puntoReciclaje);
        this.guardarInformacionMapa();
    }

    public void guardarPuntoReciclajeMapa(String direccion, String coordenada, ArrayList<Categoria> categorias) {
        PuntoReciclaje puntoReciclaje = new PuntoReciclaje(direccion, coordenada, categorias);
        this.puntosReciclaje.add(puntoReciclaje);
        this.guardarInformacionMapa();
    }

    public void editarPuntoReciclajeLocacionNueva(String direccion, String direccionNueva, String coordenadaNueva) {
        for (int i = 0; i < this.puntosReciclaje.size(); i++) {
            if (this.puntosReciclaje.get(i).getDireccion().contains(direccion)) {
                this.puntosReciclaje.get(i).setDireccion(direccionNueva);
                this.puntosReciclaje.get(i).setCoordenada(coordenadaNueva);
            }
        }
        this.editarInformacionMapa();
    }

    public void editarPuntoReciclajeCambioCategorias(String direccion, ArrayList<Categoria> categorias) {
        for (int i = 0; i < this.puntosReciclaje.size(); i++) {
            if (this.puntosReciclaje.get(i).getDireccion().contains(direccion)) {
                this.puntosReciclaje.get(i).setCategorias(categorias);
            }
        }
        this.editarInformacionMapa();
    }

    public void editarPuntoReciclajeCantidadRecicladaNueva(String direccion, double cantidadReciclada) {
        for (int i = 0; i < this.puntosReciclaje.size(); i++) {
            if (this.puntosReciclaje.get(i).getDireccion().contains(direccion)) {
                this.puntosReciclaje.get(i).setCantidadReciclada(cantidadReciclada);
            }
        }
        this.editarInformacionMapa();
    }

    public void editarPuntoReciclajeCantidadVecesVisitada(String direccion, int cantidadVecesVisitada) {
        for (int i = 0; i < this.puntosReciclaje.size(); i++) {
            if (this.puntosReciclaje.get(i).getDireccion().contains(direccion)) {
                this.puntosReciclaje.get(i).setCantidadVecesVisitada(cantidadVecesVisitada);
            }
        }
        this.editarInformacionMapa();
    }

    private void guardarInformacionMapa() {
        String texto = ""; // Se crea una variable del tipo "String" para poder acumular los datos de los puntos de reciclaje
        for (int i = 0; i < this.puntosReciclaje.size(); i++) { // Recorre el ArrayList de los puntos de reciclaje uno a uno
            texto += this.puntosReciclaje.get(i).toString();// Acumula en un String los datos de cada Punto de Reciclaje,uno a uno
        }
        Archivo.crearArchivo("datos/datosMapa/Mapa.txt", texto);// Crea un Archivo TXT en la ruta dada, apartir del textoLista que se recopiló de los datos de cada Punto de Reciclaje
    }

    public String leerInformacionMapaComoString() {
        String texto = "";// Se crea una variable String para almacenar datos
        if (Archivo.existeArchivo("datos/datosMapa/Mapa.txt")) {// Verifica que el Archivo exista en la Ruta indicada
            texto = Archivo.leerArchivoComoString("datos/datosMapa/Mapa.txt");// Traspasa la informacion almacenada en el archivo.txt a la variable como String
        }
        return texto;// Retorna el String que contiene los datos obtenidos
    }

    public List<String> leerInformacionMapaComoListaString() {
        List<String> textoLista = null;// Se crea una Lista String para almacenar datos
        if (Archivo.existeArchivo("datos/datosMapa/Mapa.txt")) {// Verifica que el Archivo exista en la Ruta indicada
            textoLista = Archivo.leerArchivoComoListaString("datos/datosMapa/Mapa.txt");// Traspasa la informacion Almacenada en el Archivo.txt a la lista como Lista<String>
        }
        return textoLista;// Retorna la Lista que contiene los datos obtenidos
    }

    private void editarInformacionMapa() {
        String texto = ""; // Se crea una variable del tipo "String" para poder acumular los datos de los puntos de reciclaje
        Archivo.eliminarArchivo("datos/datosMapa/Mapa.txt"); // Elimina el registro previo de los datos del Mapa
        for (int i = 0; i < this.puntosReciclaje.size(); i++) { // Recorre el ArrayList de los puntos de reciclaje uno a uno
            texto += this.puntosReciclaje.get(i).toString();// Acumula en un String los datos de cada Punto de Reciclaje,uno a uno
        }
        Archivo.crearArchivo("datos/datosMapa/Mapa.txt", texto);// Crea un Archivo TXT en la ruta dada, apartir del textoLista que se recopiló de los datos del Mapa
    }

    public void borrarInformacionMapa() {
        Archivo.eliminarArchivo("datos/datosMapa/Mapa.txt"); // Elimina el registro de los datos del Mapa
    }

}
