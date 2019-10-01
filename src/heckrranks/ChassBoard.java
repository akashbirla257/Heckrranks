/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heckrranks;
  import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.*;
import java.awt.Point;

/**
 *
 * @author HP
 */
public class ChassBoard {
  
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter N=");
        int n = in.nextInt();
        System.out.println("Enter The number of obstacles :");
        int k = in.nextInt();
        System.out.println("Enter the Queen point positions");
        Point queen = new Point(in.nextInt(), in.nextInt());

        HashSet<Point> obstacles = new HashSet<Point>();
        System.out.println("Enter Attacking point on Queen");
        for(int i = 0; i < k; i++){
            obstacles.add(new Point(in.nextInt(), in.nextInt()));
        }

        Stack<Direction> directions = getAllDirections();
        int possiblePoints = 0;

        while(!directions.empty()){
            Direction d = directions.pop();
            Point cur = new Point(queen);
            cur.translate(d.x, d.y);

            while(isInside(cur, n) && !obstacles.contains(cur)){
                possiblePoints++;
                cur.translate(d.x, d.y);
            }
        }

        System.out.println(possiblePoints);
    }

    private static boolean isInside(Point p, int n){
        return p.x > 0 && p.y > 0 && p.x <= n && p.y <= n;
    }

    private static Stack<Direction> getAllDirections(){
        Stack<Direction> directions = new Stack<Direction>();
        directions.push(new Direction(0, 1));
        directions.push(new Direction(1, 1));
        directions.push(new Direction(1, 0));
        directions.push(new Direction(1, -1));
        directions.push(new Direction(0, -1));
        directions.push(new Direction(-1, -1));
        directions.push(new Direction(-1, 0));
        directions.push(new Direction(-1, 1));
        return directions;
    }

    private static class Direction {
        int x, y;
        public Direction(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}

