package com.crawler.reqdata;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * head 请求头
 */
public class HeaderConstant {

	public static Map<String, String> header;

	static {
		header = new HashMap<String, String>();
		header.put("Accept", "application/json, text/javascript, */*; q=0.01");
		header.put("Accept-Encoding", "gzip, deflate");
		header.put("Accept-Language", "zh-CN,zh;q=0.8");
		header.put("Connection", "keep-alive");
		header.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
		// cookie先注释了
		//header.put("Cookie","OUTFOX_SEARCH_USER_ID_NCOO=166274930.18156153; OUTFOX_SEARCH_USER_ID=901550266@10.168.11.16; JSESSIONID=aaanqMPAgNF02bONojS4v; ___rl__test__cookies=1503979214795");
		header.put("Host", "fanyi.youdao.com");
		header.put("Referer", "http://fanyi.youdao.com");
		header.put("Origin", "http://fanyi.youdao.com");
		header.put("User-Agent",
				"Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.87 Safari/537.36");
		/*header.put("X-Requested-With", "XMLHttpRequest");*/
	}

	public static void initCookie(String cookies) {
		header.put("Cookie", cookies);
	}

}
