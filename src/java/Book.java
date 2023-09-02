public class Book {
    
    private String longStoryString;
    private Integer paragraphs;

    public Book (String longStoryString){
        this.longStoryString = longStoryString;
        countParagraph(longStoryString);
    }

    public String getLongStoryString() {
        return this.longStoryString;
    }

    public String getParagraph(int p){
        return longStoryString.split("\n")[p-1];
    }

    private void countParagraph(String longString){
        if(longString.contains("\n")){
            this.paragraphs =+ 1;
        }
    }

}
