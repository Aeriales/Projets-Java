import com.main.comportement.*;

public class Sniper extends Personnage {

    public Sniper(){
        this.espritCombatif = new CombatFusil();
    }

    public Sniper(EspritCombatif esprit, Deplacement dep, Soin soin){
        super(esprit,dep,soin);
    }
}
