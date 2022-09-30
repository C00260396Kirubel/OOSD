public class HotelRoom {
    
private double roomNumber;
private String roomType;
private int check;
double rate;


public HotelRoom() //empty constructor
{

   


}

public HotelRoom(double roomNumber, String roomType, int check, double rate)
{

    this.roomNumber = roomNumber;
    this.roomType = roomType;
    this.check = check;
    this.rate = rate;
}

public HotelRoom(double roomNumber, String roomType) //overloaded constructor
{

   this.roomNumber = roomNumber;
   this.roomType = roomType;


}


public void setRoomNumber(double roomNumber)
{

    this.roomNumber = roomNumber;

}

public double getRoomNumber()
{

    return roomNumber;

}

public void setRoomType(String roomType)
{

    this.roomType = roomType;
   

}

public String getRoomType()
{

    return roomType;

}

public void setCheck(int check)
{

    this.check = check;

}

public int getCheck()
{

    return check;

}

public void setRate(double rate)
{

    this.rate = rate;

}

public double getRate()
{
    return rate;

}

public void isOccupied()
{

    if(check == 1)
    {

        boolean check =true;
        System.out.println("Occupied");

    }

    else if(check == 0)
    {

        boolean check = false;

    }

}


public setOccupied()
{

if(check=false)
{
    check=1;

}

return 1;

}

}

































