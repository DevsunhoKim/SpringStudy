package com.sist.main;

import org.jsoup.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.json.*;

import java.io.IOException;

public class Yes24 {

    private static final int MAX_PAGE = 111;
    private static int totalBooksCrawled = 0;

    public static void main(String[] args) {
        for (int i = 1; i <= MAX_PAGE; i++) {
            String landingPageUrl = "https://www.yes24.com/24/Category/Display/001001003020?PageNumber=" + i;
            crawlLandingPage(landingPageUrl);
        }
        System.out.println("총 크롤링된 책의 수: " + totalBooksCrawled);
    }

    private static void crawlLandingPage(String url) {
        try {
            Document landingPage = Jsoup.connect(url).get();
            Elements bookLinks = landingPage.select("div.cCont_listArea ul.clearfix li div.cCont_goodsSet div.goods_name a");

            for (Element link : bookLinks) {
                String bookDetailUrl = "https://www.yes24.com" + link.attr("href");
                crawlBookDetails(bookDetailUrl);
                totalBooksCrawled++;
            }
        } catch (IOException e) {
            System.err.println("크롤링 중 오류 발생: " + e.getMessage());
        }
    }

    private static void crawlBookDetails(String url) {
        try {
            Connection.Response response = Jsoup.connect(url).execute();
            Document document = response.parse();

            // JSON-LD 데이터 파싱
            String jsonLdScript = document.select("script[type=application/ld+json]").html();
            JSONObject jsonLdObject = new JSONObject(jsonLdScript);

            // 책 정보 추출
            String bookName = jsonLdObject.getString("name");
            String author = jsonLdObject.getJSONObject("author").getString("name");
            String publisher = jsonLdObject.getJSONObject("publisher").getString("name");
            String posterUri = jsonLdObject.getString("image");

            // 가격 정보 추출
            JSONArray workExample = jsonLdObject.getJSONArray("workExample");
            JSONObject firstWorkExample = workExample.getJSONObject(0);
            JSONObject expectsAcceptanceOf = firstWorkExample.getJSONObject("potentialAction").getJSONObject("expectsAcceptanceOf");
            String price = expectsAcceptanceOf.getString("Price") + " KRW";

            // 평점 정보 추출
            JSONObject aggregateRating = jsonLdObject.getJSONObject("aggregateRating");
            String rating = aggregateRating.getString("ratingValue");

            // 부제목 정보 추출
            String subtitle = jsonLdObject.getString("description");

            // 장르 정보 추출
            String genre = jsonLdObject.getString("genre");

            // 상세 이미지 URL 정보 추출
            String detailedImageURL = jsonLdObject.getString("image");

            // 추출한 정보 출력
            System.out.println("책 이름: " + bookName);
            System.out.println("저자: " + author);
            System.out.println("출판사: " + publisher);
            System.out.println("포스터 URI: " + posterUri);
            System.out.println("가격: " + price);
            System.out.println("평점: " + rating);
            System.out.println("부제목: " + subtitle);
            System.out.println("장르: " + genre);
            System.out.println("상세 이미지 URL: " + detailedImageURL);
            System.out.println("------------------------");

        } catch (IOException e) {
            System.err.println("상세 정보 크롤링 중 오류 발생: " + e.getMessage());
        }
    }



}
