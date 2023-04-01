package OOP_Java.HomeWork;

import java.io.FileNotFoundException;
import java.io.IOException;

import OOP_Java.HomeWork.human.Gender;
import OOP_Java.HomeWork.human.Human;
import OOP_Java.HomeWork.tree.Tree;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Tree familyTree = new Tree();
        Human father1 = new Human( "Fiodar", "Spetsian", Gender.Male, "19.06.1998");
        Human mother1 = new Human( "Diana", "Spetsian", Gender.Female, "27.09.1999");
        Human child1 = new Human("Eva","Spetsian", Gender.Female, "03.08.2023", father1, mother1);
        Human child2 = new Human("Gleb", "Spetsian", Gender.Male, "20.05.2023", father1, mother1);
        Human child3 = new Human("Don", "null", null, "null");


        father1.addChild(child3);
        child3.setFather(father1);
        child3.setMother(mother1);
        
        familyTree.addHuman(child2);
        familyTree.addHuman(child3);
        familyTree.addHuman(child1);
        familyTree.addHuman(father1);

        System.out.println("---------------");
        System.out.println(father1.getInfo());
        System.out.println("---------------");
        familyTree.getChildren(father1);
        System.out.println("---------------");
        System.out.println(familyTree.toString());
        
        // familyTree.save("OOP_Java/HomeWork/tree.out");
        // System.out.println("----------------");     
    }
}
