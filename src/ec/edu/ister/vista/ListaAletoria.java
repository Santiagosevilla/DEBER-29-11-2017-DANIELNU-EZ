package ec.edu.ister.vista;
import ec.edu.ister.modelo.Lista;
import java.util.Random;
public class ListaAletoria {
    public static void main(String[] args) {
        Random r;
        int d;
        Lista lista;
        int k;
        r=new Random(); 
        lista=new Lista();                      
        k=Math.abs(r.nextInt()%50);             
                                                

        for(;k>0;k--){
            d=r.nextInt()%90;
            lista.insertarCabezaLista(d);   
        }
                                                
        System.out.println("Elementos de la lista generados al azar");
        lista.visualizar();    
    }

}