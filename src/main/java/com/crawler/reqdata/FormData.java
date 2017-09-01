package com.crawler.reqdata;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.message.BasicNameValuePair;

import com.crawler.util.MD5Util;

public class FormData {

	// 存储post请求参数
	public static List<BasicNameValuePair> params = new ArrayList<BasicNameValuePair>();

	// 初始化其他静态请求参数
	static {
		params.add(new BasicNameValuePair("from", "AUTO"));
		params.add(new BasicNameValuePair("to", "AUTO"));
		params.add(new BasicNameValuePair("smartresult", "dict"));
		params.add(new BasicNameValuePair("client", "fanyideskweb"));
		params.add(new BasicNameValuePair("doctype", "json"));
		params.add(new BasicNameValuePair("version", "2.1"));
		params.add(new BasicNameValuePair("keyfrom", "fanyi.web"));
		params.add(new BasicNameValuePair("action", "FY_BY_ENTER"));
		params.add(new BasicNameValuePair("typoResult", "true"));
	}

	// 获取本次请求参数
	public static List<BasicNameValuePair> getParams(String context) {
		// 设置需要翻译的文本
		params.add(new BasicNameValuePair("i", context));
		// 获取时间戳
		String dateTime = System.currentTimeMillis() + "" + (int) (Math.random() * 10);
		// 设置当前时间戳
		params.add(new BasicNameValuePair("salt", dateTime));
		// 设置加密请求密文
		params.add(new BasicNameValuePair("sign", getSign(context, dateTime)));
		return params;
	}

	// 转解析密文
	public static String getSign(String context, String dateTime) {
		String md5 = MD5Util.MD5("fanyideskweb" + context + dateTime + "rY0D^0'nM0}g5Mm1z%1G4");
		return md5;
	}

}
