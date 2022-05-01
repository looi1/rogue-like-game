package game.ground;

import edu.monash.fit2099.engine.actors.Actor;
import edu.monash.fit2099.engine.positions.GameMap;
import edu.monash.fit2099.engine.positions.Ground;
import edu.monash.fit2099.engine.positions.Location;

public class Wall extends Ground implements Jumpable{

	public Wall() {
		super('#');
	}
	
	@Override
	public boolean canActorEnter(Actor actor) {
		return false;
	}
	
	@Override
	public boolean blocksThrownObjects() {
		return true;
	}

	@Override
	public void tick(Location location) {
		super.tick(location);
		int x = location.x();
		int y = location.y();
		GameMap map = location.map();
	}

	public int getSuccessRate() {
		return 80;
	}

	public int getFallDamage() {
		return 20;
	}

	public String getName() {
		return "Wall";
	}
}
