/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 1337
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Selection or Insertion Sort?");
        if(scan.nextLine().equals("Selection"))
        {
            //Input Section
            System.out.println("Input Integers Type \"-1\" to Stop");
            Integer input = scan.nextInt();
            while(input != -1)
            {
                list.add(input);
                input = scan.nextInt();
            }
            //Selection Sort
            for(int i = 0; i < list.size() - 1; i++)
            {
                Integer minVal = list.get(i);
                int count = i;
                for(int g = i + 1; g < list.size(); g++)
                {
                    if(minVal > list.get(g))
                    {
                        minVal = list.get(g);
                        count = g;
                    }
                }
                Integer temp = list.get(i);
                list.set(i, minVal);
                list.set(count, temp);
            }
            System.out.print(list);
        }
        else
        {
            //Input Section
            System.out.println("Input Integers Type \"-1\" to Stop");
            Integer input = scan.nextInt();
            while(input != -1)
            {
                list.add(input);
                input = scan.nextInt();
            }
            //Insertion Sort
            for(int i = 1; i < list.size(); i++)
            {
                Integer minVal = list.get(i);
                while(i - 1 >= 0 && minVal < list.get(i - 1))
                {
                    Integer temp = list.get(i - 1);
                    list.set(i - 1, minVal);
                    list.set(i, temp);
                    minVal = list.get(i - 1);
                    i--;
                }
            }
            System.out.println(list);
        }
    }
    
}
