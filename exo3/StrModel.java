package exo3;

public class StrModel {
	private StringBuffer sb;

	public StrModel() {
		sb = new StringBuffer();
	}

	public void appendA() {
		sb.append('a');
	}

	public void appendB() {
		sb.append('b');
	}

	public void deleteLast() {
		if (sb.length() != 0) {
			sb.deleteCharAt(sb.length() - 1);
		}
	}

	public String getValue() {
		return sb.toString();
	}
}