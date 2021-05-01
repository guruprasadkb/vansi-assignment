package com.gprasad.problems;

import com.gprasad.problems.models.ListNode;
import com.gprasad.problems.models.Node;

import java.util.HashMap;
import java.util.List;

public final class Util {
    HashMap<Integer, Node> nodeHashMap = new HashMap<>();
    public boolean compareArrays(int[][] a, int[][] b) {

        if (a.length != b.length || a[0].length != b[0].length){
            return false;
        }
        if(a.length == 0){
            return true;
        }
        for (int i=0; i<a.length; i++){
            for(int j=0;j<a[0].length;j++){
                if (a[i][j] != b[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean compareNodes(Node testNode1, Node node) {
        if(testNode1 == null && node == null ){
            return true;
        } else if(testNode1 == null || node == null){
            return false;
        }
        return (nodeToString(testNode1).equalsIgnoreCase(nodeToString(node)));
    }

    public String nodeToString(Node testNode1){

        nodeHashMap.clear();
        fillHashMap(testNode1);
        String s = "";
        for(int i=1;i<101;i++){
            Node currentNode = nodeHashMap.get(i);
            if(currentNode== null){
                s+= ":null";
            }else {
                for (Node n:currentNode.neighbors) {
                    s+= ":"+n.val;
                }
            }
        }
        return s;
    }

    public String arrayToString(int[] testNode1){

        String s = "[ ";
        for(int i=0;i<testNode1.length;i++){
            s += testNode1[i] + ", ";
        }
        s = s.substring(0,s.length()-2);
        s+=" ]";
        return s;
    }

    public void fillHashMap(Node testNode1) {
        if(nodeHashMap.containsKey(testNode1.val)){
            return;
        }
        nodeHashMap.put(testNode1.val,testNode1);
        for (Node n :testNode1.neighbors) {
            if(!nodeHashMap.containsKey(n.val)) {
                fillHashMap(n);
            }
        }

    }

    public boolean compareLists(List<Integer> a, List<Integer> b) {

        if (a.size() != b.size() ){
            return false;
        }
        if(a.size() == 0){
            return true;
        }
        for (int i=0; i<a.size(); i++){
            if (a.get(i) != b.get(i)){
                return false;
            }
        }
        return true;
    }

    public boolean compareDoubleLists(List<Double> a, List<Double> b) {

        if (a.size() != b.size() ){
            return false;
        }
        if(a.size() == 0){
            return true;
        }
        for (int i=0; i<a.size(); i++){
            if (Double.compare(a.get(i),b.get(i)) != 0){
                return false;
            }
        }
        return true;
    }

    public boolean compareArrays(int[] a, int[] b) {
        System.out.println("array A: " + arrayToString(a));
        System.out.println("array B: " + arrayToString(b));
        if (a.length != b.length ){
            return false;
        }
        if(a.length == 0){
            return true;
        }
        for (int i=0; i<a.length; i++){
            if (a[i] != b[i]){
                return false;
            }
        }

        return true;
    }

    public String serializeLinkedList(ListNode ll) {
        String str="";
        while (ll!=null) {
            str += ll.getVal()+",";
            ll=ll.next;
        }
        return str;
    }

}
