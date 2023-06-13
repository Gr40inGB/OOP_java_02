package ui;

import presenter.Presenter;

public interface View {
    public void start();
    public void exit();

    public Presenter getPresenter();

    public void showRezult(String rezult);
}
