package springbootmvc.constant;

public class BaseException extends Exception {

	private static final long serialVersionUID = 1L;

	/** 
	 *   
	 */
	public BaseException() {
		super();
	}

	/**
	 * @param arg0
	 */
	public BaseException(String arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public BaseException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	/**
	 * @param arg0
	 */
	public BaseException(Throwable arg0) {
		super(arg0);
	}
}