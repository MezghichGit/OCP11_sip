package day6_06082023;

public class CBException extends Exception{
	
	public CBException() {
		super();
	}
	public CBException(IllegalArgumentException e) {
		super(e);
	}
	public CBException(String msg) {
		super(msg);
	}

}
