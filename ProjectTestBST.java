import java.io.*;


public class ProjectTestBST {
    BufferedReader fileReader; // using buffered reader we create fileReader
    BST<String> bst; // we create a BST
    
    // This is the main method for calling all of the classes and methods for testing
    public static void main(String[] args) {
	ProjectTestBST test = new ProjectTestBST("Datafile.txt"); // call on the ProjectTestBST using the filename of the data file
    
	test.bst.inorder(); // Invoke the inOrder printing and cycle through the BST using inOrder method
    test.bst.search("database"); // search and find the database keyword and its linked list
    test.bst.search("java"); // search and find the java keyword and its linked list
    }
    
    // This method is for testing the data file and creating the BST from it. This is the core method of the project
    public ProjectTestBST(String filename){
        
    	try { //Creating instance of fileReader
            bst = new BST<String>(); // this creates a new BST
            fileReader = new BufferedReader (new FileReader(filename)); // create a new buffered reader for the data in the data file
            while(readNextRecord()){} // while loop to read the data until we have no more
        }
        catch(IOException e){
            e.printStackTrace(); // catch an exception for errors and pinpoint the line that it is occurring on
        }
    }
    
    // This method is for reading in the data file
    public boolean readNextRecord(){
        // If there is no data file then we print out the error and return false to indicate to calling function that we are done reading
    	if(fileReader == null){
            System.out.println("Error: you must open the file first");
            return false;
        }
        
    	// If there is data to be read then we start reading in data
        else {
            try {
                String data = fileReader.readLine(); // This creates the data to read the next line in file reader
                // if the data is null that means we have no more data to read and to exit the reading method
                if(data == null)
                    return false;
               int titleId = Integer.parseInt(data); // Reading the first line i.e. the id of the article
               String title = fileReader.readLine(); // Reading the second line i.e. title
               String author = fileReader.readLine(); // reading the third line which is the author
               int numKeys = Integer.parseInt(fileReader.readLine()); // after that we read in the number of keywords for that article
               Article article = new Article(titleId,title,author); // we create an article object using the data we just read in

               // Next is for the keywords 
               String keyword;
               // This for loop uses the number of keys we got from reading the data file to know how many lines we need to read in for this article
               for(int i = 0; i < numKeys; i++){
                   keyword = fileReader.readLine(); // we read in a keyword
                   bst.insert(keyword,article); // insert it into the BST by finding/creating its BST node and then inserting its article into the linked list
               }
               fileReader.readLine(); // then we read the next line for the next article
            }
            // these are for catching file reading errors
            catch(NumberFormatException e){ // this one is for if we were supposed to read a number but didn't (e.x. missing numbers or not correctly formated data file)
                System.out.println("Error: Number expected!");
            }
            catch (Exception e){ // next is just a more broad error catch and will not tell you exactly what went wrong
                System.out.println("Fatal Error" + e);
            }
        }
        return true; // return true to calling method to indicate there is more to be read from the data file
    }
}
