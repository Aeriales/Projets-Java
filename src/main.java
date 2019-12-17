public class main {
    public static void main(String[] args) {
        chien c = new chien("Gris bleuté", 20);
        c.boire();
        c.manger();
        c.deplacement();
        c.crier();
        System.out.println(c.toString());

        System.out.println("--------------------------------------------");
        //Les méthodes de l'interface
        c.fairecalin();
        c.fairelebeau();
        c.fairelechouille();

        System.out.println("--------------------------------------------");
        //Utilisons le polymorphisme de notre interface
        rintintin r = new chien();
        r.fairelebeau();
        r.fairecalin();
        r.fairelechouille();
    }
}
