public class Home {

    public static void main(String[] args) {

        /*
         * create an object of class Room
         */ 
         Room R = new Room();
        /*
         * set the instance variable room number's value to 101
         */ 
        R.setRoomNumber(101);
        /*
         * print the instance variable room number
         */ 
        System.out.println(R.getRoomNumber());
        /*
         * add light to the room with 
         * an id= 100, and type= "Philips"
         * by invoking method addLight (id, type);
         */ 
        R.addLight(100, "Philips");
        /*
         * turn light with id equals to 100 on
         * by invoking method turnLightOn (id);
         */ 
        R.turnLightON(100);
        /*
         * add light to the room with 
         * an id= 200, and type= "Philips"
         * by invoking method addLight (id, type);
         */ 
        R.addLight(200, "Philips");

        /*
         * Check if the light with id 100 is on or off in the room
         * Hint: call method lightStatus (id) of class Room
         */ 
       if( R.lightStatus(100))
       {
        System.out.println("Light is on");
       }
        /*
         * switch light with id 100 OFF
         * Hint: call method turnLightOFF (id) of class Room
         */
     R.turnLightOFF(100);
        /*
         * switch light with id 100 ON
         * Hint: call method turnLightON (id) of class Room
         */
        R.turnLightON(100);

        /*
         * Check if the door is locked or not in a given room
         * Hint: call method doorStatus () of class Room
         */ 
        if( R.doorStatus())
       {
        System.out.println("Door is Locked");
       }else{
        
            System.out.println("Door is Opened");
           
       }
        /*
         * Unlock the door that is in a given room
         * Hint: call method unlockDoor() of class Room
         */ 
        R.unlockDoor();
        /*
         * Display all lights and door status in a given room
         * Hint: call method printRoomstatus() of class Room
         */ 
       R.printRoomStatus();
    
    }

}