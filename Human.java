import java.util.Objects;

public class Human {
    int yearOfBirth;
    String name;
    String town;
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
}
