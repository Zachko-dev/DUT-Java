package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        ArrayListControl<Integer> arrayListControl = new ArrayListControl<Integer>();
        System.out.print("-----Integer arrayList Demonstration-----\n");
        arrayListControl.Add(3);
        arrayListControl.Add(-1);
        arrayListControl.Add(0);
        arrayListControl.Add(4);
        arrayListControl.Add(8);
        arrayListControl.Show();
        System.out.print("\nRemove element with index 0");
        System.out.print("\n");
        try {
            arrayListControl.Remove(0);
        }
        catch (Exception E){System.out.print(E);}
        System.out.print("\n");
        arrayListControl.Show();
        System.out.print("\n\n");


        ArrayListControl<Game> arrayListControl2 = new ArrayListControl();
        System.out.print("-----Object arrayList Demonstration-----\n");

        Game game = new Game("Call of Duty Black Ops 3",60, true);
        arrayListControl2.Add(game);
        arrayListControl2.Add(new Game("Call of Duty WW2",10, true));
        arrayListControl2.Add(new Game("Call of Duty Modern Warfare 3",10, false));
        arrayListControl2.Add(new Game("Call of Duty Cold War",5, true));
        arrayListControl2.Show();
        System.out.print("\n");
        System.out.print("Checking if contains object (Call of Duty Black Ops 3)\n");
        System.out.print(arrayListControl2.Contains(game));
        System.out.print("\nRemove object (Call of Duty Black Ops 3)\n");
        try {
            arrayListControl2.Remove(game);
        }
        catch (Exception E){System.out.print(E);}
        System.out.print("\n");
        arrayListControl2.Show();
        System.out.print("\n");
        System.out.print("Checking if contains object (Call of Duty Black Ops 3)\n");
        System.out.print(arrayListControl2.Contains(game));
        System.out.print("\n\n");

        System.out.print("-----Object linkedList Demonstration-----\n");
        LinkedListControl<Game> linkedList = new LinkedListControl();
        linkedList.Add(game);
        linkedList.Add(new Game("Call of Duty WW2",10, true));
        linkedList.Show();
        System.out.print("\n");
        System.out.print("Showing size of list\n");
        System.out.print(linkedList.Size());
        System.out.print("\n");

        System.out.print("Remove first element of list");
        linkedList.Remove();
        System.out.print("\nShow our list\n");
        linkedList.Show();
        System.out.print("\n");
        Game game2 = new Game("Call of Duty Modern Warfare 3",10, false);
        Game game3 = new Game("Call of Duty Cold War",5, true);
        System.out.print("\nAdding one object (Call of Duty Modern Warfare 3)\n");
        linkedList.Add(game2);
        System.out.print("\nShow our list\n");
        linkedList.Show();
        System.out.print("\n");
        System.out.print("Showing size of list\n");
        System.out.print(linkedList.Size());
        System.out.print("\n");
        System.out.print("Checking if contains object (Call of Duty Cold War)\n");
        System.out.print(linkedList.Contains(game3));
        System.out.print("\n\n");

        System.out.print("-----Serialization and Deserialization-----\n");
        SerializationUtil serializationUtil = new SerializationUtil();
        serializationUtil.Serialize(new Game("Max", 12121, true));
        try {
            System.out.print(serializationUtil.Deserialize().toString());
        }
        catch (Exception e){
            System.out.print("You suck");
        }
    }

}
