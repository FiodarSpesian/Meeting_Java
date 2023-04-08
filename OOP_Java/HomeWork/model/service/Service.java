package OOP_Java.HomeWork.model.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;

import OOP_Java.HomeWork.model.comporators.HumanComporatorByBirth;
import OOP_Java.HomeWork.model.comporators.HumanComporatorByName;
import OOP_Java.HomeWork.model.fileWorker.FileWorker;
import OOP_Java.HomeWork.model.human.Human;
import OOP_Java.HomeWork.model.tree.Tree;

public interface Service {
    public void get(String function);
}
