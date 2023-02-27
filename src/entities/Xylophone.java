package entities;

public class Xylophone extends PercussionInst {

    @Override
    public String touch(String note) {
        return null;
    }

    @Override
    public String play(String note) {
        return "touch... " + this.getClass().getSimpleName() + " (" + note + ")";
    }


}
