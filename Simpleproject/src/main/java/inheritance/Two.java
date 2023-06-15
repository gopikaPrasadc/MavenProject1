package inheritance;

class Child extends One {
	public void print_for() { System.out.println("for"); }


	public static void main(String[] args)
	{
		Child g = new Child();
		g.print_geek();
		g.print_for();
		
	}
}
