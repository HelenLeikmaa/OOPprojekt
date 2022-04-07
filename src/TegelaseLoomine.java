import java.util.Scanner;

public class TegelaseLoomine {

    public static void main(String[] args) {

        // paar väärtust, mida oli vaja enne käima panemist.
        String juustevärv = null;
        int ellujäämine = -1;
        int sneak = -1;

        // scanner võtab kogu info mis antakse ja söödab selle sisse peaklassi
        Scanner info = new Scanner(System.in);

        System.out.println("sisesta oma nimi");
        String nimi = info.nextLine();

        System.out.println("vali jumpsuiti värv: lilleline, triibuline, oranz, mummuline, laiguline, random");
        String valik1 = info.nextLine();
        String jumpsuitValik = Välimus.jumpsuit(valik1);

        if (valik1.equals("random")) {
            System.out.println("valiti " + jumpsuitValik);
        }

        if (!jumpsuitValik.equals("rebane")) {
            System.out.println("Vali juuksevärv: roheline, blond, punane, must, sinine, brünett, random");
            String valik2 = info.nextLine();
            juustevärv = Välimus.juustevärv(valik2);

            if (valik2.equals("random")) {
                System.out.println("valiti " + juustevärv);
            }
        }

        System.out.println("kas tahad ise oskuste tasemed valida? (jah, ei)");
        System.out.println("kui valid ei, genereeritakse need automaatselt");

        String valik = info.nextLine();

        if (valik.equals("jah")) {
            if (jumpsuitValik.equals("rebane")) {
                sneak = 8;
                System.out.println("kuna sa oled rebane, siis su sneak on eos 8 ");
            } else {
                System.out.println("Sneak : ");
                sneak = info.nextInt();
            }
            System.out.println("Ellujäämisoskus : ");
            ellujäämine = info.nextInt();

        } else {
            if (jumpsuitValik.equals("rebane")) {
                System.out.println("kuna sa oled rebane, siis su sneak on eos 8 ");
            }
        }
        if (jumpsuitValik.equals("rebane")) {
            Rebane mängija = new Rebane(nimi, jumpsuitValik, sneak, ellujäämine);
            System.out.println(mängija);
        } else {
            TavalineMängija mängija = new TavalineMängija(nimi, jumpsuitValik, juustevärv, sneak, ellujäämine);
            System.out.println(mängija);
        }

    }

}





