 class FullName {
    private String name; // full name

    public FullName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getShortName() {
        String[] parts = name.split(" ");
        return parts[0] + " " + parts[1];
    }
}

public class Main {
    public static void main(String[] args) {
        FullName fullName = new FullName("Sachin Ramesh Tendulkar");
        String shortName = fullName.getShortName();
        System.out.println(shortName);
    }
}
