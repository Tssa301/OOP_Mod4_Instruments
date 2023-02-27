package entities;

public class Saxophone extends WindInst {

    @Override
    public String blow(String note) {
        return null;
    }

    @Override
    public String play(String note) {
        return "blow... " + this.getClass().getSimpleName() + " (" + note + ")";
    }
}
