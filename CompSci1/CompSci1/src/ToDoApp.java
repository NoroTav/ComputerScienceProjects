//To Do app project

import java.util.ArrayList;
import java.util.Scanner;

class ToDoApp{



    static ArrayList<String> doList = new ArrayList<>();
    public static void main(String[] args)
    {
        //Take user input and save it
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello, would you like to create a task?(y/n)");
        String createList = scan.nextLine();

        if (createList.toLowerCase().equals("y"))
        {
            while (true) {
                System.out.println("What do you want to add?");
                String todo = scan.nextLine();
                doList.add(todo);

                System.out.println("Add more?(y/n)");
                String nextTask = scan.nextLine();

                if (nextTask.toLowerCase().equals("n")) {
                    System.out.println("Do you want to look at what you have then?(y/n)");
                    String inList = scan.nextLine();
                    if (inList.toLowerCase().equals("y")) {
                        new GUI_ToDoList(doList);
                        System.out.println(doList);
                        break;
                    } else {
                        System.out.println("Then why open the program...");
                    }
                }
            }
        }else if(createList.toLowerCase().equals("n"))
        {
            System.out.println("Why'd you run the program..."
            + "Removing Operating System");
        }
    }
}
