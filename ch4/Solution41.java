package hw2;

public class Solution41 {
public boolean checkRoute(int graph[][], int s, int e){
	//Use adjacent matrix to represent directed graph	
	if(s==e) return true;
	int num=graph.length;//The num of vertex in graph
	for(int i=0;i<num;i++){
		if(graph[s-1][i]==1){
			System.out.println(s-1+" "+i);
			 if(checkRoute(graph,i+1,e)){//dfs
				return true;
			 }
		}
	}
  return false;
}

 public static void main(String[] args) {
	 int[][] g={{0,1,0,0,1,0},
	            {0,0,1,1,0,0},
	            {0,0,0,0,0,0},
	            {0,0,0,0,0,1},
	            {0,0,0,0,0,0},
	            {0,0,0,0,0,0}};
	 Solution41 s= new Solution41();
	 System.out.print(s.checkRoute(g,1,5));
 }

}
