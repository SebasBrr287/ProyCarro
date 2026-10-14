package negocio;

public class Carro {
    private int potencia;
    private double velocidad;

    //atributo de clase

    private static int numCarros = 0;

    //constante de clase

    private static final double IVA = 0.15;

    public Carro(int potencia, double velocidad){

        /*
        this.potencia = potencia;
        this.velocidad = velocidad;

         */

        //si los atributos tienen validaciones utlizo el set()
        setPotencia(potencia);
        setVelocidad(velocidad);
        numCarros++;
    }

    public Carro() {
        // valores por asigancion 0 (this.potencia = 0), pero si piden se debe asignar un valor (this.potencia = 2)

        numCarros++;

    }

    /*
    Ingreso de informacion
    metodos set()
    "siempre" es void
    siempre recibe un parametro
    parametro generalmente es del mismo tipo de atributo
 */
    public void setPotencia(int potencia) {
       // almacenar solo si el dato es correcto
        if (potencia > 0)
            this.potencia = potencia;
    }

    public void setVelocidad(double velocidad){
        //actualizar si el dato es correcto sino setear el valor
        if(velocidad < 0)
            velocidad = 0;
        this.velocidad = velocidad;
    }

    /*
    sacar información
    get()
    siempre retorna valor
    el tipo de retorno generalmente es del mismo tipo del atributo
    si el metodo es void no retorna nada
     */

    public int getPotencia() {
        return potencia;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public static int getNumCarros(){
        return numCarros;
    }

    public static double getIva(){
        return IVA;
    }

    // si el resultado del metodo modifica un atributo el metodo es void, si el resultado del metodo no tengo donde almacenarlo retorno valor
    // si lo que necesita el metodo esta en los atributos no recibo parametros, si necesito datos externos necesito que me digan de afuera los valores

    public double calcularPrecio(double precio){
        return precio + (precio * IVA);
    }

    public void acelerar(){

        velocidad += potencia;
    }

    void frenar(){

        velocidad /= 2;
    }
}
