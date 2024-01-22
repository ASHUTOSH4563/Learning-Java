package JavaProgram;

public class Fish implements Prey,Predator
{
    @Override
    public void flee() {
        System.out.println("Fish is fleeing.");
    }

    @Override
    public void Hunt() {
        System.out.println("Fish is going for Hunt.");
    }
}
