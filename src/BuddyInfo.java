public class BuddyInfo {
    private final String name;
    private final String address;
    private final String phone;

    public String getName() {
        return name;
    }

    public BuddyInfo(String name, String address, String phone) {
        this.address = address;
        this.name = name;
        this.phone = phone;
    }

    public static void main(String[] args) {
        BuddyInfo buddyInfo = new BuddyInfo("Homer", "street", "613");
        System.out.println("Hello " + buddyInfo.getName());
    }
}
