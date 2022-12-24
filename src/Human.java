import java.util.Objects;
public class Human {
    private int yearOfBirth;
    String name;
    private String town;
    String jobTitle;

    Human(int yearOfBirth, String name, String town, String jobTitle) {
        this.yearOfBirth = Math.max(yearOfBirth, 0);
        this.name = Objects.requireNonNullElse(name, "Информация не указана");
        this.town = Objects.requireNonNullElse(town, "Информация не указана");
        this.jobTitle = Objects.requireNonNullElse(jobTitle, "Информация не указана");
    }

    void presents() {
        System.out.println("Привет! Меня зовут " +
                name + ". Я из города " +
                town + ". Я родился в " +
                yearOfBirth + " году. Я работаю на должности " +
                jobTitle + ". Будем знакомы!");
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth >= 1) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
    }

    public void setTown(String town) {
        if (town != null && town.isBlank()) {
            this.town = town;
        } else {
            this.town = "Информация не указана";
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getTown() {
        return town;
    }
}