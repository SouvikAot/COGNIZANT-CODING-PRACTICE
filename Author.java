public class Author {
    String name;
    String email;
    char gender;
    Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public static void main(String[] args) {
        Book book=new Book("Gitanjali","Rabindranath Tagore", 560,5);
        Author a= new Author("Rabindranath Tagore","rabindra710@gmail.com",'M');
       // System.out.println(book.name,book.author);

    }
}
