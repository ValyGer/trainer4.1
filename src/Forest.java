import java.util.List;

public class Forest {
    private List<MountainHare> hares;
    private static String season;

    public Forest (List<MountainHare> hares) {
        this.hares = hares;
    }
    // объявите недостающие переменные и добавьте конструктор
    public static void setSeason(String season) {
        if (season.equals("лето")) {
            MountainHare.setColor("серо-рыжий");
        } else if (season.equals("зима")){
            MountainHare.setColor("белый");
        }
    }
    // добавьте метод printHares()
    public void printHares() {
        for (MountainHare hare: hares) {
            System.out.println(hare);
        }
    }

}