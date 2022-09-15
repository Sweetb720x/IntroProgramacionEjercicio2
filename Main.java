public class Main {
    public static void main(String[] args) {
        int numeroIf = 1;
        if (numeroIf < 0) {
            System.out.println("Negativo");
        } else if (numeroIf == 0) {
            System.out.println("0");
        } else {
            System.out.println("Positivo");
        }

        int numeroWhile = 0;
        while(numeroWhile < 3){
            numeroWhile++;
            System.out.println("While->" + numeroWhile);
        }
        do {
            numeroWhile++;
            System.out.println("Do while-> " + numeroWhile);
        } while (numeroWhile < 3);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("For-> " + numeroFor);
        }

        String estacion = "Verano";
        switch (estacion){
            case ("Primavera"):
                System.out.println("Es primavera");
                break;
            case ("Otoño"):
                System.out.println("Es otoño");
                break;
            case ("Verano"):
                System.out.println("Es verano");
                break;
            case ("Invierno"):
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("Esto no es una estacion");
        }
    }
}
