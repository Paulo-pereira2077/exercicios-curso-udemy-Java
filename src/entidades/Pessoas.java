package entidades;

public class Pessoas {
    private String name;
    private String email;
    public int number;


    public Pessoas(String name, String email, int number){
        this.name = name;
        this.email = email;
        this.number = number;
    }

    public Pessoas(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getNumber() {
        return number;
    }


    public String toString() {
        return number + ": " + name + ", " + email;
    }
}




