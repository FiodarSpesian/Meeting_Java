package OOP_Java.HomeWork;


public class Main {
    public static void main(String[] args) {
        Tree familyTree = new Tree();
        Human father1 = new Human( "Fiodar", "Spetsian", Gender.Male, "19.06.1998");
        Human mother1 = new Human( "Diana", "Spetsian", Gender.Female, "27.09.1999");
        Human child1 = new Human("Eva","Spetsian", Gender.Female, "03.08.2023");
        Human child2 = new Human("Gleb", "Spetsian", Gender.Male, "20.05.2023", father1, mother1);
        familyTree.addHuman(child2);
        //System.out.println(familyTree.getChildren(father1));
        child1.setMother(mother1);
        child1.setFather(father1);
        // familyTree.addHuman(father1);
        // familyTree.addHuman(mother1);
        familyTree.addHuman(child1);
        System.out.println(familyTree.getChildren(father1));



    }
    
}
