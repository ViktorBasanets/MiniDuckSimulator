package interfaces.implementations;

import interfaces.QuackBehavior;

public class Squeak implements QuackBehavior
{
    @Override
    public void quack()
    {
        System.out.println("Squeak");
    }
}
