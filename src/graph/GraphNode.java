package graph;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {
    public int val;
    public List<GraphNode> graphNodes;

    public GraphNode(int val) {
        this.val = val;
        this.graphNodes = new ArrayList<>();
    }

    public String toString() {
//        return val + "::" + String.join((CharSequence) ",", (CharSequence) this.graphNodes.stream().map(v->v).toList());
        return val+"";
    }

}
