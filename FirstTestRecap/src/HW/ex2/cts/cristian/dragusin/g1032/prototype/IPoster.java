package HW.ex2.cts.cristian.dragusin.g1032.prototype;

import HW.ex2.cts.cristian.dragusin.g1032.factory.IShow;

public interface IPoster {
    public void print();
    public IPoster clone();
    public void setShow(IShow show);
}
