import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Jeu du nombre magique");
        System.out.println("---------------------");
        char reco;
        do {
            int reponse = rand.nextInt(101);
            System.out.println("Entrez un nombre entre 1 et 100");
            int essai = ' ';
            int i = 0;
            int j = 0;
            do {
                try {
                    essai = sc.nextInt();
                }
                catch (InputMismatchException e) {
                    System.out.println("Entrée invalide. Entrez un nombre!");
                    j++;
                    i -= j;
                    sc.nextLine();
                }
                if (essai < 0 || essai > 100) {
                    System.out.println(essai + " n'est pas compris entre 0 et 100");
                    j++;
                    i -= j;
                } else if (essai < reponse && essai >=0) {
                    System.out.println("Plus grand");
                } else if (essai > reponse && essai <=100) {
                    System.out.println("Plus petit");
                }
                i++;
            } while (essai != reponse);
            System.out.println("Bravo! Tu as trouvé la bonne réponse en " + i + " essais!");
            reco = ' ';
            while (reco != 'o' && reco !='n') {
                System.out.println("Souhaitez-vous rejouer?");
                sc.nextLine();
                reco = sc.nextLine().charAt(0);
            }
        } while (reco == 'o');
    }
}