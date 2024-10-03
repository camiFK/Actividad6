import classes.Canal;
import classes.Usuario;

public class YoutubeApp {
    public static void main(String[] args) throws Exception {
        Canal nuevoCanal = new Canal("Marito Baracus");

        Usuario usuario1 = new Usuario("Camila");
        Usuario usuario2 = new Usuario("Juan");

        // Aplicamos metodos
        nuevoCanal.suscribir(usuario1);
        nuevoCanal.suscribir(usuario2);
        nuevoCanal.subirVideo("Programando en Java con el patron Observer");

    }
}
