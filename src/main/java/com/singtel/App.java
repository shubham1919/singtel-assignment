package com.singtel;

import com.singtel.service.Bird;
import com.singtel.service.Fish;
import com.singtel.service.impl.Chicken;
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
    	
    	Bird bird = new Bird();
        System.out.println("Bird : 1." + bird.fly() + " 2." + bird.sing() + " 3." + bird.walk() + " 4." + bird.swim());
        
        Chicken rooster = new Chicken("Rooster");
        System.out.println("Rooster : 1." + rooster.fly() + " 2." + rooster.sing() + " 3." + rooster.walk() + " 4." + rooster.swim());
        
        Chicken chicken = new Chicken();
        System.out.println("Chicken : 1." + chicken.fly() + " 2." + chicken.sing() + " 3." + chicken.walk() + " 4." + chicken.swim());
        
    	Duck duck = new Duck();
        System.out.println("Duck : 1." + duck.fly() + " 2." + duck.sing() + " 3." + duck.walk() + " 4." + duck.swim());
        
        Parrot parrotWithDog = new Parrot("parrotWithDog");
        System.out.println("parrotWithDog : 1." + parrotWithDog.fly() + " 2." + parrotWithDog.sing() + " 3." + parrotWithDog.walk() + " 4." + parrotWithDog.swim());
        
        Parrot parrotWithCat = new Parrot("parrotWithCat");
        System.out.println("parrotWithCat : 1." + parrotWithCat.fly() + " 2." + parrotWithCat.sing() + " 3." + parrotWithCat.walk() + " 4." + parrotWithCat.swim());
        
        Parrot parrotWithRooster = new Parrot("parrotWithRooster");
        System.out.println("parrotWithRooster : 1." + parrotWithRooster.fly() + " 2." + parrotWithRooster.sing() + " 3." + parrotWithRooster.walk() + " 4." + parrotWithRooster.swim());
        
        Fish fish = new Fish();
        System.out.println("Fish : 1." + fish.fly() + " 2." + fish.sing() + " 3." + fish.walk() + " 4." + fish.swim());
        
        Shark shark = new Shark();
        System.out.println("shark : 1." + shark.fly() + " 2." + shark.sing() + " 3." + shark.walk() + " 4." + shark.swim() + " 5." + shark.getColor() + " 6." + shark.getSize());
    }
}
