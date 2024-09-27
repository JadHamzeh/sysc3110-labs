import java.lang.foreign.PaddingLayout;
import java.util.*;
public class AdressBook{
    private ArrayList<BuddyInfo> buddyInfos;

    public AdressBook() {
        this.buddyInfos = new ArrayList<>();
    }

    public void add(BuddyInfo buddy) {
        if (buddy!=null){
            buddyInfos.add(buddy);
        }
    }
    public void remove(BuddyInfo buddy) {
        buddyInfos.remove(buddy);

    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom","Carleton","613");
        AdressBook adressBook = new AdressBook();
        adressBook.add(buddy);
        adressBook.remove(buddy);

    }
}

