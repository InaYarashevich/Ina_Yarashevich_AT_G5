package main.java.project.warehouse;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Stocktaking {

    private static final Path FILE = Paths.get("logs.txt");
    
    
    private Stocktaking(){};

    public static void registerBox(VesselBox box){};
    
    public static void disposeBox(VesselBox box){};

    public static void getInfo(){};

}
