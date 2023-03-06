package org.example.designPatterns.composite;

public class Test {
    public void run(){
        System.out.println("let's output some tree");
        CompositeNode compositeNode1=new CompositeNode();
        compositeNode1.add(new LeafNode());
        compositeNode1.add(new LeafNode());
        compositeNode1.add(new LeafNode());

        CompositeNode compositeNode2=new CompositeNode();
        compositeNode2.add(new LeafNode());
        compositeNode2.add(new LeafNode());
        compositeNode2.add(new LeafNode());

        CompositeNode compositeNode=new CompositeNode();
        compositeNode.add(compositeNode1);
        compositeNode.add(compositeNode2);

        System.out.println(compositeNode.getNodeHtml());
    }
}
