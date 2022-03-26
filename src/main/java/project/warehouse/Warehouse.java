package main.java.project.warehouse;

import java.util.Map;

public class Warehouse {

    private Map<Integer, VesselBox> stock;

    public void addBox(VesselBox box){
        for (int i = 0; i < stock.size(); i++) {
            stock.put(i, stock.get(i));
        };
    };

    public void removeBox(){
        for (int i = 0; i < stock.size(); i++) {
            stock.remove(i, stock.get(i));
        };
    };

/*   public VesselBox getBox(){
        return stock.get();
    }*/
}
