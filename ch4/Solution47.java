package hw2;

import java.util.ArrayList;
import java.util.LinkedList;

class Project {
	String name;
	Project(String s){
		name=s;
	}
}

public class Solution47 {
public ArrayList<Project> buildOrder(int num, ArrayList<Project> projects, int[][] pDependency){
	//use adjacent form to store the dependency of the projects 
	ArrayList<Project> order= new ArrayList<Project>();
	if(pDependency == null) return order;
	if(pDependency.length==0||num==0){
		order=projects;
	}
	// counter for num of dependency
    int[] pCount = new int[num];
    for(int i=0; i<pDependency.length; i++){
        pCount[pDependency[i][0]]++;
    }
    //store projects that have no dependency
    LinkedList<Integer> queue = new LinkedList<Integer>();
    for(int i=0; i<num; i++){
        if(pCount[i]==0){
            queue.add(i);
        }
    }
 
 
    while(!queue.isEmpty()){
        int top = queue.remove();
        order.add(projects.get(top));//A possible order of projects
        for(int i=0; i<pDependency.length; i++){
            // if a project's prerequisite can be satisfied by a projects in queue
            if(pDependency[i][1]==top){
                pCount[pDependency[i][0]]--;
                if(pCount[pDependency[i][0]]==0){
                    queue.add(pDependency[i][0]);
                }
            }
        }
    }
    if(order.size()!=num) return new ArrayList<Project>();
	return order;
}
}
