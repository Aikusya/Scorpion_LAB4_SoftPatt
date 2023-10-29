package Observer;

public class XBOXPowerUp implements IPowerUp{
    private int power;
    @Override
    public void update(int power) {
        this.power += power;
        display();
    }

    public void display(){
        System.out.println("Observable.Scorpion's power level on XBOX is " + power);
    }
}
