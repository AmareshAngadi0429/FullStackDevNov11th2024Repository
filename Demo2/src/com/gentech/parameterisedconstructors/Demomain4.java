package com.gentech.parameterisedconstructors;


class Article
{
    int articleId;
    String title;
    String author;
    String description;
    String publishedDate;
    Article(int articleId,String title,String author,String description,String publishedDate)
    {
        this.articleId=articleId;
        this.title=title;
        this.author=author;
        this.description=description;
        this.publishedDate=publishedDate;
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
    Comments(int commentId,String artName,String userName, String comment,String date )
    {
        this.commentId =commentId;
        this.artName =artName;
        this.userName =userName;
        this.comment =comment;
        this.date = date;
        System.out.println("commentId: "+commentId);
        System.out.println("Article Name: "+artName);
        System.out.println("userName: "+userName);
        System.out.println("comment: "+comment);
        System.out.println("date: "+date);
    }

}

public class Demomain4 {
    public static void main(String[] args) {
        Article a =new Article(11,"The Greatness of the King","David","Acheivements of the King","12-12-2020" );
        Comments c =new Comments(12,"The Greatness of the king","Jacob","Feel Good","12-12-2024");
    }
}
