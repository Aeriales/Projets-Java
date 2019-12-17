public class chien extends canin implements rintintin {

    public chien(){

    }

    public chien(String couleur, int poids){
        this.couleur=couleur;
        this.poids=poids;
    }

    void crier(){
        System.out.println("J'aboie tout le temps");
    }

    public void fairelebeau() {
        System.out.println("Je fais le beau");
    }

    public void fairecalin() {
        System.out.println("Je fais des calins");
    }

    public void fairelechouille() {
        System.out.println("Je fais de grosses lechouilles");
    }
}
