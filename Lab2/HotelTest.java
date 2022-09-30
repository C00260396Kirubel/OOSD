public class HotelTest
{ // begin class HotelTest
	public static void main(String args[]) 
	{ // being main method


        HotelRoom roomA = new HotelRoom();
        HotelRoom roomB = new HotelRoom();
        HotelRoom roomC = new HotelRoom(202, " Single ", 0, 90);

        roomA.setRoomNumber(200);
        roomA.setRoomType("Single");
        roomA.setCheck(1);
        roomA.setRate(100);
        roomB.setRoomNumber(201);
        roomB.setRoomType("Double");
        roomB.setCheck(0);
        roomB.setRate(80);
        
        
                System.out.println(" RoomNumber: " +roomA.getRoomNumber()+ " RoomType: " +roomA.getRoomType());
                System.out.println(" Status: " +roomA.getCheck()+ "  Rate: "+roomA.getRate());
                System.out.println(" ");
                System.out.println(" RoomNumber: " +roomB.getRoomNumber()+ " RoomType: " +roomB.getRoomType());
                System.out.println(" Status: " +roomB.getCheck()+ "  Rate: "+roomB.getRate());
                System.out.println(" ");
                System.out.println(" RoomNumber: " +roomC.getRoomNumber()+ "RoomType: " + roomC.getRoomType());
                System.out.println(" Status: " +roomC.getCheck()+ "  Rate: "+roomC.getRate());


		
	} // end main
} // end class ThermTest