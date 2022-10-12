import com.sun.source.tree.DoWhileLoopTree;

public class Main {

    public static void main(String[] args){
        int numeroIf = 12;
        int numeroWhile = 0;
        int numeroDoWhile =0;
        int estacion = 1;


        if (numeroIf <0){
            System.out.println("el número es negativo");
        } if (numeroIf>0){
            System.out.println("el número es positivo");
        } if (numeroIf==0){
            System.out.println("el número es cero");
        }


        while (numeroWhile <3){
            numeroWhile++;
            System.out.println("el numeroWhile es: " + numeroWhile);
        }

        do{
            numeroDoWhile = numeroDoWhile+1;
            System.out.println("el numeroDoWhile es: " + numeroDoWhile);
        }while(numeroDoWhile <1);

        for (int numeroFor = 0; numeroFor<=3; numeroFor++){
            System.out.println("El numeroFor es: " + numeroFor);
        }
        System.out.println("Revisión de la estación Actual... ");
        switch (estacion){
            case 1:{
                System.out.println("Estamos en verano");
                break;
            }
            case 2:{
                System.out.println("Estamos en invierno");
                break;
            }
            case 3:{
                System.out.println("Estamos en otoño");
                break;
            }
            case 4:{
                System.out.println("Estamos en primavera");
                break;
            }
            default:{
                System.out.println("No ingresaste una estación válida");
            }
        }

    }

}
