package rooms;
import dungeon.AbstractDungeon;


public class NormalRoom extends Room {
	
	public NormalRoom(String description){
		super.setDescriptionRoom(description);
	}

	@Override
	public void action(String command, AbstractDungeon dungeon) {
		// TODO Auto-generated method stub
		System.out.println("You have nothing to do here");
	}

}