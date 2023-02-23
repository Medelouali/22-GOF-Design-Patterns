package org.example.designPatterns.proxy;

public class EngishBookParser implements BookParser{
    private long numPages;
    private long numVerbs;
    private String bookContent;
    public EngishBookParser(String bookString){
        //Some expensive computation goes here
        for(long i=0; i<100; i++){
            this.numPages+=i*bookString.length();
            this.numVerbs+=i;
        };
        this.bookContent=bookString;
    }
    @Override
    public long getNumPages() {
        return numPages;
    }

    @Override
    public long getNumVerbs() {
        return numVerbs;
    }

    public void setNumPages(long numPages) {
        this.numPages = numPages;
    }

    public void setNumVerbs(long numVerbs) {
        this.numVerbs = numVerbs;
    }
}
