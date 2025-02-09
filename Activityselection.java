import java.util.*;
class Activityselection{
  public static void main(String args[]){
    int start[]={};
    int end[]={};
    int activities[][]=new int[start.length][3];
    for(int i=0;i<start.length;i++){
      activities[i][0]=i;
      activities[i][1]=start[i];
      activities[i][2]=end[i];
    }
    //lambda function
  Arrays.sort(activities, Comparator.comparingDouble(o->o[2]);
    int maxAct=0;
    Arraylist<Integer>ans= new ArrayList<>():
      int maxAct=1;
    ans.add(activities[0][0]0);
    int lastEnd=activities[0][2];
    fot(int i=1;i<start.length;i++){
      if(activities[i][1]>=lastEnd){
        maxAct++;
        ans.add(activities[i][0]);
        lastEnd=activities[i][2];
      }
    }
    System.out.print(maxAct);
