package boletin20;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import paquete2.Libro;
import paquete2.Metodos;

/**
 *
 * @author DANIELCASTELAO\mmartinezcosta
 */
public class Boletin20 {

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Libro> listaLibros = new ArrayList();
        Libro libro1 = new Libro("aab", "a1", "01", 9.99f, 15);
        listaLibros.add(libro1);
        Libro libro2 = new Libro("aac", "a2", "02", 19.99f, 25);
        listaLibros.add(libro2);
        Libro libro3 = new Libro("aaa", "a3", "03", 5.00f, 10);
        listaLibros.add(libro3);
        int opcion;
        Metodos obx = new Metodos();
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("   MENÚ  \n1-->Engadir libro\n2-->Amosar \n3-->Vender libros"
                    + "\n4-->Dar de baixa os libros con 0 unidades\n5-->Consulta de libro \n6-->Saír"));
            switch (opcion) {
                case 1:
                    listaLibros.add(obx.crearLibro());
                    break;
                case 2:
                    obx.amosar(listaLibros);
                    break;
                case 3:
                    obx.venderLibros(listaLibros);
                    break;
                case 4:
                    obx.darBaixa(listaLibros);
                    break;
                case 5:
                    obx.consultarLibro(listaLibros);
                    break;
                case 6:
                    obx.sair();
            }

        } while (opcion < 6);

    }

}
