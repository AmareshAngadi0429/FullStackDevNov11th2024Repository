package com.gentech.withconstructers;

class Article
{
	int articleId;
	String title;
	String author;
	String description;
	String publishedDate;
	Article()
	{
		articleId=1;
		title="The Great King";
		author="Alford";
		description="Greatnes of the King and his Achivements";
		publishedDate="12-12-2024";
		System.out.println("articleId: "+articleId);
		System.out.println("title: "+title);
		System.out.println("author: "+author);
		System.out.println("description: "+description);
		System.out.println("publishDate: "+publishedDate);
		System.out.println("--------------------------------------------");
	}
	
}

class Comments
{
	int commentId;
	String artName;
	String userName;
	String comment;
	String date;
	Comments()
	{
		commentId =12;
		artName ="The Great King";
		userName ="Jacob";
		comment ="Loved the Article";
		date = "12-12-2024";
		System.out.println("commentId: "+commentId);
		System.out.println("Article Name: "+artName);
		System.out.println("userName: "+userName);
		System.out.println("comment: "+comment);
		System.out.println("date: "+date);
	}
	
}

public class Demomain4 {
	public static void main(String[] args) {
		
		Article ar = new Article();
		
		Comments com = new Comments();

	}

}
