public class Flowers {

    private final String flowerName;
    private final String country;
    private final double cost;
    private int lifeSpan;

    Flowers(String flowerName, String country, double cost, int lifeSpan) {
        if (flowerName != null && flowerName.isBlank()){
            this.flowerName = "Тип цветка не указан";
        } else {
            this.flowerName = flowerName;
        }

        if (flowerName != null && country.isBlank()){
            this.country = "Россия";
        } else {
            this.country = country;
        }

        if (cost >= 1) {
            this.cost = cost;
        } else {
            this.cost = 1;
        }

        if (lifeSpan >= 1){
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 3;
        }
    }

    public String getFlowerName() {
        return flowerName;
    }

    public String getCountry() {
        return country;
    }

    public double getCost() {
        return cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        if (lifeSpan > 0){
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 3;
        }
    }

    public static void showAllFlowers(Flowers[] flowers){
        for (Flowers i : flowers){
            System.out.println(i);
        }
    }

    @Override
    public String toString(){
        return flowerName + ", страна происхождения: " +
                country + ". Цена за штуку - " + cost + " рублей." +
                " Срок стояния - " + lifeSpan + " дней.";
    }
}
