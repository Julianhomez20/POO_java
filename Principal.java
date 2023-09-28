/* 
 * Clase principal
 */
public class Principal  {
    /*
     * Primer metodo que se ejecuta
     * @param args 
     * Complejidad temporal : O(1) Complejidad constante
     */

     public static void main (String[]args ) {
        Celular iphone = new Celular("Apple", "Iphone 15 Pro", 2024, 256, 8);
        Celular samsung = new Celular("Samsung", "Galaxy S23 Ultra", 2023, 128, 12);


        iphone.presentarCelular();
        samsung.presentarCelular();

     }
}