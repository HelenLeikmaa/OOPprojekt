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

    public void misTase() {
        if (sneak >= 5 && ellujäämine >= 5) {
            HeaSneakHeaEllujäämine skillset1 = new HeaSneakHeaEllujäämine();
            skillset1.esimeneInfoMängijale();
        }
        if (sneak >= 5 && ellujäämine < 5) {
            HeaSneakHalbEllujäämine skillset2 = new HeaSneakHalbEllujäämine();
            skillset2.esimeneInfoMängijale();
        }
        if (sneak < 5 && ellujäämine >= 5) {
            HalbSneakHeaEllujäämine skillset3 = new HalbSneakHeaEllujäämine();
            skillset3.esimeneInfoMängijale();
        }
        if (sneak < 5 && ellujäämine < 5) {
            HalbSneakHalbEllujäämine skillset4 = new HalbSneakHalbEllujäämine();
            skillset4.esimeneInfoMängijale();
        }
    }
}