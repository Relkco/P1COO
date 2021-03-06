package dungeon;

import java.util.ArrayList;
import java.util.List;

import monstres.*;
import stuff.*;
import rooms.*;

/**
 * Class representing a dungeon
 * 
 * @author Antoine Bondin, Eddy Thockler & Hugo Chaumette
 */
public class ConcreteDungeon extends AbstractDungeon {

	/**
	 * Construcutor without param
	 */
	public ConcreteDungeon() {
		Room room;
		List<Stuff> objects = new ArrayList<>();
		this.player = new Player();
		objects.add(new Key());
		this.currentRoom = new NormalExit(new NormalRoom("This is a normal room"));
		this.currentRoom.addNearRoom("West", new NormalExit(new TreasureRoom(objects, "This is a treasure room")));
		this.currentRoom.addNearRoom("North", new LockedExit(new EndRoom("This is an end room")));
		this.currentRoom.addNearRoom("South", new NormalExit(new TrapRoom("This is a trap room")));

	}

	// For level2+

	/**
	 * ConcreteDungeon's constructor with a player as param
	 * 
	 * @param p
	 *            the player from the last dungeon
	 */
	public ConcreteDungeon(Player p) {
		Room room;
		List<Stuff> objects = new ArrayList<>();
		this.player = p;
		objects.add(new MediumHealingPotion());
		objects.add(new Key());
		objects.add(new GreatHammer());
		this.currentRoom = new NormalExit(new TreasureRoom(objects, "This is a treasure room"));
		this.currentRoom.addNearRoom("West", new LockedExit(new NormalRoom("This is a locked room")));
		this.currentRoom.addNearRoom("East", new NormalExit(new NormalRoom("This is a normal room")));
		this.currentRoom.addNearRoom("North", new HiddenExit(new MonsterRoom(new Troll(), "This is a Troll cave")));
		room = this.currentRoom.getNearRooms().get("West");
		room.addNearRoom("North", new NormalExit(new ButtonRoom("This is a button room")));
		room = room.getNearRooms().get("North");
		room.addNearRoom("North", new HiddenExit(new MonsterRoom(new Moskito(), "This is a monster room")));
		room = room.getNearRooms().get("North");
		room.addNearRoom("North", new HiddenExit(new EndRoom("This is an end room")));
	}

}
