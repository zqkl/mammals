public class Mammal{
    private int energy = 100;
    
    public int displayEnergy(){
        System.out.println(this.energy);
        return this.energy;
    }


    public int getEnergy() {
        return this.energy;
    }

    public void setEnergyDrain(int drain) {
        this.energy -= drain;
    }

    public void setEnergyGain(int gain){
        this.energy += gain;
    }

}