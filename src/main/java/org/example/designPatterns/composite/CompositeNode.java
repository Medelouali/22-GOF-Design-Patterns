package org.example.designPatterns.composite;

import java.util.ArrayList;
import java.util.List;

//In books like the Head First Design Pattern this is denoted as Composite
public class CompositeNode implements Node{
    private List<Node> nodes;

    public CompositeNode() {
        this.nodes = new ArrayList<>();
    }

    public void add(Node node){
        nodes.add(node);
    }
    @Override
    public String getNodeHtml() {
        String output="\n<div>\n";
        for (Node n: nodes) {
            output+=n.getNodeHtml();
        }
        output+="\n</div>\n";
        return output;
    }
}
