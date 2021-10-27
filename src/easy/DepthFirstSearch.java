package easy;

import java.util.ArrayList;
import java.util.List;

public class DepthFirstSearch {

    //You are given a Node class that has a name and an array of optional children nodes.
    //When put together, nodes form an acyclic tree-like structure.
    //Implement the depthFirstSearch method on the node class, which takes in an empty array,
    //traverses the tree using the Depth-First Search approach(left to right),
    //stores all off the nodes' names in the input array and returns it.
    
    static class Node {
        String name;
        List<Node> children = new ArrayList<>();

        public Node(String name) {
            this.name = name;
        }

        public List<String> depthFirstSearch(List<String> array) {
            List<String> newArray = new ArrayList<String>();
            newArray.add(name);
            for(Node node:children){
                depthSearchAlgorithm(node,newArray);
            }
            return newArray;
        }

        public Node addChild(String name) {
            Node child = new Node(name);
            children.add(child);
            return this;
        }
    }

    public static void depthSearchAlgorithm(Node node, List<String> array){
        if (node == null){
            return;
        }
        array.add(node.name);
        for(Node nodes:node.children){
            depthSearchAlgorithm(nodes,array);
        }
    }
}
