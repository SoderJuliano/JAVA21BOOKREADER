/**
 * Java 21 not official lauched yet so if you want run any java 21 project you need run following below steps
 * When you code ready you may run "javac --release 21 --enable-preview MainApp.java" without the "", shouldclera switch MainApp to your right main class name 
 * Running javac --release 21 --enable-preview MainApp.java its similar to compile your classes, it will create unnamed classes as well.
 * Than you may run "java --enable-preview MainApp" this command will run your main class
 * Before execute the main class make sure your point the main class correctly, if you are on root folder than run cd src/java
 * than you`re able to execute the compiler with javac --release 21 --enable-preview MainApp.java and run the main class with
 * java --enable-preview MainApp
 * 
 */
void main() {     
    String longStoryString = "Once upon a time, there were three little pigs. Each pig decided to build their own house. The first pig built a house of straw because it was quick and easy. The second pig chose sticks to build his house, thinking it would be faster than bricks. The third pig, however, was wise and built a sturdy house with bricks. \n Soon, a big bad wolf came along. He huffed and puffed and blew down the houses of straw and sticks easily, but he couldn't blow down the house of bricks. The first two pigs ran to the third pig's house for safety. \n The wolf tried to trick the pigs, but they were clever. In the end, the wolf couldn't get to the pigs, and they all lived safely in the strong brick house. The moral of the story is that hard work and planning are essential for a secure future.";
    
    // common java classes
    // Book book1 = new Book(longStoryString);
    // System.out.println("Book1 has "+book1.getNumberOfParagraphs()+" paragraphs.");
    // System.out.println(book1.getParagraph(3));

    // Records and Strings in java 21
    BookRecord book2 = new BookRecord(longStoryString, (int) longStoryString.chars().filter(ch -> ch == '\n').count());
    
    System.out.println("Printing o as an instance of BookRecord using interpolated String template.");
    
    // Now we have string builder that make easier manipuling strings making it repeat characteres and insert emojis into.
    StringBuilder sb = new StringBuilder("HELLO WORLD ");
    printRecord(sb.repeat(0x1f600, 1));
    printRecord(book2);

    System.out.print("\n");

    //Printing book2 in a swticher for know the switcher behavior in java 21.
    System.out.println("Printing book2 in a swticher.");
    printSwitcher(1);
    printSwitcher(sb.repeat(0x1f600, 1));
    printSwitcher(book2);

}

public void printRecord(Object o){
    if (o instanceof BookRecord(String l, Integer i)) {
        // In java 21, strings can hava java code inside them.
        String interpolatedString = STR."The book has \{i} paragraphs.\nThe book has \{l.chars().filter(ch -> ch == '\n').count()} paragraphs. Calculing inline as you can see.";
        System.out.println(interpolatedString);
        System.out.println(l.split("\n")[2]);

        // In java 21 we can use Strings.repeat method to repet a string
        System.out.println("-".repeat(200));
    } 
    else if (o instanceof BookRecord b) System.out.println(STR."The book has \{b.paragraphs()} paragraphs."); 
    else                                System.out.println("Book is something else! "+o);
    
}

// Switches and Strings in java 21
public void printSwitcher(Object o) {
    switch (o) {
        case BookRecord(String x, Integer y) -> System.out.printf("The book has %d paragraphs%n", y);
        case String s                        -> System.out.printf("The book has only a String: %s%n", s);
        default                              -> System.out.printf("O is something else: %s%n", o);
    }
}