import java.lang.Math;

// easter egg
public class Rebane extends Mängija implements Skill{

    private String riietus = "Rebase kostüüm";
    private String juustevärvus = "oranž";
    private int sneakVäärtus;
    private int eluVäärtus;


    public Rebane(String nimi, int x, int y) {
        super(nimi);
        this.sneakVäärtus = x;
        this.eluVäärtus = y;

    }

    @Override
    public int sneak(int x) {
        return 0;
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
                "\t riietus : " + riietus + '\n' +
                "\t kasuka värv: " + juustevärvus + '\n' +
                "\t sneak : " + sneak(sneakVäärtus) + '\n' +
                "\t ellujäämisoskus : " + ellujäämisoskus(eluVäärtus);
    }
}
