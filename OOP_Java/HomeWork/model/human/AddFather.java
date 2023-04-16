package OOP_Java.HomeWork.model.human;

import OOP_Java.HomeWork.model.tree.Tree;

public class AddFather<E extends Human> {
    private Tree<E> humanList;
    private Human human;
    private String fatherName;

    public AddFather(Tree<E> humanList, Human human, String fatherName){
        this.humanList = humanList;
        this.human = human;
        this.fatherName = fatherName;
    }
    
    public Human setFather() {
        if(humanList != null){
            for(Human person: humanList){
                if(person.getName().toLowerCase().equals(fatherName.toLowerCase())){ 
                    if(human.getFather() == null) human.setFather(person);
                        if (human.getFather().getName().equals(fatherName)) {
                            human.getFather().addChild(human);
                        }
                } else{
                    human.setFather(null);
                }
            }
            return human;
        }
        human.setFather(null);
        return human;
    }
}
