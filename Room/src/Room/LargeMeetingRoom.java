package Room


import java.util.List;

/**
 * Created by ryutakahashi on 2017/06/11.
 */

public class LargeMeetingRoom implements Room {

    private List<Room> rooms;

    public int getNumOutlits() {

    }


    public int sqFootage() {

    }

    @Override
    public int getNumOutlets() {
        return 0;
    }

    @Override
    public boolean electricityOk() {
        return false;
    }


}
