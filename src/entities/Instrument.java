package entities;

public abstract class Instrument {
    //Abstract method play
    public abstract String play(String note);

}

//Division of Instruments into three classes: Percussion, Strings and Wind.
//All extend the Instrument Class and return their own abstract methods: touch, vibrate and blow.

abstract class PercussionInst extends Instrument{
    public abstract String touch(String note);
}

abstract class StringInst extends Instrument{
    public abstract String vibrate(String note);
}

abstract class WindInst extends Instrument{
    public abstract String blow(String note);
}
