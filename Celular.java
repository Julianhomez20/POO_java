/*
 * Clase Celular
*/
public class Celular {
    /*
     * Atributos 
     * 
     */
    String marca;
    String modelo;
    int año;
    int almacenamiento;
    int ram;

    /*
     * Constructor de la clase 
     * @param marca Marca del celular
     * @param modelo Modelo del celular
     * @param año Año de salida del celular
     * @param almacenamiento Almacenamiento en GB del celular
     * @param ram Ram de el celular
     */
    Celular (String marca, String modelo, int año, int almacenamiento, int ram) {
        /*
         * Es necesario usar this ya que los parametros dados al constructos
         * Son iguales a los de la clase 
         */
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.almacenamiento = almacenamiento;
        this.ram = ram; 


    }

    /*
     * Metodo para imprimir las especificaciones del celular
     * Complejidad temporal -> O(1) Complejidad constante
     */

     void presentarCelular () {
        System.out.println(marca + " presento su " + modelo + " en el año " + año + " con " + almacenamiento + " Gb y " + ram + " GB de ram");

     }
}
