/**
 * Java 21 not official lauched yet so if you want run any java 21 project you need run following below steps
 * When you code ready you may run "javac --release 21 --enable-preview MainApp.java" without the "" and switch MainApp to your right main class name 
 * Running javac --release 21 --enable-preview MainApp.java its similar to compile your classes, it will create unnamed classes as well.
 * Than you may run "java --enable-preview MainApp" this command will run your main class
 * 
 */
void main() {     
    String longStoryString = "Once upon a time, there were three little pigs. Each pig decided to build their own house. The first pig built a house of straw because it was quick and easy. The second pig chose sticks to build his house, thinking it would be faster than bricks. The third pig, however, was wise and built a sturdy house with bricks. \n Soon, a big bad wolf came along. He huffed and puffed and blew down the houses of straw and sticks easily, but he couldn't blow down the house of bricks. The first two pigs ran to the third pig's house for safety. \n The wolf tried to trick the pigs, but they were clever. In the end, the wolf couldn't get to the pigs, and they all lived safely in the strong brick house. The moral of the story is that hard work and planning are essential for a secure future.";
    
    Book book1 = new Book(longStoryString);

    System.out.println(book1.getParagraph(3));

}