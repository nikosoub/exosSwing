

import java.lang.*;

public class StrModel {
    private StringBuffer sb;

    public StrModel() {
	sb = new StringBuffer('a');
    }
    
    public void append() {
	sb.append('a');
    }

    public String getValue() {
	return sb.toString();
    }
}