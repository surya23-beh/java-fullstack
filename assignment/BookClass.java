package assignment;
 class Books {
 private String title;
 private String author;
 private double price;
 public String getTitle() {
     return title;}
 public void setTitle(String title) {
     this.title = title;}
 public String getAuthor() {
     return author;}
 public void setAuthor(String author) {
     this.author = author;}
 public double getPrice() {
     return price;}
 public void setPrice(double price) {
     this.price = price;}
 public double applyDiscount(double percent) {
     price = price-(price*percent/100);
     return price;}
}
public class BookClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Books b1 = new Books();
		        b1.setAuthor("suri");
		        b1.setTitle("vaazhkai sikkal");
		        b1.setPrice(2000);
		        double discprice = b1.applyDiscount(10.0);
		        System.out.println("author name is :" + b1.getAuthor());
		        System.out.println("title : " + b1.getTitle());
		        System.out.println("price : " + b1.getPrice());

	}
		}

