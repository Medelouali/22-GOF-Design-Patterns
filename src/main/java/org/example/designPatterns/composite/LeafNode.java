package org.example.designPatterns.composite;

//In books like the Head First Design Pattern this is denoted as Leaf
public class LeafNode implements Node{
    private static long id=0;
    @Override
    public String getNodeHtml() {
        return "\t<div> \n"+(id++)+" \n\t</div>\n";
    }
}
