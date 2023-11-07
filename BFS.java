import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS{
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> bfs = new ArrayList<>();
        int[] vis=new int[V];
        Queue<Integer> q=new LinkedList<>();

        q.add(0);
        vis[0]=1;
        while(q.size()>0){
            Integer node=q.poll();
            bfs.add(node);
            for(int i=0;i<adj.get(node).size();i++){
                int temp=adj.get(node).get(i);
                if(vis[temp]!=1){
                    q.add(temp);
                    vis[temp]=1;
                }
            }
        }
        return bfs;
    }
}