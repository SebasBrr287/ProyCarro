package negocio;

public class MainCarro {
    static void main() { //"psvm" y tab para crear el main automaticamente
        Carro c1 = new Carro();
        Carro c2 = new Carro();
        Carro c3 = new Carro();


        c1.potencia = 2;
        c1.velocidad = 60;
        c2.potencia = 5;
        c2.velocidad = 100;
        c3.potencia = 2;
        c3.velocidad = 60;

        System.out.println("La pontencia del carro es "+c1.potencia+" y la velocidad es "+c1.velocidad);// sout y tab para imprimir

        c1.acelerar();
        c1.acelerar();
        c1.frenar();

        System.out.println("La pontencia del carro es "+c1.potencia+" y la velocidad es "+c1.velocidad);
        System.out.println("La pontencia del carro es "+c2.potencia+" y la velocidad es "+c2.velocidad);
        System.out.println("La pontencia del carro es "+c3.potencia+" y la velocidad es "+c3.velocidad);

        c2.frenar();
        c2.frenar();
        c2.frenar();

        System.out.println("La pontencia del carro es "+c2.potencia+" y la velocidad es "+c2.velocidad);

        c3.acelerar();
        c3.acelerar();
        c3.acelerar();
        c3.acelerar();
        c3.acelerar();

        System.out.println("La pontencia del carro es "+c3.potencia+" y la velocidad es "+c3.velocidad);



    }
}
