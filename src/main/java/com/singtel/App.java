package com.singtel;

import com.singtel.service.Animal;
import com.singtel.service.Bird;
import com.singtel.service.Fish;
import com.singtel.service.impl.Caterpillar;
import com.singtel.service.impl.Chicken;
import com.singtel.service.impl.ClownFish;
import com.singtel.service.impl.Dolphin;
import com.singtel.service.impl.Duck;
import com.singtel.service.impl.Parrot;
import com.singtel.service.impl.Shark;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	Animal bird = new Bird();
        System.out.println("Bird : 1." + bird.fly() + " 2." + bird.sing() + " 3." + bird.walk() + " 4." + bird.swim());
        
        Animal rooster = new Chicken("Rooster");
        System.out.println("Rooster : 1." + rooster.fly() + " 2." + rooster.sing() + " 3." + rooster.walk() + " 4." + rooster.swim());
        
        Animal chicken = new Chicken();
        System.out.println("Chicken : 1." + chicken.fly() + " 2." + chicken.sing() + " 3." + chicken.walk() + " 4." + chicken.swim());
        
        Animal duck = new Duck();
        System.out.println("Duck : 1." + duck.fly() + " 2." + duck.sing() + " 3." + duck.walk() + " 4." + duck.swim());
        
        Animal parrotWithDog = new Parrot("parrotWithDog");
        System.out.println("parrotWithDog : 1." + parrotWithDog.fly() + " 2." + parrotWithDog.sing() + " 3." + parrotWithDog.walk() + " 4." + parrotWithDog.swim());
        
        Animal parrotWithCat = new Parrot("parrotWithCat");
        System.out.println("parrotWithCat : 1." + parrotWithCat.fly() + " 2." + parrotWithCat.sing() + " 3." + parrotWithCat.walk() + " 4." + parrotWithCat.swim());
        
        Animal parrotWithRooster = new Parrot("parrotWithRooster");
        System.out.println("parrotWithRooster : 1." + parrotWithRooster.fly() + " 2." + parrotWithRooster.sing() + " 3." + parrotWithRooster.walk() + " 4." + parrotWithRooster.swim());
        
        Animal fish = new Fish();
        System.out.println("Fish : 1." + fish.fly() + " 2." + fish.sing() + " 3." + fish.walk() + " 4." + fish.swim());
        
        Fish shark = new Shark();
        System.out.println("shark : 1." + shark.fly() + " 2." + shark.sing() + " 3." + shark.walk() + " 4." + shark.swim() + " 5." + shark.getColor() + " 6." + shark.getSize());
        
        Fish clownFish = new ClownFish();
        System.out.println("clownFish : 1." + clownFish.fly() + " 2." + clownFish.sing() + " 3." + clownFish.walk() + " 4." + clownFish.swim() + " 5." + clownFish.getColor() + " 6." + clownFish.getSize());
        
        Animal dolphin = new Dolphin();
        System.out.println("dolphin : 1." + dolphin.fly() + " 2." + dolphin.sing() + " 3." + dolphin.walk() + " 4." + dolphin.swim());
        
        Caterpillar caterpillar = new Caterpillar();
        System.out.println("caterpillar : 1." + caterpillar.fly() + " 2." + caterpillar.sing() + " 3." + caterpillar.walk() + " 4." + caterpillar.swim());
        
        caterpillar.changeToButerfly();
        System.out.println("ButterFly : 1." + caterpillar.fly() + " 2." + caterpillar.sing() + " 3." + caterpillar.walk() + " 4." + caterpillar.swim());
    }
}
