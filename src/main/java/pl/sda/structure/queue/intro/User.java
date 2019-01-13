package pl.sda.structure.queue.intro;

public class User {


    private String name;
    private boolean isPremium;

    public User(String name, boolean isPremium) {
        this.name = name;
        this.isPremium = isPremium;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", isPremium=" + isPremium +
                '}';
    }
}
