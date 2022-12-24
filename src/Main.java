public class Main {
    public static void main(String[] args) {

//        Human maxim = new Human(1988, "Максим", "Минск", "бренд-менеджер");
//        Human ann = new Human(1993, "Аня", "Москва", "методист образовательных программ");
//        Human kate = new Human(1992, "Катя", "Калининград", "продакт-менеджер");
//        Human artem = new Human(1995, "Артём", "Москва", "директор по развитию бизнеса");
//
//        maxim.presents();
//        ann.presents();
//        kate.presents();
//        artem.presents();
//
        Flowers[] flowers = new Flowers[4];
        flowers[0] = new Flowers(null, "Holland", 35.59, 1);
        flowers[1] = new Flowers("Chrysanthemum", "", 15, 5);
        flowers[2] = new Flowers("Pion", "England", 69.9, 1);
        flowers[3] = new Flowers("Gypsophile", "Turkey", 19.5, 10);

//        Flowers.showAllFlowers(flowers);

        Flowers[] bouquet = new Flowers[] {flowers[0], flowers[1], flowers[2], flowers[3]};
        int[] countBouquet = new int[bouquet.length];
        for (int i = 0; i < countBouquet.length; i++){
            countBouquet[i] = 2 * i + 1;
        }
        Bouquet bouquet1 = new Bouquet(bouquet, countBouquet);
        System.out.println(bouquet1);



    }
}