package com.srm.day03.java;

 class Publication
{
	 
  private String title;
  private float price;
  
  public  Publication(String title,float price)
   {
   this.title=title;
   this.price=price;
   }
  
  public void display()
   {
   System.out.println("Title:"+title);
   System.out.println("Price:"+price);
   }
}

 class Book extends Publication
{
     public int pages;
   public  Book(String title,float price,int pages)
      {
     super(title,price);
     this.pages=pages;
      }
   
	public void display()
     {
     super.display();
     System.out.println("No of Pages:"+pages);
     System.out.println("-------------------");
     }
}

 class CD extends Publication
{
	 String playtime;
    public CD(String title, float price,String playtime) {
		super(title, price);
		this.playtime=playtime;
		
	}

	public void display()
     {
     super.display();
     System.out.println("Playing Time:"+playtime);
     }
}
 
public class BookDetails {

	public static void main(String[] args) {
		
		System.out.println("BOOK DETAILS.");
		System.out.println("--------------");
		Publication p1=new Book("Harry Potter",350,2000);
	       p1.display();
         Publication p2 =new CD("The Hobbit",200,"2Hrs");
         p2.display();

	}
}
