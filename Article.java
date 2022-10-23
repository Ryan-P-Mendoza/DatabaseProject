public class Article {
    
	// For articles we have the ID, the Title, and Author
	int id;
    String title;
    String author;

    // For the article object we read in the ID, title and author and set them to the elements of the article node object
    public Article(int i, String t, String a){
        id = i;
        title = t;
        author = a;
    }
    // the toString method converts the elements of the article object to a string using formating so we can print it to the user as one string
    public String toString(){
        return String.format("\t %d | %s | %s -->\n", id,title,author);
    }
}
