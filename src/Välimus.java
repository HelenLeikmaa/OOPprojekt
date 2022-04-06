public class Välimus{

    // jumpsuit-il on alati värv, aga randoomsega võib see olla ka rebane, siis värvus on oranž
    public static String jumpsuit(String jumpsuitVärv) {
        if (jumpsuitVärv.equals("random")){
            String[] list = {"lilleline", "triibuline", "oranz", "mummuline", "laiguline", "rebane"};
            String valik = list[(int) ((Math.random() * 6) + 0)];
            return valik;
        }
        return jumpsuitVärv;
    }

    // kui ei ole loom, siis annab juuksevärvi ka
    public static String juustevärv(String juusteVärv){
        if (juusteVärv.equals("random")){
            String[] list2 = {"roheline", "blond", "punane", "must", "sinine", "brünett"};
            String valik2 = list2[(int) ((Math.random() * 5) + 0)];
            return valik2;
        }
        return juusteVärv;
    }
}