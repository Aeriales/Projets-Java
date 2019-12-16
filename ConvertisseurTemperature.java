import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char reponse = ' ';
        do {
            System.out.println("Convertisseur de température Celsius/Farenheit");
            System.out.println("----------------------------------------------");
            System.out.println("Modes de conversion");
            System.out.println("1 - Celsius vers Farenheit");
            System.out.println("2 - Farenheit vers Celsius");
            System.out.println("Quel mode souhaitez-vous utiliser?");
            int mode = sc.nextInt();
            if (mode != 1 && mode != 2) {
                System.out.println("Vous n'avez pas choisi l'un de mes modes de conversion");
            } else {
                System.out.println("Quel température souhaitez-vous convertir?");
                float temp = sc.nextFloat();
                if (mode == 1) {
                    float tempf = (((float)(9) /(float)(5)) * temp) + 32;
                    System.out.println("La conversion a été effectuée: " + temp + " degrés Celsius correspondent à " + tempf + " degrés Farenheit");
                } else {
                    float tempc = ((temp - 32) * 5) / 9;
                    System.out.println("La conversion a été effectuée: " + temp + " degrés Farenheit correspondent à " + tempc + " degrés Celsius");
                }
            }
            do {
                System.out.println("Souhaitez-vous recommencer? o/n");
                sc.nextLine();
                reponse = sc.nextLine().charAt(0);
            } while (reponse != 'o' && reponse != 'n');
        } while (reponse == 'o');
        System.out.println("Au revoir!");
        }
    }
