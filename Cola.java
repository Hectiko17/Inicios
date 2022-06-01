
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
public class Cola {
    private Nodo inicio_cola, final_cola;
     String Cola= "";
    public Cola(){
     inicio_cola= null;
     final_cola= null;
     
     }
public boolean Cola_Vacia(){
    if (inicio_cola==null) {
        return true;
    }else return false;
}
public void insertar(int valor){
Nodo nodo_temp= new Nodo();
nodo_temp.valor= valor;
nodo_temp.siguiente=null;
    if (Cola_Vacia()) {
        inicio_cola= nodo_temp;
        final_cola= nodo_temp;
    } else {
    final_cola.siguiente= nodo_temp;
    final_cola= nodo_temp;
    }}
 public int extraer(){
     if (!Cola_Vacia()) {
         int valor= inicio_cola.valor;
         if (inicio_cola==final_cola) {
             inicio_cola=null;
             final_cola=null;
         } else {
             inicio_cola= inicio_cola.siguiente;
         }
         return valor;
     } else {
         return Integer.MAX_VALUE;
     }
 }
public void mostrar_info (){
Nodo recorrido= inicio_cola;
String ColaInvertida="";
    while (recorrido!=null) {        
        Cola+= recorrido.valor+" ";
        recorrido= recorrido.siguiente;
    }
String cadena []= Cola.split(" ");
    for (int i = cadena.length-1; i >=0;i--) {
        ColaInvertida+=" "+cadena[i];
    }
    JOptionPane.showMessageDialog(null, ColaInvertida);
    Cola="";
}





}




