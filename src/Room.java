import java.util.ArrayList;

public class Room {
    Monster m_RoomMonster;
    ArrayList<Item> items = new ArrayList<>();
    public Monster getRoomMonster() {
        return m_RoomMonster;
    }

    public Room(int indexRoom) {
        if (indexRoom % 4 == 0 && indexRoom % 3 == 0) {
            m_RoomMonster = new Barbarian();
        } else if (indexRoom % 3 == 0) {
            m_RoomMonster = new Troll();
        } else if (indexRoom % 4 == 0) {
            m_RoomMonster = new Thief();
        } else if (isPrime(indexRoom) ) {
            m_RoomMonster = new Sorcerer();
        } else
            m_RoomMonster = new Zombie();
        if (indexRoom % 7 == 0 && indexRoom % 4 == 0 ) {
            items.add(new HealthPotion());
            items.add(new StrengthPotion());
        } else if (indexRoom % 7 == 0){
                items.add(new HealthPotion());
            }
            else if (indexRoom % 4 == 0){
                items.add(new StrengthPotion());
            }
        }


    private boolean isPrime(int indexRoom) {
        if( indexRoom == 2)
            return true;
        if( indexRoom == 1 || indexRoom %2 == 0)
            return false;
        for (int i = 5; i*i < indexRoom+2; i+=2) {
            if( indexRoom%i == 0)
                return false;
        }
        return true;
    }

    public Item search() {
        if (items.size()==0){
            System.out.println("Nothing left to find");
            return null;
        } else {
            System.out.println("Congrats you have found : " + items.get(0).getClass().getSimpleName());
            return items.remove(0);
        }
    }
}
