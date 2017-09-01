package com.crawler.main;

import com.crawler.constant.UrlConstant;
import com.crawler.reqdata.FormData;
import com.crawler.reqdata.HeaderConstant;
import com.crawler.util.HttpClientUtil;

public class YoudaoMain {

	/**
	 * 
	 * @Description 请求方法
	 */
	public static void main(String[] args) throws Exception {
		try {
			String post = HttpClientUtil.post(UrlConstant.ydApi, HeaderConstant.header, FormData.getParams("需要翻译的词语"));
			System.out.println(post);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
