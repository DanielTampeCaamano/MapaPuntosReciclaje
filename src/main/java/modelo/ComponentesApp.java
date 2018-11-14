package modelo;

import datos.Archivo;
import java.util.ArrayList;
import java.util.List;

public class ComponentesApp {

    private ArrayList<Mapa> mapas = new ArrayList<>();
    private ArrayList<Administrador> administradores = new ArrayList<>();
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public ComponentesApp() {
        cargarComponentes();
    }

    private void cargarComponentes() {
        if (Archivo.existeArchivo("Datos/DatosMapa")==false) {
            Archivo.crearDirectorio("Datos/DatosMapa");// Crea el Directorio indicado en la Ruta en caso de que no existiera
        }
        if (Archivo.existeArchivo("Datos/DatosAdministradores")==false) {
            Archivo.crearDirectorio("Datos/DatosAdministradores");// Se Repite lo mismo de arriba
        }
        if (Archivo.existeArchivo("Datos/DatosUsuarios")==false) {
            Archivo.crearDirectorio("Datos/DatosUsuarios");// Se Repite lo mismo de arriba
        }
        Mapa mapa = new Mapa();// Esto es en consideracion de que hasta el momento estamos utilizando un solo Mapa representando Temuco.
        mapas.add(mapa);// Esto esta sujeto a cambios conforme se requiera el uso de mas mapas.
        if (Archivo.existeArchivo("Datos/DatosAdministradores/Administradores.txt")) {// Verifica si existe el Archivo en la Ruta indicada, avanzando en caso que sea verdadero
            List<String> listaTextoAdministradores;
            listaTextoAdministradores = Archivo.leerArchivoComoListaString("Datos/DatosAdministradores/Administradores.txt");// Se utiliza la lista de String para almacenar los datos del txt de manera que cada linea del txt equivale a una posicion de la lista
            for (int i = 0; i < listaTextoAdministradores.size(); i++) {// Se entra a un Ciclo que recorre la lista
                String cadenaAdministrador = listaTextoAdministradores.get(i);// Se asigna a una variable String el valor del elemento en la posicion "i" de la Lista String
                String[] datosAdministrador = cadenaAdministrador.split(",");// De la variable String que se utilizó, se divide a partir de las "," y luego, se guarda en un vector lo que se divide de este obteniendo asi los datos por separado
                Administrador administrador = new Administrador(datosAdministrador[0], datosAdministrador[1], datosAdministrador[2]);// se instancia un Administrador utilizando los datos obtenidos
                this.administradores.add(administrador);// El Administrador instanciado se guarda en el ArrayList de Administradores
            }
            System.out.println("Administrador(es) Cargados...");
        } else {
            System.out.println("Administrador(es) No Cargados");
        }
        if (Archivo.existeArchivo("Datos/DatosUsuarios/Usuarios.txt")) {// Verifica si existe el Archivo en la Ruta indicada, avanzando en caso que sea verdadero
            List<String> listaTextoUsuarios;
            listaTextoUsuarios = Archivo.leerArchivoComoListaString("Datos/DatosUsuarios/Usuarios.txt");// Se Utiliza la Lista String Para Almacenar los Datos de los Usuarios, cada posicion equivale a una linea en el archivo
            for (int i = 0; i < listaTextoUsuarios.size(); i++) {// Entra en un Ciclo para recorrer la Lista de Usuarios
                Usuario usuario = new Usuario(Integer.parseInt(listaTextoUsuarios.get(i)));// Se instancia un Usuario a partir de la informacion que entrega la linea almacenada en la la lista en la posicion "i"
                this.usuarios.add(usuario);// Se almacena el usuario instanciado en el ArrayList de Usuarios
            }
            System.out.println("Usuario(s) Cargados...");
        } else {
            System.out.println("Usuario(s) No Cargados");
        }

    }

    public ArrayList<Mapa> getMapas() {
        return mapas;
    }

    public void setMapas(ArrayList<Mapa> mapas) {
        this.mapas = mapas;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Administrador> getAdministradores() {
        return administradores;
    }

    public void setAdministradores(ArrayList<Administrador> administradores) {
        this.administradores = administradores;
    }

}
