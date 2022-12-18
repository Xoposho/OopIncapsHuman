public class Main {
    public static void main(String[] args) {
        Human maxim = new Human(1988, "Максим", "Минск", "бренд-менеджер");
        Human ann = new Human(1993, "Аня", "Москва", "методист образовательных программ");
        Human kate = new Human(1992, "Катя", "Калининград", "продакт-менеджер");
        Human artem = new Human(1995, "Артём", "Москва", "директор по развитию бизнеса");

        maxim.presents();
        ann.presents();
        kate.presents();
        artem.presents();
    }
}
// by Igor