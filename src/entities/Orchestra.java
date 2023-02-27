package entities;

public class Orchestra {

    private final Instrument[] instruments;

    public Orchestra(Instrument[] instruments) {
        this.instruments = instruments;
    }

    public String play(String note){
        StringBuilder result = new StringBuilder();

        for (Instrument instrument : instruments){
            result.append(instrument.play(note)).append("\n");
        }
        return result.toString();
    }
}
