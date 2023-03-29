package OOP_Java.HomeWork;

import java.util.ArrayList;
import java.util.List;

public class Tree {
    private List<Human> humanList;    
    public Tree(){
        this(new ArrayList<>());
    }

    private Tree(List<Human> humanList) {
        this.humanList = humanList;
    }

    public void addHuman(Human human) {
        this.humanList.add(human);
    }

    public List<Human> getChildren(Human parent) {
        List<Human> res = new ArrayList<>();
            for (int i = 0; i < humanList.size(); i++) {
                if(humanList.get(i).getFather().equals(parent) || humanList.get(i).getMother().equals(parent)){
                    res.add(humanList.get(i));
                }
            }
        return res;
    }
}
