package fr.alexandre.practice.bankocr.storyone;

import java.util.Optional;

public enum Number {

	ONE ("     |  |   ", 1),
	TWO (" _   | _ |   _ ", 2),
	THREE (" _   | _   | _ ", 3),
	FOUR ("   |   _   |   ", 4),
	FIVE (" _ |   _   | _ ", 5),
	SIX (" _ |   _ | | _ ", 6),
	SEVEN (" _   |  |   ", 7),
	EIGHT (" _ | | _ | | _ ", 8),
	NINE (" _ | | _   | _ ", 9);

	private String label;
	private int value;

	public String getLabel() {
		return label;
	}

	public void setLabel(final String label) {
		this.label = label;
	}

	public int getValue() {
		return value;
	}

	public void setValue(final int value) {
		this.value = value;
	}

	Number(final String label, final int value) {
		this.label = label;
		this.value = value;
	}

	public static Optional<Number> getNumberFromLabel(String label){
		for (final Number number : values()) {
			if(number.getLabel().equals(label)){
				return Optional.of(number);
			}
		}
		return Optional.empty();
	}


}
