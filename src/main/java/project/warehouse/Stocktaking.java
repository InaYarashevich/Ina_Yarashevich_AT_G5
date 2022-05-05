package project.warehouse;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Stocktaking {

    private static final Path FILE = Paths.get("C:\\Users\\IT0054\\folder1\\logs.txt");
    static BufferedWriter out = null;
    static BufferedReader in = null;

    private Stocktaking() {
    }

    public static void registerBox(VesselBox box) {

        try {
            out = new BufferedWriter(new FileWriter(String.valueOf(FILE)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if (out != null) {
                out.write("#" + box.hashCode() + "#" + box.getName());
                out.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if (out != null) {
                out.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void disposeBox(VesselBox box) {

        List<String> vesselBoxesList = new ArrayList<>();
        String line = null;
        while (true) {
            try {
                if ((line = in.readLine()) == null) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            vesselBoxesList.add(line);
        }
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

       // vesselBoxesList.remove();
    }

    public static void getInfo() {

        try {
            in = new BufferedReader(new FileReader(String.valueOf(FILE)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line = null;
        while (true) {
            try {
                if (in != null && (line = in.readLine()) == null) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(line);
        }
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
