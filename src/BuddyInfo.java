public class BuddyInfo {
    private final String name;

    public String getName() {
        return name;
    }

    public BuddyInfo(String name) {

        this.name = name;
    }

    public static void main(String[] args) {
        BuddyInfo buddyInfo = new BuddyInfo("Homer");
        System.out.println("Hello " + buddyInfo.getName());
    }
}
