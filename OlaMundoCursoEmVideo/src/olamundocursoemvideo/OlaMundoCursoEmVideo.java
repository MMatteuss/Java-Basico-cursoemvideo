package olamundocursoemvideo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OlaMundoCursoEmVideo {
    public static void main(String[] args) {
        Date data = new Date();
        SimpleDateFormat hformatador = new SimpleDateFormat("hh:mm:ss");
        String sHora = hformatador.format(data);
        System.out.println(sHora);
    }    
}
