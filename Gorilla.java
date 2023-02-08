public class Gorilla extends Mammal {
        public void throwSomething(){
        System.out.println("The gorilla throws his poop at you!");
        this.setEnergyDrain(5);
        }

        public void eatBananas(){
            System.out.println("The gorilla is pleased....");
            this.setEnergyGain(10);
        }

        public void climb(){
            System.out.println("The Gorilla begins to climb...");
            this.setEnergyDrain(10);
        }
        

}
