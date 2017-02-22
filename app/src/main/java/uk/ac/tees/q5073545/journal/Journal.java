package uk.ac.tees.q5073545.journal;

/**
 * Created by Maggie on 20/02/2017.
 */

public class Journal {
    private int ID;
    private String note;
    private String type;
    private long dateTime;
    private long locationLong;
    private long locationLat;

    //constructor with ID parameter
    public Journal(int ID, String note, String category, long dateTime, long locationLong, long locationLat) {
        this.ID = ID;
        this.note = note;
        this.type = category;
        this.dateTime = dateTime;
        this.locationLong = locationLong;
        this.locationLat = locationLat;
    }

    //constructor without ID parameter
    public Journal(String note, String category, long dateTime, long locationLong, long locationLat) {
        this.note = note;
        this.type = category;
        this.dateTime = dateTime;
        this.locationLong = locationLong;
        this.locationLat = locationLat;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getDateTime() {
        return dateTime;
    }

    public void setDateTime(long dateTime) {
        this.dateTime = dateTime;
    }

    public long getLocationLong() {
        return locationLong;
    }

    public void setLocationLong(long locationLong) {
        this.locationLong = locationLong;
    }

    public long getLocationLat() {
        return locationLat;
    }

    public void setLocationLat(long locationLat) {
        this.locationLat = locationLat;
    }
}
