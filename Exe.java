
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hectico
 */
public class Exe {
//Lo hice solo para numeros , habia olvidado la clase <T>
    public static void main(String[] args) {
        int opcion = 0, nodo_info = 0;
        Cola cola = new Cola();
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menú de Opciones\n\n"
                        + "1 Insertar un nodo\n"
                        + "2 Extraer un nodo\n"
                        + "3 Mostrar info de la cola \n"
                        + "4 Salir.\n\n"));

                switch (opcion) {
                    case 1:
                        nodo_info= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el valor"));
                        cola.insertar(nodo_info);
                        break;
                    case 2:
                        if (!cola.Cola_Vacia()) {
                          JOptionPane.showMessageDialog(null, "Se extrajo  "+ cola.extraer());
                        } else {JOptionPane.showMessageDialog(null, "La cola esta vacia  ");
                        }
                        break;
                    case 3:
                        cola.mostrar_info();
                        break;
                        case 4 :
                            opcion=4;
                       break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion no valida ");
                        break;
                }

            } catch (NumberFormatException e) {
            }
        } while (opcion != 4);

    }
}
