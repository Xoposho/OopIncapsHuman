import java.util.Arrays;

public class Bouquet {
    private Flowers[] flowers;
    private int[] count;
    private double payBouquet;
    private int lifeSpan;

    public Bouquet(Flowers[] flowers, int[] count) {
        this.flowers = flowers;
        this.count = count;
        payBouquet = getPayBouquet();
        lifeSpan = getLifeSpan();
    }

    private double getPayBouquet(){
        for (int i = 0; i < flowers.length; i++){
            payBouquet = count[i] * flowers[i].getCost();
        }
        return payBouquet;
    }

    private int getLifeSpan(){
        for (Flowers flower : flowers) {
            if (lifeSpan > flower.getLifeSpan()) {
                lifeSpan = flower.getLifeSpan();
            }
        }
        return lifeSpan;
    }

    @Override
    public String toString() {
        return "Букет: " +
                Arrays.toString(flowers) +
                ", количеством: " + Arrays.toString(count) +
                ". Общая стоимость - " + payBouquet +
                ", простоит дней - " + lifeSpan;
    }

    public Flowers[] getFlowers() {
        return flowers;
    }

    public void setFlowers(Flowers[] flowers) {
        this.flowers = flowers;
    }

    public int[] getCount() {
        return count;
    }

    public void setCount(int[] count) {
        this.count = count;
    }

    public void setPayBouquet(double payBouquet) {
        this.payBouquet = payBouquet;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }
}
