import java.util.*;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter targeted node in tree: ");
        Scanner sc = new Scanner(System.in);
        int target=sc.nextInt();
        Tree root = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(3);
        root.left.left = new Tree(4);
        root.left.right = new Tree(5);
        root.right.left = new Tree(6);
        root.right.right = new Tree(7);

       if(Target(root,target)){
           System.out.println("\nTarget " + target + " found in the tree.");
       } else {
           System.out.println("\nTarget " + target + " not found in the tree.");
       }

    }
    public static boolean Target(Tree Node,int target){
        if(Node==null) return false;
        System.out.println(Node.value+" is visited");
        if(Node.value==target) return true;

        return Target(Node.left,target) || Target(Node.right,target);
    }
}
    class Tree {
        Tree left, right;
        int value;

        Tree(int val) {
            value = val;
            left = right = null;
        }
    }

    //compelxity is O(V+E) and since E=V-1 as it binary tree so simply complexity is O(V)


