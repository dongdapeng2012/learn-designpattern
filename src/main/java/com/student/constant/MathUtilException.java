package com.student.constant;

public class MathUtilException extends BaseException {

	private static final long serialVersionUID = 1L;

	private MathUtilExceptionEnum exceptionEnums;

	public MathUtilExceptionEnum getExceptionEnums() {
		return exceptionEnums;
	}

	public MathUtilException(MathUtilExceptionEnum exceptionEnums) {
		this.exceptionEnums = exceptionEnums;
	}

	public MathUtilException(String arg0) {
		super(arg0);
	}

	public MathUtilException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

}
