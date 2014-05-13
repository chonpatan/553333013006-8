package Lab;

import java.util.Arrays;

public class PetrCech {
	
	private String name;
	private String position;
	private String friend[];
	
	public PetrCech (){
		
		name = "PetrCech";
		position = "Forward";
		friend = new String[]{"david Luiz,rooney,Rafael"};
	}
	public PetrCech(int a) {
		System.out.println("Petrcech Overloading 1");
	}
	public String getName(){			
		return name;		
	}
	public String getPosition(){			
		return position;		
	}
	public String[] getFriend(){			
		return friend;		
	}

	public static void main(String[] args) {
		PetrCech PetrCech = new PetrCech();
		System.out.println("name : "+PetrCech.getName());
		System.out.println("position : "+PetrCech.getPosition());
		System.out.println("friend : "+Arrays.toString(PetrCech.getFriend()));
		new PetrCech(1);
}
	
}