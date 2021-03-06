/**
 * 作者：樊钰丰
 * 时间：2017.9.22
 * 功能：自定义类型转换器,定义多个类型转换器会出错
 */

package com.primary.converters;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

import org.springframework.beans.TypeMismatchException;
import org.springframework.core.convert.converter.Converter;


//Converter<S, T> 中的S表示源类型,T表示宿的类型(即转换为的目标类型)
public class MyDataConverter implements Converter<String, Date> {

	public Date convert(String source) {
		SimpleDateFormat sdf=getDateFormat(source);
		try {
			return sdf.parse(source);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	private SimpleDateFormat getDateFormat(String source) {
		SimpleDateFormat sdf=null;
		if(Pattern.matches("^\\d{4}-\\d{2}-\\d{2}$",source)) {
			sdf=new SimpleDateFormat("yyyy-MM-dd");
		}else if(Pattern.matches("^\\d{4}/\\d{2}/\\d{2}$", source)) {
			sdf=new SimpleDateFormat("yyyy/MM/dd");
		}else if(Pattern.matches("^\\d{4}\\d{2}\\d{2}$", source)) {
			sdf=new SimpleDateFormat("yyyyMMdd");
		}else{
			throw new TypeMismatchException("", Date.class);
		}
		return sdf;
	}
}
