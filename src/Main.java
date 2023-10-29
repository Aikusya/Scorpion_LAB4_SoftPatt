import Factory.DoAbility;
import Factory.IDoAbility;
import Observable.Scorpion;
import Observer.PlayStationPowerUp;
import Observer.XBOXPowerUp;
import Product.IAbility;

public class Main {
    public static void main(String[] args) {

        // Implementation of Observer
        Scorpion scorpion = new Scorpion();
        XBOXPowerUp XBOXPowerUp = new XBOXPowerUp();
        PlayStationPowerUp playStationPowerUp = new PlayStationPowerUp();
        scorpion.registerPowerUp(XBOXPowerUp);
        scorpion.registerPowerUp(playStationPowerUp);

        scorpion.setPowerUp(250);
        scorpion.setPowerUp(500);
        scorpion.setPowerUp(400);

        // Implementation of Factory
        IDoAbility doAbility = new DoAbility();
        IAbility ability1 = doAbility.doAbility();
        ability1.ability();

        IAbility  ability2 = doAbility.doAbility();
        ability2.ability();

        IAbility ability3 = doAbility.doAbility();
        ability3.ability();

    }
}