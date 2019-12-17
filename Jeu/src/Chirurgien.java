import com.main.comportement.*;

public class Chirurgien extends Personnage {

    public Chirurgien(){
        this.soin = new Operation();
    }

    public Chirurgien(EspritCombatif esprit, Deplacement dep, Soin soin){
        super(esprit, dep, soin);
    }
}
