# DatabaseProject
This is my database project. It utilizes a binary search tree to sort keywords for articles. It then creates a singularly linked list connected to every node of the BST to connect every article associated with that keyword. You can then search for articles using keywords.

The main method is in ProjectTestBST, it utilzies a textfile to read in articles and keywords with a specific format:

 - ID Number
 - TItle of Article
 - Author
 - Number of Keywords
 - Keywords
  
For example:
 - 46359
 - A Content-Based Retrieval System for Medical Images
 - John Anderson
 - 4
 - database
 - image-retrieval
 - content-based
 - medical
