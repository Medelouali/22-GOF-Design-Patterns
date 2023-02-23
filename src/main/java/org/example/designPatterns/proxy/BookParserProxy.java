package org.example.designPatterns.proxy;

public class BookParserProxy implements BookParser {
    private EngishBookParser engishBookParser=null;
    private String bookContent;

    public BookParserProxy(String bookContent) {
        this.bookContent = bookContent;
    }

    @Override
    public long getNumPages() {
        if(engishBookParser==null)engishBookParser=new EngishBookParser(bookContent);
        return this.engishBookParser.getNumPages();
    }

    @Override
    public long getNumVerbs() {
        if(engishBookParser==null)engishBookParser=new EngishBookParser(bookContent);
        return this.engishBookParser.getNumVerbs();
    }
}
