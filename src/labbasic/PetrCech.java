package labbasic;

public class PetrCech {
	
	private String name;
	private String position;
	private String friend[];
	
	public PetrCech (){
		
		name = "petrCech";
		position = "Forward";
		friend = new String[]{"david Luiz,rooney"};
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


	
}
