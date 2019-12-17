import com.main.comportement.*;

public class Medecin extends Personnage {

    public Medecin(){
        this.soin = new PremierSoin();
    }

    public Medecin(EspritCombatif esprit, Deplacement dep, Soin soin){
        super(esprit,dep,soin);
    }
}
