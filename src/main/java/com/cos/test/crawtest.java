package com.cos.test;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class crawtest {

	public void 유튜브() {
		String yid = "생활코딩1";
		String url = "https://www.youtube.com/c/"+yid;
		
		try {
			Document doc = Jsoup.connect(url).get();
			
			//var c = document.querySelector("span link").href;
			String uid = doc.selectFirst("span link").attr("href");
			System.out.println(uid);
			
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
