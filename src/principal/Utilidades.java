package principal;

//AWT
import java.awt.Image;

//Excepciones
import java.text.ParseException;

//Formato Fecha: Año-Mes-Día
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Swing
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Utilidades {

    //Agrega una imagen reescalada SMOOTH a un JLabel
    public static void setImageLabel(int x, int y, JLabel label, String root) {

        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(
                image.getImage().getScaledInstance(x, y, Image.SCALE_SMOOTH)
        );
        label.setIcon(icon);

    }

    //Agrega una imagen reescalada SMOOTH a un JButton
    public static void setImageButton(JButton b, String url, int x, int y) {

        ImageIcon image = new ImageIcon(url);
        b.setIcon(new ImageIcon(image.getImage().getScaledInstance(x, y, Image.SCALE_SMOOTH)));

    }

    //Agrega un JPanel o Vista dentro del JPanel Contenedor
    public static void setView(JPanel panel, JPanel contenedor, int x, int y) {

        panel.setSize(x, y);
        panel.setLocation(0, 0);

        contenedor.removeAll();
        contenedor.add(panel);
        contenedor.revalidate();
        contenedor.repaint();

    }

    //Verifica que la cadena recibida contenga solo números
    public static void esNumero(String num) throws NumberFormatException {

        if (num.length() == 11) {
            String cadena_1 = num.substring(0, 6);
            String cadena_2 = num.substring(6, 11);
            Integer.valueOf(cadena_1);
            Integer.valueOf(cadena_2);
        } else {
            Integer.valueOf("ERROR");
        }

    }

    //Verifica que la cadena recibida cumpla con el formato Año-Mes-Día
    public static void esFecha(String fecha) throws ParseException {

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        formato.setLenient(false);
        String regex = "^\\d{4}-\\d{2}-\\d{2}$"; //Expresión regular para el formato yyyy-MM-dd
        Pattern pattern = Pattern.compile(regex); //Compila la expresión 
        Matcher matcher = pattern.matcher(fecha); // Compara la expresión con la fecha

        if (!matcher.matches()) { //Valida si la expresión es igual o distinta a la fecha
            formato.parse("ERROR"); //Genera un error al comparar el formato yyyy-MM-dd con la cadena "ERROR"
        } else {
            formato.parse(fecha); //Compara el formato con la fecha, si da error, salta al catch
        }

    }

    //Convierte a String los datos según los enteros recibidos
    public static String[] comboFecha(int año, int mes, int dia) {
        
        String añoS = "" + año, mesS, diaS;
        String[] fecha = new String[3];
        
        if (año == -1) {
            añoS = "Año";
        }
        
        if (mes == -1) {
            mesS = "Mes";
        } else if (mes <= 9) {
            mesS = "0" + mes;
        } else {
            mesS = "" + mes;
        }
        
        if (dia == -1) {
            diaS = "Día";
        } else if (dia <= 9) {
            diaS = "0" + dia;
        } else {
            diaS = "" + dia;
        }
        
        fecha[0] = añoS;
        fecha[1] = mesS;
        fecha[2] = diaS;
        
        return fecha;
        
    }

}
