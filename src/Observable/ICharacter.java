package Observable;

import Observer.IPowerUp;

public interface ICharacter {
    void registerPowerUp(IPowerUp powerUp);
    void removePowerUp(IPowerUp powerUp);
    void notifyPowerUp();
}
