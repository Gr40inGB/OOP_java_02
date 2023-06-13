package model;

import presenter.Presenter;

public interface Service {
    public void setPresenter(Presenter presenter);

    public void setLeftNumber();

    public void setRightNumber();

    public String deside();


    public String multy();


    public String minus();


    public String plus();


}
