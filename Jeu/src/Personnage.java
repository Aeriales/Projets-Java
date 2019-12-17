import com.main.comportement.*;

public abstract class Personnage {
    protected EspritCombatif espritCombatif = new Pacifiste();
    protected Deplacement deplacement = new Marcher();
    protected Soin soin = new AucunSoin();

    public Personnage(){}

    public Personnage(EspritCombatif espritCombatif, Deplacement deplacement, Soin soin){
        this.espritCombatif = espritCombatif;
        this.deplacement = deplacement;
        this.soin = soin;
    }

    public void seDeplacer(){
        deplacement.seDeplacer();
    }

    public void combattre(){
        espritCombatif.combat();
    }

    public void soin(){
        soin.soin();
    }

    public void setEspritCombatif(EspritCombatif espritCombatif){
        this.espritCombatif = espritCombatif;
    }

    public void setDeplacement(Deplacement deplacement){
        this.deplacement = deplacement;
    }

    public void setSoin(Soin soin){
        this.soin = soin;
    }
}
