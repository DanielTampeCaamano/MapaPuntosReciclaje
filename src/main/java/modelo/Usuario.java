package modelo;

import datos.Archivo;
import java.util.List;
import java.util.Random;

public class Usuario {

    private int numeroUsuario;

    public Usuario() {
        Random azar=new Random();
        this.numeroUsuario = azar.nextInt(10000000)+1;
    }

    public Usuario(int numeroUsuario) {
        this.numeroUsuario = numeroUsuario;
    }

    public void setNumeroUsuario(int numeroUsuario) {
        this.numeroUsuario = numeroUsuario;
    }

    public int getNumeroUsuario() {
        return numeroUsuario;
    }

    public static void guardarDatosUsuario(int numeroUsuario) {
        if (Archivo.existeArchivo("datos/datosUsuarios/Usuarios.txt")) {
            List<String> listaDatosUsuarios = Archivo.leerArchivoComoListaString("datos/datosUsuarios/Usuarios.txt");
            String datosUsuario = "";
            String texto = "";
            datosUsuario = "" + numeroUsuario + "";
            listaDatosUsuarios.add(datosUsuario);
            for (int i = 0; i < listaDatosUsuarios.size(); i++) {
                texto += listaDatosUsuarios.get(i) + "\n";
            }
            Archivo.eliminarArchivo("datos/datosUsuarios/Usuarios.txt");
            Archivo.crearArchivo("datos/datosUsuarios/Usuarios.txt", texto);
        } else {
            String datosUsuario = "";
            Archivo.crearDirectorio("datos/datosUsuarios");
            datosUsuario = "" + numeroUsuario + "\n";
            Archivo.crearArchivo("datos/datosUsuarios/Usuarios.txt", datosUsuario);
        }
    }

    public static String mostrarDatosUsuario(int numeroUsuario) {
        String datosUsuario = "";
        List<String> listaUsuarios = Archivo.leerArchivoComoListaString("datos/datosUsuarios/Usuarios.txt");
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i).contains("" + numeroUsuario + "")) {
                datosUsuario = listaUsuarios.get(i);
            }
        }
        return datosUsuario;
    }

    public static void editarDatosUsuario(int numeroUsuario, int numeroUsuarioNuevo) {
        if (Archivo.existeArchivo("datos/datosUsuarios/Usuarios.txt")) {
            String datosUsuario;
            String datosUsuarioAlmacenable = "";
            List<String> listaUsuarios = Archivo.leerArchivoComoListaString("datos/datosUsuarios/Usuarios.txt");
            for (int i = 0; i < listaUsuarios.size(); i++) {
                if (listaUsuarios.get(i).contains("" + numeroUsuario + "")) {
                    datosUsuario = "" + numeroUsuarioNuevo + "";
                    listaUsuarios.remove(i);
                    listaUsuarios.add(i, datosUsuario);
                }
            }
            for (int i = 0; i < listaUsuarios.size(); i++) {
                datosUsuarioAlmacenable += listaUsuarios.get(i) + "\n";
            }
            Archivo.eliminarArchivo("datos/datosUsuarios/Usuarios.txt");
            Archivo.crearArchivo("datos/datosUsuarios/Usuarios.txt", datosUsuarioAlmacenable);
        }
    }

    public static void borrarDatosUsuario(int numeroUsuario) {
        if (Archivo.existeArchivo("datos/datosUsuarios/Usuarios.txt")) {
            String datosUsuariosAlmacenable = "";
            List<String> listaUsuarios = Archivo.leerArchivoComoListaString("datos/datosUsuarios/Usuarios.txt");
            for (int i = 0; i < listaUsuarios.size(); i++) {
                if (listaUsuarios.get(i).contains("" + numeroUsuario + "")) {
                    listaUsuarios.remove(i);
                }
            }
            for (int i = 0; i < listaUsuarios.size(); i++) {
                datosUsuariosAlmacenable = listaUsuarios.get(i) + "\n";
            }
            Archivo.eliminarArchivo("atos/datosUsuarios/Usuarios.txt");
            Archivo.crearArchivo("datos/datosUsuarios/Usuarios.txt", datosUsuariosAlmacenable);
        }

    }

}
