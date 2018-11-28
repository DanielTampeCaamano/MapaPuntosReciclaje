package modelo;

import java.util.ArrayList;

public class PuntoReciclaje {

    private String direccion;
    private String coordenada;
    private ArrayList<Categoria> categorias;
    private double cantidadReciclada;
    private int cantidadVecesVisitada;

    public PuntoReciclaje(String direccion, String coordenada, ArrayList<Categoria> categorias) {
        this.direccion = direccion;
        this.coordenada = coordenada;
        this.categorias = categorias;
        this.cantidadReciclada = 0;
        this.cantidadVecesVisitada = 0;
    }

    public PuntoReciclaje(String direccion, String coordenada, ArrayList<Categoria> categorias, double cantidadReciclada, int cantidadVecesVisitada) {
        this.direccion = direccion;
        this.coordenada = coordenada;
        this.categorias=categorias;
        this.cantidadReciclada = cantidadReciclada;
        this.cantidadVecesVisitada = cantidadVecesVisitada;
    }
    public PuntoReciclaje(String direccion, String coordenada, ArrayList<Categoria> categorias, int cantidadVecesVisitada) {
        this.direccion = direccion;
        this.coordenada = coordenada;
        this.categorias=categorias;
        this.cantidadReciclada = 0;
        this.cantidadVecesVisitada = cantidadVecesVisitada;
    }
    public PuntoReciclaje(String direccion, String coordenada, ArrayList<Categoria> categorias, double cantidadReciclada) {
        this.direccion = direccion;
        this.coordenada = coordenada;
        this.categorias=categorias;
        this.cantidadReciclada = cantidadReciclada;
        this.cantidadVecesVisitada = 0;
    }

    

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCoordenada() {
        return this.coordenada;
    }

    public void setCoordenada(String coordenada) {
        this.coordenada = coordenada;
    }

    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(ArrayList<Categoria> categorias) {
        this.categorias = categorias;
    }
    
    public double getCantidadReciclada() {
        return this.cantidadReciclada;
    }

    public void setCantidadReciclada(double cantidadReciclada) {
        this.cantidadReciclada = cantidadReciclada;
    }

    public int getCantidadVecesVisitada() {
        return this.cantidadVecesVisitada;
    }

    public void setCantidadVecesVisitada(int cantidadVecesVisitada) {
        this.cantidadVecesVisitada = cantidadVecesVisitada;
    }

    @Override
    public String toString(){
        String linea;
        linea=this.direccion+","+this.coordenada+","+this.cantidadReciclada+","+this.cantidadVecesVisitada;
        for (int i = 0; i < this.categorias.size(); i++) {
            linea+=","+categorias.get(i).toString();
        }
        linea+=";";
        return linea;
    }
}
