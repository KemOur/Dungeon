
public class Dungeon {
    Room[] m_RoomsArray;

    public Dungeon(int nbRooms, boolean b) {
        m_RoomsArray = new Room[nbRooms];
        for (int i = 0; i < nbRooms; i++) {
            m_RoomsArray[i] = new Room(i);
        }

        int i =0;
        for(Room room : m_RoomsArray){
            Monster m = room.getRoomMonster();
            //System.out.println("" + i + " : " + m.getClass().getSimpleName());
            i++;
        }
        //System.out.println("Thieves : " + Monster.s_nbInstanceThief);
        //System.out.println(Barbarian.class.getSimpleName() + "s : " + Monster.s_nbInstanceBarbarian);
        //System.out.println(Sorcerer.class.getSimpleName() + "s : " + Monster.s_nbInstanceSorcerer);
        //System.out.println(Troll.class.getSimpleName() + "s : " + Monster.s_nbInstanceTroll);
        //System.out.println(Zombie.class.getSimpleName() + "s : " + Monster.s_nbInstancezombie);
    }

    public Room getRoom(int p_iRoomIndex) {
        return m_RoomsArray[p_iRoomIndex];
    }
}
