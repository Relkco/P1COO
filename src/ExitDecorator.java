
import java.util.Map;


public abstract class ExitDecorator extends Room {
		protected Room room;
		
		public Room getRoom(){
			return this.room;
		}
                
                public void exit(AbstractDungeon dungeon, String command){
                    boolean success=false;
                    for (Map.Entry<String, Room> room : dungeon.currentRoom.getNearRooms().entrySet()){
			if(room.getKey().toLowerCase().equals(command.toLowerCase())){
				dungeon.setCurrentRoom(room.getValue());
				System.out.println("You change of room");
				success = true;
			}
                    }
                    if(!success){
			System.out.println("You can't move that way");
                    }
                }
                
                public abstract void canExit(AbstractDungeon dungeon, String command);
}