package classes;
import Interfaces.IObserver;

public class Usuario implements IObserver {
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void update(String tituloVideo, String nombreCanal) {
        System.out.println(nombre + ", hay un nuevo video disponible: " + tituloVideo + " en el canal " + nombreCanal);
    }
}
