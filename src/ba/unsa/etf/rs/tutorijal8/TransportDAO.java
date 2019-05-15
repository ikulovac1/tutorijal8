package ba.unsa.etf.rs.tutorijal8;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

public class TransportDAO {
    private static TransportDAO instance=null;

    public static TransportDAO getInstance() {
        if(instance==null) initalize();
        return instance;
    }

    public void deleteDriver(Driver driver) {
    }

    public void deleteBus(Bus bus) {
    }

    public void addDriver(Driver driver) {
    }

    public ArrayList<Driver> getDrivers() {
        return null;
    }

    public ArrayList<Bus> getBusses() {
        return null;
    }

    public void resetDatabase() {

    }

    public void addBus(Bus bus) {
    }



    private static void initalize(){
        instance=new TransportDAO();
    }
}