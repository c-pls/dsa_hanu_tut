package Tut_11_BFS;

public class GVertex {
	private char label;
	private char color;

	public GVertex() {
		this.label = '\u0000';
		this.color = 'B';
	}

	public GVertex(char label) {
		this.label = label;
		color = 'B';
	}

	public char getLabel() {
		return label;
	}

	public void setLabel(char label) {
		this.label = label;
	}

	public char getColor() {
		return color;
	}

	public void setColor(char color) {
		this.color = color;
	}

}
