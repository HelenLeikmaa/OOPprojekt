import java.lang.Math;


public class TavalineMängija extends Mängija implements Skill{

    private String jumpsuitVärvus;
    private String juustevärvus;
    private int sneakVäärtus;
    private int eluVäärtus;

    public TavalineMängija(String nimi, String jumpsuitVärvus, String juustevärvus, int sneakVäärtus, int eluVäärtus) {
        super(nimi);
        this.jumpsuitVärvus = jumpsuitVärvus;
        this.juustevärvus = juustevärvus;
        this.sneakVäärtus = sneakVäärtus;
        this.eluVäärtus = eluVäärtus;
    }

    @Override
    public int sneak(int x) {
        if (x != -1) {
            return x;
        }
        return (int) ((Math.random() * 10) + 0);
    }

    @Override
    public int ellujäämisoskus(int y) {
        if (y != -1) {
            return y;
        }
        return (int) ((Math.random() * 10) + 0);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\t tunked : " + jumpsuitVärvus + '\n' +
                "\t juuksed : " + juustevärvus + '\n' +
                "\t sneak : " + sneak(sneakVäärtus) + '\n' +
                "\t ellujäämisoskus : " + ellujäämisoskus(eluVäärtus);
    }
}
