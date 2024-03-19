package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
/*
Create a final capacity variable with value 200. Use this capacity to create a HashMap with String
as the key type and Attendee object as the value type. Use 0.6 as the load factor. This HashMap
will be called seatDetails. Also create a setter and getter for this HashMap. The setter will take the
seat number and Attendee object as the parameter and then add this to the seatDetails
HashMap. The getter will take seat number as the parameter and display the corresponding
Attendee object details
In the organizeEvent() method, when you ask the user for attendee details, now you also must ask
for the seat number. This way, whenever an attendee details is displayed, removed, or modified,
the seat number must also be displayed, removed or modified accordingly.
§ When the user chooses to handle complementary passes, a method called
handleComplementaryPasses () must be called. This method will be in a separate class called
HandleComplementaryPasses().
§ When the user chooses to handle performances, a method called handlePerformances() must be
called. This method will be in a separate class called HandlePerformances().
§ When the user chooses to get seat details, the program must first ask the user the seat number
for which the details must be displayed. Using that seat number, the getter for the seatDetails
HashMap is called, and then the Attendee object is displayed
 */

public class Event {
    Performance performances = new Performance();

    static ArrayList<Attendees> eventAttendees = new ArrayList<Attendees>();

    Scanner scanner = new Scanner(System.in);
    private String eventID;
    private String eventName;
    private String eventVenue;
    private String eventDate;



    private final int capacity = 200;

    HashMap<String, Attendees> seatDetails = new HashMap<>(capacity, 0.6f);

    public HashMap<String, Attendees> getSeatDetails(String seatNo) {
        for (String seat : seatDetails.keySet()) {
            System.out.println(seat + " : " + seatDetails.get(seat));
        }
        return seatDetails;
    }

    public void setSeatDetails(String seatNo, Attendees attendee) {
        seatDetails.put(seatNo, attendee);
    }

    public Event() {
    }

    public Event(String eventID, String eventName, String eventVenue, String eventDate) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventVenue = eventVenue;
        this.eventDate = eventDate;
    }

    /**
     * 获取
     *
     * @return eventID
     */
    public String getEventID() {

        return eventID;
    }

    /**
     * 设置
     *
     * @param eventID
     */
    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    /**
     * 获取
     *
     * @return eventName
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * 设置
     *
     * @param eventName
     */
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    /**
     * 获取
     *
     * @return eventVenue
     */
    public String getEventVenue() {
        return eventVenue;
    }

    /**
     * 设置
     *
     * @param eventVenue
     */
    public void setEventVenue(String eventVenue) {
        this.eventVenue = eventVenue;
    }

    /**
     * 获取
     *
     * @return eventDate
     */
    public String getEventDate() {
        return eventDate;
    }

    /**
     * 设置
     *
     * @param eventDate
     */
    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }


    @Override
    public String toString() {
        return "Event{" +
                "scanner=" + scanner +
                ", eventID='" + eventID + '\'' +
                ", eventName='" + eventName + '\'' +
                ", eventVenue='" + eventVenue + '\'' +
                ", eventDate='" + eventDate + '\'' +
                '}';
    }

    public void organizeEvent() {

        loop1 : while (true) {
            System.out.println("-----------------------------------------------");
            System.out.println("Please select an option : ");
            System.out.println("1. Add an attendee");
            System.out.println("2. Remove an attendee");
            System.out.println("3. Update an attendee");
            System.out.println("4. Find an attendee");
            System.out.println("5. Display the name of the event");
            System.out.println("6. Exit");
            System.out.println("Please enter your choice : ");
            System.out.println("-----------------------------------------------");
            String choice = scanner.next();
            loop2 : switch (choice){
                case "1":
                    System.out.println("Please enter the name of the attendee : ");
                    String addAttendee = scanner.next();
                    System.out.println("Please enter the email of the attendee : ");
                    String addEmail = scanner.next();
                    System.out.println("Please enter the age of the attendee : ");
                    int addAge = scanner.nextInt();
                    System.out.println("Please enter the gender of the attendee : ");
                    String addGender = scanner.next();
                    System.out.println("Please enter the seat number of the attendee : ");
                    String addSeatNo = scanner.next();
                    setSeatDetails(addSeatNo, new Attendees(addAttendee, addEmail, addGender, addAge, addSeatNo));
                    Attendees attendees = new Attendees(addAttendee, addEmail, addGender, addAge, addSeatNo);
                    eventAttendees.add(attendees);
                    System.out.println("Total number of people attending the event : " + eventAttendees.size());
                    System.out.println("-----------------------------------------------");
                    break loop2;
                case "2":
                    System.out.println("Please enter the name of the attendee you want to remove : ");
                    String removeAttendee = scanner.next();
                    for (int i = 0; i < eventAttendees.size(); i++) {
                        if (eventAttendees.get(i).getAttendeeName().equals(removeAttendee)) {
                            eventAttendees.remove(i);
                        }
                    }
                    System.out.println("Total number of people attending the event : " + eventAttendees.size());
                    System.out.println("-----------------------------------------------");
                    break loop2;
                case "3":
                    System.out.println("Please enter the name of the attendee : ");
                    String updateAttendee = scanner.next();
                    System.out.println("Please enter the updated name of the attendee : ");
                    String updatedAttendee = scanner.next();
                    for (Attendees attendee : eventAttendees) {
                        if (attendee.getAttendeeName().equals(updateAttendee)) {
                            attendee.setAttendeeName(updatedAttendee);
                        }
                    }
                    System.out.println("Total number of people attending the event : " + eventAttendees.size());
                    System.out.println("-----------------------------------------------");
                    break loop2;
                case "4":
                    System.out.println("Please enter the name of the attendee : ");
                    String findAttendee = scanner.next();
                    for (Attendees attendee : eventAttendees) {
                        if (attendee.getAttendeeName().equals(findAttendee)) {
                            System.out.println("Attendee found");
                            System.out.println("Name : " + attendee.getAttendeeName());
                            System.out.println("Email : " + attendee.getAttendeeEmail());
                            System.out.println("Age : " + attendee.getAttendeeAge());
                            System.out.println("gender : " + attendee.getAttendeeGender());
                            System.out.println("-----------------------------------------------");
                        }
                    }
                    System.out.println();
                    break loop2;
                case "5":
                    if (eventAttendees.isEmpty()) {
                        System.out.println("No attendees found");
                    } else {
                        System.out.println("Displaying all the name of the event");
                        for (Attendees eventAttendee : eventAttendees) {
                            System.out.println(eventAttendee.getAttendeeName());
                        }
                    }
                    System.out.println("-----------------------------------------------");
                    break loop2;
                case "6":
                    System.out.println("Exiting");
                    break loop1;
                default:
                    System.err.println("Invalid choice");
            }
        }
    }
}