package interfaces.implementations;

import interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior
{
    @Override
    public void quack()
    {
        System.out.println("<< Silence >>");
    }
}
