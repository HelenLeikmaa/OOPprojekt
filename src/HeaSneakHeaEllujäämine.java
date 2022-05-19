import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HeaSneakHeaEllujäämine {

    // sneak on hea ja ellujäämine on hea
    // 1 tähendab et on hea, 0 tähendab, et see on halb.


    public void esimeneInfoMängijaleHeaSneakHeaEllujäämine() throws IOException {
        List<String> asjad = new ArrayList<>();
        asjad.add("nuga");
        System.out.println("Tere! Oled jõudnud läbi portaali Maailma. Sul on head hiilimise ja ellujäämise oskused. Hea algus!");
        System.out.println("Avastad, et sul on kaasas " + asjad.toString());
        esimenePeatükkHeaSneakHeaEllujäämine(asjad);
    }

    public int esimenePeatükkHeaSneakHeaEllujäämine(List<String> asjad) throws IOException {
        try(FileWriter fw = new FileWriter("logid.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw)) {

            Scanner info = new Scanner(System.in);
            out.println("Sul on head hiilimise ja ellujäämise oskused. Hea algus!");
            String text = "Sa ärkad ülesse ja leiad ennast keset metsa.\n Kuid kuuled jooksvaid samme enda poole! \n" +
                    "Jõuad vaevu püsti seista kui saad aru et oled metssea järgmine ohver!";
            out.println("\nUus mäng: \n" + text);
            System.out.println( "\n" +text);
            while (true) {
                text = "Valmistad rünnakuks, kas haarad noa taskust või võitled rusikatega? (A, B) ";
                System.out.println(text);
                String vastus = info.nextLine();
                if (vastus.equals("A") || vastus.equals("B")) {
                    text = "Kaitserünnak õnnestus ja said metsseast jagu!\n Hakkad otsima lõkkematerjali. Otsides kuulad aga sahinat ja näed kaugemal mehi hobuste peal.";
                    System.out.println(text);
                    out.println(text);
                    while (true) {
                        text = "Kas lähened meestele või ei? (A, B) ";
                        System.out.println(text);
                        vastus = info.nextLine();
                        if (vastus.equals("A")) {
                            text = "Lähened meestele ja kõnetad neid. Mehed ehmuvad ja nabivad kohe su kinni!\nTeepeal selgub et kõik sobivas vanuses mehed peavad minema sõtta!\nLähed algselt vangi kuna peitsid ennast metsas,";
                            System.out.println(text);
                            out.println(text);
                            text = "Edasi mängimiseks külasta meie veebilehte ja osta terve mäng!";
                            System.out.println(text);
                            return 1;
                        } else if (vastus.equals("B")) {
                            text = "Peidad ennast meeste eest ära. \nNatukese aja möödudes tuled oma peidukohast välja ja jätkad lõkkematerjali otsingutega." +
                                    "\nÕhtu lõpuks küpsetasid edukalt metsseast endale maitsva söögi. \nTeed endale lehtedest aseme ja heidad magama." +
                                    "\nVarahommikul ärkad selle peale, et sind hoitakse kinni ja surutakse käeraudadesse!\nMetsas olevad mehed hobustega olid su kinni nabinud ja viivad su vangi!";
                            System.out.println(text);
                            out.println(text);
                            text = "Edasi mängimiseks külasta meie veebilehte ja osta terve mäng!";
                            System.out.println(text);
                            return 2;
                        } else
                            System.out.println("Sisestasid ebakorrektse vastuse");
                    }
                } else
                    System.out.println("Sisestasid ebakorrektse vastuse");
            }
        }
    }
}
