package Observable;

import Observer.IPowerUp;

import java.util.List;
import java.util.ArrayList;

public class Scorpion implements ICharacter{
    private int power;
    List<IPowerUp> powerUps = new ArrayList<>();
    @Override
    public void registerPowerUp(IPowerUp powerUp) {
        powerUps.add(powerUp);
    }

    @Override
    public void removePowerUp(IPowerUp powerUp) {
        powerUps.remove(powerUp);
    }

    @Override
    public void notifyPowerUp() {
        for( IPowerUp powerUp : powerUps){
            powerUp.update(power);
        }
    }

    public void setPowerUp(int power) {
        this.power = power;
        notifyPowerUp();
    }
}
