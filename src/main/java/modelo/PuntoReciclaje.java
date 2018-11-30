package modelo;

import java.util.ArrayList;

public class PuntoReciclaje {

    private String direccion;
    private double latitud;
    private double longitud;
    private ArrayList<Categoria> categorias;
    private double cantidadReciclada;
    private int cantidadVecesVisitada;

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

    @Override
    public String toString() {
        String linea;
        linea = this.direccion + "," + this.latitud + "," + this.longitud + "," + this.cantidadReciclada + "," + this.cantidadVecesVisitada;
        for (int i = 0; i < this.categorias.size(); i++) {
            linea += "," + categorias.get(i).toString();
        }
        linea += ";";
        return linea;
    }
}
