package assignment1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class StudentStorage {
    public void save(Collection<Student> students, File file) throws IOException {
        this.save(students, file.getName());
    }

    public void save(Collection<Student> students, String fileName) throws IOException {
        saveObject(students.toArray(), fileName);
    }

    public Collection<Student> load(File file) throws IOException {
        try {
            Object o = loadObject(file.getName());
            Object[] objects = (Object[])o;
            ArrayList<Student> list = new ArrayList(Arrays.asList(objects));
            return list;
        } catch (ClassNotFoundException e) {
            return null;
        }
    }


    //http://mrbool.com/differences-between-binary-serialization-and-serialization-in-java/31208
    // Serialize an object into binary format inside a file
// stored in the location of the second parameter
    private static void saveObject(Serializable object, String filename)
            throws IOException {
        ObjectOutputStream objstream = new ObjectOutputStream(
                new FileOutputStream(filename));

// The writeObject() method automatically transforms the contents of
        // the object to bytes.
        // An error is generated if the object does not implement the Serialize interface
        objstream.writeObject(object);

        objstream.close();
    }

    // Deserializes the object stored in the provied path and returns this
// object without any casting it to a specific type
    private static Object loadObject(String filename)
            throws ClassNotFoundException, IOException {
        // Open the file for reading
        ObjectInputStream objstream = new ObjectInputStream(
                new FileInputStream(filename));

        // Read the bytes and creates the object in memory
        Object object = objstream.readObject();

        // Close the file
        objstream.close();

        // Returns the object without casting
        return object;
    }

}
