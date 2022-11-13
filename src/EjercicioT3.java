public class EjercicioT3 {

    public static void main(String[] args) {

        int res = suma(10, 20, 30);
        System.out.println(res);

        Coche miCoche = new Coche();
        miCoche.addPuerta();
        System.out.println(miCoche.numPuertas);

    }

    public static int suma (int a, int b, int c){
        return (a+b+c);
    }

}

class Coche {

    public int numPuertas = 0;

    public void addPuerta(){
        numPuertas++;
    }

}
