import java.io.IOException;

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

    public void misTase() throws IOException {
        if (sneak >= 5 && ellujäämine >= 5) {
            HeaSneakHeaEllujäämine skillset1 = new HeaSneakHeaEllujäämine();
            skillset1.esimeneInfoMängijaleHeaSneakHeaEllujäämine();
        }
        if (sneak < 5 && ellujäämine >= 5) { // jah, see on tagurpidi, aga vaja kiiret fixi
            HeaSneakHalbEllujäämine skillset2 = new HeaSneakHalbEllujäämine();
            skillset2.esimeneInfoMängijaleHeaSneakHalbEllujäämine();
        }
        if (sneak >= 5 && ellujäämine < 5) { // jah, see on tagurpidi, aga vaja kiiret fixi
            HalbSneakHeaEllujäämine skillset3 = new HalbSneakHeaEllujäämine();
            skillset3.esimeneInfoMängijaleHalbSneakHeaEllujäämine();
        }
        if (sneak < 5 && ellujäämine < 5) {
            HalbSneakHalbEllujäämine skillset4 = new HalbSneakHalbEllujäämine();
            skillset4.esimeneInfoMängijaleHalbSneakHalbEllujäämine();
        }
    }
}