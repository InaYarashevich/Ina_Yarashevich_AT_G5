package main.java.project.warehouse;

import java.util.Map;

public class Warehouse {

    private Map<Integer, VesselBox> stock;

    public void addBox(VesselBox box) {
        stock.put(stock.size(), box);
        Stocktaking.registerBox(box);
    }

    public void removeBox() {
        for (int i = 0; i < stock.size(); i++) {
            stock.remove(i, stock.get(i));
            Stocktaking.disposeBox(stock.get(i));
        }
    }

//    public VesselBox getBox() {
//        return stock.get(VesselBox);
//    }
}
