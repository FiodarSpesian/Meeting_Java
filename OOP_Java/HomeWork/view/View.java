package OOP_Java.HomeWork.view;

import OOP_Java.HomeWork.presenter.Presenter;

public interface View {
    void start();
    void setPresenter(Presenter presenter);
    void print(String text);
}
