package inbo0519.pr1;

public class Book {
    private String lang;
    private int pages;

    public Book(String l, int p){
        lang = l;
        pages = p;
    }
    public void setLang(String lang){
        this.lang = lang;
    }
    public void setPages(int pages){
        this.pages = pages;
    }
    public String getLang(){
        return lang;
    }
    public int getPages(){
        return pages;
    }
    public String toString(){
        return "Lang: "+this.lang+", pages: "+this.pages;
    }
}
