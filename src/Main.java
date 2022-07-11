public class Main {
    public static void main(String[] args) {

        System.out.println("Problema 1: if");
        int numeroIf = 0;
        if(numeroIf > 0){
            System.out.println("La variable es positiva.");
        }else if (numeroIf < 0){
            System.out.println("La variable es negativa.");
        }else{
            System.out.println("La variable es 0.");
        }


        System.out.println("Problema 2: while");
        int numeroWhile = -1;
        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }


        System.out.println("Problema 3: do, while");
        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        }while(numeroWhile < 3);

        System.out.println("Problema 4: for");
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        System.out.println("Problema 5: Switch");
        var estacion = "Invierno";
        switch (estacion){
            case "Verano":
                System.out.println("Es Verano");
                break;
            case "Primavera":
                System.out.println("Es Primavera");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            default:
                System.out.println("No es una estacion");
        }
    }
}