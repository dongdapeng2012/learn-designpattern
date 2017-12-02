package com.student.constant;

public enum MathUtilExceptionEnum {

	IS_EMPTY("IS_EMTPY", "Should not give empty input"),
	IS_ZERO("IS_ZERO", "Should not give zero input"),

	VECTOR_LENGTH_NOT_EQUAL("VECTOR_LENGTH_NOT_EQUAL", "Vectors should be equal length");

	private String msg;
	private String code;

	private MathUtilExceptionEnum(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public String getMsg() {
		return this.msg;
	}

	public String getCode() {
		return this.code;
	}

}