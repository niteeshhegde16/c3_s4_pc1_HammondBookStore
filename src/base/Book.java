package base;



public class Book {
    private long isbnNumber;
    private String title;
    private String description;
    private float price;




    public long getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(long isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public void display(){
        System.out.println("ISBN NUmber =  "+isbnNumber);
        System.out.println("Title ="+title);
        System.out.println("Description = "+description);
        System.out.println("Price = "+price);
    }




    public static void main(String[] args) {
        Author obj = new Author();
        obj.setAuthorName("Sudeep Nagarkar");
        obj.setAuthorPenName("xyz");
        System.out.println(obj.toString());
        Book book = new Book();
        book.isbnNumber = 101;
        book.title = "Few Things left unsaid";
        book.description = "Novel";
        book.price = 160.0F;
        book.display();

    }


}
