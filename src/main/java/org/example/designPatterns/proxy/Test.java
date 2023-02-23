package org.example.designPatterns.proxy;

public class Test {

    public void run(){
        String bookContent="Life is beautiful when things work.\n".repeat(200);
        BookParserProxy bookParserProxy=new BookParserProxy(bookContent);
        System.out.println("---No Computation is done yet---");

        System.out.println("---Now the com is starting---");
        System.out.println(bookParserProxy.getNumPages());
        System.out.println("---Done computing---");
        System.out.println("---Now to compute the num of verbs no need to do the heavy com---");
        System.out.println(bookParserProxy.getNumVerbs());
        System.out.println("---Tests Done---");

    }
}
