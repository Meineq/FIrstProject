package Package;

public class Transport {
    private Machine machine;
    private Voditel voditel;
    private Controller controller;
    private Way way;

    public Machine getMachine() {
        return machine;
    }

    public void setMachine(Machine machine) {
        this.machine = machine;
    }

    public Voditel getVoditel() {
        return voditel;
    }

    public void setVoditel(Voditel voditel) {
        this.voditel = voditel;
    }

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public Way getWay() {
        return way;
    }

    public void setWay(Way way) {
        this.way = way;
    }
}
