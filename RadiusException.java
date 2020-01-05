//Name: Eden Schwartz
//ID: 315685461
//HW1

package HW1_EdenSchwartz;

public class RadiusException extends Exception { 
	
	private static final long serialVersionUID = 1L;

	public RadiusException(int radius) {
        super(radius + " is illegal radius");
    }
}
