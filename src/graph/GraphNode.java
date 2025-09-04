package graph;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {
    int val;
    List<GraphNode> graphNodes;

    GraphNode(int val) {
        this.val = val;
        this.graphNodes = new ArrayList<>();
    }

}
