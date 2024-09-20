import java.util.*;
public class AdressBook{
    private ArrayList<BuddyInfo> buddyInfos;

    public AdressBook() {
        this.buddyInfos = new ArrayList<>();
    }

    public void add(BuddyInfo buddy) {
        buddyInfos.add(buddy);
    }
    public void remove(BuddyInfo buddy) {
        buddyInfos.remove(buddy);

    }

    public static void main(String[] args) {
        System.out.println("Adress Book");

    }
}

