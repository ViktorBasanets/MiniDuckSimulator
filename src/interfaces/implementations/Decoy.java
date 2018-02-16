package interfaces.implementations;

import interfaces.QuackBehavior;

public class Decoy implements QuackBehavior
{
    @Override
    public void quack()
    {
        System.out.println("Quack from ducky DECOY!");
    }
}
