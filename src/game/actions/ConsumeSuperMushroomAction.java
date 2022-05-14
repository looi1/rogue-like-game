package game.actions;

import edu.monash.fit2099.engine.actions.Action;
import edu.monash.fit2099.engine.actors.Actor;
import edu.monash.fit2099.engine.positions.GameMap;
import edu.monash.fit2099.engine.positions.Location;
import game.items.SuperMushroom;
import game.Player;


/**
 * class to comsume supermushroom
 */
public class ConsumeSuperMushroomAction extends Action {

    /**
     * a super mushroom
     */
    private final SuperMushroom superMushroom;

    /**
     * constructor
     * @param superMushroom
     */
    public ConsumeSuperMushroomAction(SuperMushroom superMushroom) {
        this.superMushroom = superMushroom;
    };

    /**
     * Removes the superMushroom from the Ground or Inventory, and calls addPowerStarEffect()
     */
    @Override
    public String execute(Actor actor, GameMap gameMap) {
        Location location = gameMap.locationOf(actor);
        if (location.getItems().contains(superMushroom)) {
            location.removeItem(superMushroom);
        } else {
            actor.removeItemFromInventory(superMushroom);
        }
        Player player = (Player) actor;
        player.addSuperMushroomEffect();
        return "Player consumed SuperMushroom";
    }

    @Override
    public String menuDescription(Actor actor) {
        return "Consume SuperMushroom";
    }

}
