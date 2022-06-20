package com.springboot.exception;

public class ResouceNotFOundException extends RuntimeException {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public String ResouceName;
public String fieldName;
public Object fieldValue;
public ResouceNotFOundException(String resouceName, String fieldName, Object fieldValue) {
	super(String.format("%s not found  with %s:'%s'", resouceName,fieldName,fieldValue));
	ResouceName = resouceName;
	this.fieldName = fieldName;
	this.fieldValue = fieldValue;
}
public String getResouceName() {
	return ResouceName;
}
public String getFieldName() {
	return fieldName;
}
public Object getFieldValue() {
	return fieldValue;
}

}
