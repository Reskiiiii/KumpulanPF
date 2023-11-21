import static java.lang.System.out;

public class ShowGuests2 {

	public static void main(String args[]){
		int guests[]= {1, 4, 2, 0, 2, 1, 4, 3, 0, 2,};
		
		out.println("Room\tGuests");
		
		for(int RoomNum = 0; RoomNum < 10; RoomNum++) {
			out.print(RoomNum);
			out.print("\t");
			out.println(guests[RoomNum]);
		}
	}
}