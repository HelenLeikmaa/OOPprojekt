public class OskusteTasemed {

    private int ellujäämine;
    private int sneak;

    public OskusteTasemed(int ellujäämine, int sneak) {
        this.ellujäämine = ellujäämine;
        this.sneak = sneak;
    }

    public int getEllujäämine() {
        return ellujäämine;
    }

    public int getSneak() {
        return sneak;
    }

    if (getSneak() > 5 && getEllujäämine() > 5) {
        Skillset1 skillset1 = new Skillset1();
        skillset1.esimeneInfoMängijale();
    }
}
