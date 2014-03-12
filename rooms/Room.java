package textrpg.rooms;

public class Room 
{
    private String roomName;
    private String roomDescription;
    Room nExit = null;
    Room sExit = null;
    Room eExit = null;
    Room wExit = null;
    
    public String getRoomName(){return roomName;}
    public void setRoomName(String n){roomName = n;}
     
    public String getRoomDescription(){return roomDescription;}
    public void setRoomDescription(String n){roomDescription = n;}
    
    
    public void getExits()//tells you the exits that are available from the current room NEED TO FIX FORMATTTTT
    {
        if(nExit == null && sExit == null && eExit == null && wExit == null)
        {
            System.out.println("There are no exits!");
        }
        else
        {
            if(oneExit() == true)
                System.out.print("There is one exit to the ");
            else
                System.out.print("There are exits to the ");
            if(nExit != null)
                System.out.print("north");
            if(sExit != null)
                System.out.print("south");
            if(eExit != null)
                System.out.print("east");
            if(wExit != null)
                System.out.print("west");
            System.out.println(".");
        }
    }
    
    public Room getNExit(){return nExit;}
    public Room getSExit(){return sExit;}
    public Room getEExit(){return eExit;}
    public Room getWExit(){return wExit;}
    
    public void setExits(Room n, Room s, Room e, Room w)
    {
        nExit = n;
        sExit = s;
        eExit = e;
        wExit = w;
    }
    
    public boolean oneExit()//returns true if there is only one exit
    {
        int j = 0;
        if(nExit != null)
            j++;
        if(sExit != null)
            j++;
        if(eExit != null)
            j++;
        if(wExit != null)
            j++;
        if(j == 1)
            return true;
        return false;
    }
    public void enterRoomText()
    {
        System.out.println("You entered " + getRoomName());
        System.out.println(getRoomDescription());
    }
}
