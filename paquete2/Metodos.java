package paquete2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author mmartinezcosta
 */
public class Metodos {

    public Libro crearLibro() {

        Libro libro = new Libro(JOptionPane.showInputDialog("Titulo: "), JOptionPane.showInputDialog("Autor: "),
                JOptionPane.showInputDialog("ISBN: "), Float.parseFloat(JOptionPane.showInputDialog("Prezo: ")),
                Integer.parseInt(JOptionPane.showInputDialog("Numero Unidades: ")));
        System.out.println("Libro engadido");
        return libro;
    }

    public void amosar(ArrayList<Libro> lista) {
        if (lista.isEmpty()) {
            throw new NullPointerException("Erro. O ArrayList está vacio");

        } else {
            Collections.sort(lista);

            System.out.println("Amosar :");
            Iterator it = lista.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }
    }

    public void venderLibros(ArrayList<Libro> lista) {

        if (lista.isEmpty()) {
            throw new NullPointerException("Erro. O ArrayList está vacio");

        } else {

            String codigoLibro = JOptionPane.showInputDialog("Introduce o ISBN do libro vendido: ");
            int unidades = Integer.parseInt(JOptionPane.showInputDialog("Introduce o numero de unidades vendidas: "));
            for (int i = 0; i < lista.size(); i++) {
                if (codigoLibro.equals(lista.get(i).ISBN)) {
                    if (unidades <= lista.get(i).numUnidades) {
                        lista.get(i).numUnidades = (lista.get(i).numUnidades - unidades);
                    } else {
                        System.out.println("Erro, o numero de libros vendidos non pode superar ao numero de unidades disponibles");
                    }

                }
            }
        }

    }

    public void darBaixa(ArrayList<Libro> lista) {

        if (lista.isEmpty()) {
            throw new NullPointerException("Erro. O ArrayList está vacio");

        } else {

            int contador = 0;
            for (int j = 0; j < lista.size(); j++) {
                if (lista.get(j).numUnidades == 0) {
                    contador++;
                }
            }

            for (int k = 0; k < contador; k++) {
                for (int i = 0; i < lista.size(); i++) {
                    if (lista.get(i).numUnidades == 0) {
                        lista.remove(lista.get(i));
                        System.out.println("Libro dado de baixa.");
                    }
                }
            }
        }
    }

    public void consultarLibro(ArrayList<Libro> lista) {

        if (lista.isEmpty()) {
            throw new NullPointerException("Erro. O ArrayList está vacio");

        } else {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Como queres buscar o libro?|\n1-->Por titulo\n2-->Por autor"
                    + "\n3-->Por ISBN"));
            switch (opcion) {
                case 1:
                    String tit = JOptionPane.showInputDialog("Introduce o titulo do libro: ");
                    for (int i = 0; i < lista.size(); i++) {
                        if (lista.get(i).titulo.equals(tit)) {
                            System.out.println("O libro buscado é:\n" + lista.get(i));
                        }
                    }
                    System.out.println("");
                    break;
                case 2:
                    String autor = JOptionPane.showInputDialog("Introduce o autor do libro: ");
                    for (int i = 0; i < lista.size(); i++) {
                        if (lista.get(i).autor.equals(autor)) {
                            System.out.println("O libro buscado é:\n" + lista.get(i));
                        }
                    }
                    System.out.println("");
                    break;
                case 3:
                    String isbn = JOptionPane.showInputDialog("Introduce o autor do libro: ");
                    for (int i = 0; i < lista.size(); i++) {
                        if (lista.get(i).ISBN.equals(isbn)) {
                            System.out.println("O libro buscado é:\n" + lista.get(i));
                        }
                    }
                    System.out.println("");
                    break;

            }
        }

    }

    public void sair() {
        System.exit(0);

    }

}
