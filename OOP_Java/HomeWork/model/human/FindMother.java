package OOP_Java.HomeWork.model.human;

import OOP_Java.HomeWork.model.tree.Tree;

public class FindMother<E extends Human> {
    private Tree<E> humanList;
    private Human human;
    private String motherName;

    public FindMother(Tree<E> humanList, Human human, String motherName){
        this.humanList = humanList;
        this.human = human;
        this.motherName = motherName;
    }

    public Human addMother() {
        if(humanList != null){
            for(Human person: humanList){
                if(person.getName().toLowerCase().equals(motherName.toLowerCase())){ 
                    if(human.getMother() == null) human.setMother(person);
                        if (human.getMother().getName().equals(motherName)) {
                            human.getMother().addChild(human);
                        }
                } else{
                    human.setMother(null);
                }
            }
            return null;
        }
        return null;
    }
}
