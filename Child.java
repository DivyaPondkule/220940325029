class GrandParent
{
	String grandFatherName;
	String grandMotherName;
	
	GrandParent(String grandFatherName,String grandMotherName)
	{
		System.out.println("Grandfather name: "+grandFatherName);
		System.out.println("Grandmother name: "+grandMotherName);
	}
}
class Parent extends GrandParent
{
	String fatherName;
	String motherName;
	
	Parent(String fatherName,String motherName, String grandFatherName, String grandMotherName)
	{
		super(grandFatherName,grandMotherName);
		System.out.println("Father name: "+fatherName);
		System.out.println("Mother name: "+motherName);
	}
	
	Parent(String grandFatherName,String grandMotherName)
	{
		super(grandFatherName,grandMotherName);
	}
}
class Child extends Parent {
	Child(String fatherName,String motherName, String grandFatherName, String grandMotherName)
	{
		super(fatherName,motherName,grandFatherName,grandMotherName);
	}
	public static void main(String[] args) {
		
		Child c = new Child("Jaywant","Hema","Popatrao","Pushpalata");
	}

}
