public class Bat extends Mammal{
    public Bat(){
        this.setEnergyGain(200);
    }
    public void fly(){
        System.out.println("The bat begins to fly");
        this.setEnergyDrain(50);
    }

    public void eatHumans(){
        System.out.println("The bat consumes human flesh....");
        this.setEnergyGain(25);
    }

    public void attackTown(){
        System.out.println("The bat begins its attack on the town!");
        this.setEnergyDrain(100);
    }

}
