import com.main.comportement.*;

    class Test{
        public static void main(String[] args) {
            Personnage pers = new Guerrier();
            pers.soin();
            pers.setSoin(new Operation());
            pers.soin();
        }
}
