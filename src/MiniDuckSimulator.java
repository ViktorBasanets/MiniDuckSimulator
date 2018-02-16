import classes.Duck;
import classes.MallardDuck;
import classes.ModelDuck;
import interfaces.implementations.Decoy;
import interfaces.implementations.FlyRocketPowered;

public class MiniDuckSimulator
{
    public static void main(String[] args)
    {
        Duck mallard = new MallardDuck();

        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();

        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

        new Decoy().quack();
    }
}
