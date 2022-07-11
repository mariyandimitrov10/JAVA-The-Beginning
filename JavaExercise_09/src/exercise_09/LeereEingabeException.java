package exercise_09;

public class LeereEingabeException extends NumberFormatException {
    public LeereEingabeException() {
	super();
    }

    public LeereEingabeException(String s) {
	super(s);
    }
}
