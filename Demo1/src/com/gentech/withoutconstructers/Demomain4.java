package com.gentech.withoutconstructers;

class Article
{
	int articleId;
	String title;
	String author;
	String description;
	String publishedDate;
}

class Comments
{
	int commentId;
	String artName;
	String userName;
	String comment;
	String date;
	
}

public class Demomain4 {
	public static void main(String[] args) {
		
		Article ar = new Article();
		ar.articleId=1;
		ar.title="The Great King";
		ar.author="Alford";
		ar.description="Greatnes of the King and his Achivements";
		ar.publishedDate="12-12-2024";
		System.out.println("articleId: "+ar.articleId);
		System.out.println("title: "+ar.title);
		System.out.println("author: "+ar.author);
		System.out.println("description: "+ar.description);
		System.out.println("publishDate: "+ar.publishedDate);
		System.out.println("--------------------------------------------");
		
		Comments com = new Comments();
		com.commentId =12;
		com.artName ="The Great King";
		com.userName ="Jacob";
		com.comment ="Loved the Article";
		com.date = "12-12-2024";
		System.out.println("commentId: "+com.commentId);
		System.out.println("Article Name: "+com.artName);
		System.out.println("userName: "+com.userName);
		System.out.println("comment: "+com.comment);
		System.out.println("date: "+com.date);

	}

}
