import com.main.comportement.*;

public class Guerrier extends Personnage {

    public Guerrier(){
        this.espritCombatif = new CombatPistolet();
    }

    public Guerrier(EspritCombatif esprit, Deplacement dep, Soin soin){
        super(esprit,dep,soin);
    }
}
