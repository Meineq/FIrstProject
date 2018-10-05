package Package;

import java.sql.Time;

public class Way {
    private int FirsPoint;
    private int LastPoint;
    private double Cost;
    private Time Start;
    private Time Finish;
    private int countMachine;

    public int getFirsPoint() {
        return FirsPoint;
    }

    public void setFirsPoint(int firsPoint) {
        FirsPoint = firsPoint;
    }

    public int getLastPoint() {
        return LastPoint;
    }

    public void setLastPoint(int lastPoint) {
        LastPoint = lastPoint;
    }

    public double getCost() {
        return Cost;
    }

    public void setCost(double cost) {
        Cost = cost;
    }

    public Time getStart() {
        return Start;
    }

    public void setStart(Time start) {
        Start = start;
    }

    public Time getFinish() {
        return Finish;
    }

    public void setFinish(Time finish) {
        Finish = finish;
    }

    public int getCountMachine() {
        return countMachine;
    }

    public void setCountMachine(int countMachine) {
        this.countMachine = countMachine;
    }
}
