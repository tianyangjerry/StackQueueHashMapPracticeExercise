package org.example;

public class Attendees {
    /*
    Add seatNo – stores the seat number for the
    attendee as a String. It will be in the format of A#,
    B   #, C#, where ‘#’ will be a number. For example, A1, B23, C31
    §   Update the constructor, the getter and setter, and the toString()
    methods of this class accordingly.
     */
    private String attendeeName;
    private String attendeeEmail;
    private String attendeeGender;
    private int attendeeAge;
    private String seatNo;

    public Attendees() {
    }

    public Attendees(String attendeeName, String attendeeEmail, String attendeeGender,
                     int attendeeAge, String seatNo) {
        this.attendeeName = attendeeName;
        this.attendeeEmail = attendeeEmail;
        this.attendeeGender = attendeeGender;
        this.attendeeAge = attendeeAge;
        this.seatNo = seatNo;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    /**
     * 获取
     * @return attendeeName
     */
    public String getAttendeeName() {
        return attendeeName;
    }

    /**
     * 设置
     * @param attendeeName
     */
    public void setAttendeeName(String attendeeName) {
        this.attendeeName = attendeeName;
    }

    /**
     * 获取
     * @return attendeeEmail
     */
    public String getAttendeeEmail() {
        return attendeeEmail;
    }

    /**
     * 设置
     * @param attendeeEmail
     */
    public void setAttendeeEmail(String attendeeEmail) {
        this.attendeeEmail = attendeeEmail;
    }

    /**
     * 获取
     * @return attendeeGender
     */
    public String getAttendeeGender() {
        return attendeeGender;
    }

    /**
     * 设置
     * @param attendeeGender
     */
    public void setAttendeeGender(String attendeeGender) {
        this.attendeeGender = attendeeGender;
    }

    /**
     * 获取
     * @return attendeeAge
     */
    public int getAttendeeAge() {
        return attendeeAge;
    }

    /**
     * 设置
     * @param attendeeAge
     */
    public void setAttendeeAge(int attendeeAge) {
        this.attendeeAge = attendeeAge;
    }

    public String toString() {
        return "Name: " + attendeeName + "\nEmail: " + attendeeEmail + "\nGender: " +
                attendeeGender + "\nAge: " + attendeeAge +
                "\nSeat No: " + seatNo + "\n";
    }
}
