package Exceptions;

//checked exception
public class InvalidTimeException extends Exception  //Custom Exceptions: InvalidTimeException must extend Exception to be a checked exception.
{
	private String fieldName;
	private int fieldValue;
	
	public InvalidTimeException() {
	}
	
	public InvalidTimeException(String fieldName, int fieldValue) {
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}

	public InvalidTimeException(String fieldName, int fieldValue, String message) {
		super(message);
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}

	@Override
	public String toString() {
		return "InvalidTimeException [fieldName=" + fieldName + ", fieldValue=" + fieldValue + "]"+super.getMessage();
	}
	
	
	

}
