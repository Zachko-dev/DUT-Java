package com.company;

import java.io.*;

public class SerializationUtil implements Serializable {
    public void Serialize(Game object)
    {
        // Saving of object in a file
        FileOutputStream file = null;
        try {
            file = new FileOutputStream("Game.jsf");

            ObjectOutputStream out = new ObjectOutputStream(file);

            // Method for serialization of object
            out.writeObject(object);

            out.close();
            file.close();

            System.out.println("Object has been serialized\n");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public Game Deserialize() throws Exception
    {
        Game game;

        FileInputStream file = new FileInputStream
                ("Game.jsf");
        ObjectInputStream in = new ObjectInputStream
                (file);
        // Reading the object from a file
        try {
            // Method for deserialization of object
            game = (Game) in.readObject();


            System.out.println("Object has been deserialized\n"
                    + "Data after Deserialization.");

        }
        catch (Exception e){
            e.printStackTrace();
            throw new Exception("Deserialization failed");
        }
        finally {
            in.close();
            file.close();
        }

        return game;

    }
}
