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
            for(int i = 0; i < humanList.size();  i++){
                if(humanList.get(i).getName().toLowerCase().equals(fatherName.toLowerCase())){ 
                    if(human.getFather() == null) {
                        human.setFather(humanList.get(i));
                        if (human.getFather().getName().equals(fatherName)) {
                            human.getFather().addChild(human);
                        }
                        return humanList.get(i);
                    }
                } else{
                    human.setFather(null);
                }
            }
            return null;
        }
        return null;
    }
}
