package ui;

import presenter.Presenter;

public interface View {
    public void showMenu();
    public void start();

    public Presenter getPresenter();
}
