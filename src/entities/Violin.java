package entities;

public class Violin extends StringInst {

    @Override
    public String vibrate(String note) {
        return null;
    }

    @Override
    public String play(String note) {
        return "vibrate... " + this.getClass().getSimpleName() + " (" + note + ")";
    }
}
