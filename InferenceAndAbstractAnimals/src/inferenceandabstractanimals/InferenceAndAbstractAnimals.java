/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inferenceandabstractanimals;

import java.util.ArrayList;

/**
 *
 * @author lsnyder
 */
public class InferenceAndAbstractAnimals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Ostrich joe = new Ostrich(6, "Joe");
        Penguin mike = new Penguin(4, "Mike");
        Eagle sam = new Eagle(7, "Sam");
        Dolphin finn = new Dolphin(96.8f, "Finn");
        Lion leo = new Lion(100.5f, "Leo");
        Bat unn = new Bat(100f, "Unn");
        Shark queen = new Shark(true, "Queen");
        Bass indigo = new Bass(true, "Indigo");
        FlyingFish sky = new FlyingFish(false, "Sky");
        
        //Adds all animals to animals list
        ArrayList<Animals> animals = new ArrayList<>();
        animals.add(joe);
        animals.add(mike);
        animals.add(sam);
        animals.add(finn);
        animals.add(leo);
        animals.add(unn);
        animals.add(queen);
        animals.add(indigo);
        animals.add(sky);
        
        System.out.println("---------------- Animals ----------------");
        
        //Tests thier ToStrings
        for(Animals animal : animals)
        {
            System.out.println(animal);
        }
        
        //Adds all birds to birds list
        ArrayList<Birds> birds = new ArrayList<>();
        birds.add(joe);
        birds.add(mike);
        birds.add(sam);
        
        System.out.println("---------------- Birds ----------------");
        
        //Displays their fields
        for(Birds bird : birds)
        {
            System.out.println(bird.name + ", " + bird.wingspan);
        }
        
        //Adds all mammals to mammals list
        ArrayList<Mammals> mammals = new ArrayList<>();
        mammals.add(finn);
        mammals.add(leo);
        mammals.add(unn);
        
        System.out.println("---------------- Mammals ----------------");
        
        //Displays their fields
        for(Mammals mammal : mammals)
        {
            System.out.println(mammal.name + ", " + mammal.bodyTemp);
        }
        
        //Adds all fishes to fishes list
        ArrayList<Fishes> fishes = new ArrayList<>();
        fishes.add(queen);
        fishes.add(indigo);
        fishes.add(sky);
        
        System.out.println("---------------- Fishes ----------------");
        
        //Displays their fields
        for(Fishes fish : fishes)
        {
            System.out.println(fish.name + ", " + fish.isFreshWater);
        }
        
        //Adds all animals who can fly to flyers
        ArrayList<IFly> flyers = new ArrayList<>();
        flyers.add(sam);
        flyers.add(unn);
        flyers.add(sky);
        
        System.out.println("---------------- Flyers ----------------");
        
        //Displays their fly message
        for(IFly flyer : flyers)
        {
            flyer.fly();
        }
        
        //Adds all animals who can walk to walkers
        ArrayList<IWalk> walkers = new ArrayList<>();
        walkers.add(joe);
        walkers.add(mike);
        walkers.add(sam);
        walkers.add(leo);
        walkers.add(unn);
        
        System.out.println("---------------- Walkers ----------------");
        
        //Displays their walking message
        for(IWalk walker : walkers)
        {
            walker.walk();
        }
        
        //Adds all animals who can swim to swimmers
        ArrayList<ISwim> swimmers = new ArrayList<>();
        swimmers.add(mike);
        swimmers.add(finn);
        swimmers.add(queen);
        swimmers.add(indigo);
        swimmers.add(sky);
        
        System.out.println("---------------- Swimmers ----------------");
        
        //Displays their swimming message
        for(ISwim swimmer : swimmers)
        {
            swimmer.swim();
        }
        
        ArrayList<IMakeSound> soundMakers = new ArrayList<>();
        soundMakers.add(joe);
        soundMakers.add(mike);
        soundMakers.add(sam);
        soundMakers.add(finn);
        soundMakers.add(leo);
        soundMakers.add(unn);
        soundMakers.add(queen);
        soundMakers.add(indigo);
        soundMakers.add(sky);
        
        System.out.println("---------------- Sound Makers ----------------");
        
        for(IMakeSound soundMaker : soundMakers)
        {
            soundMaker.makeSound();
        }
    } 
}
