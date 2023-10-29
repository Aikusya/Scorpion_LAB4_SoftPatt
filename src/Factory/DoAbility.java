package Factory;

import Product.FireAbility;
import Product.IAbility;
import Product.IceAbility;
import Product.SmokeAbility;

import java.util.Random;

public class DoAbility implements IDoAbility{

    Random random = new Random();
    @Override
    public IAbility doAbility() {
        int number = random.nextInt(3);

        if(number == 0){
            return new FireAbility();
        } else if (number == 1) {
            return new IceAbility();
        } else {
            return new SmokeAbility();
        }
    }
}
