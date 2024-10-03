package classes;
import java.util.ArrayList;
import java.util.List;
import Interfaces.IObserver;

public class Canal {
    private List<IObserver> subscriptores = new ArrayList<>();
    private String tituloVideo;
    private String nombre;

    public Canal(String nombre) {
        this.nombre = nombre;
    }

    public void subirVideo(String title) {
        this.tituloVideo = title;
        System.out.println("El canal de Youtube " + this.nombre + " ha suido un nuevo video: " + title);
        notificarUsuarios();
    }

    public void suscribir(IObserver subscriptor) {
        subscriptores.add(subscriptor);
        System.out.println("Se ha agregado un nuevo subscriptor al canal " + this.nombre);
    }

    public void desuscribir(IObserver subscriptor) {
        subscriptores.remove(subscriptor);
        System.out.println("Se ha quitado un subscriptor de la lista del canal " + this.nombre);
    }

    public void notificarUsuarios() {
        for (IObserver subscriber : subscriptores) {
            subscriber.update(tituloVideo, nombre);
        }
    }

}
