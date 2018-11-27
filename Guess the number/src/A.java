import java.util.*;
public class A{
    public static void main(String[] args){
	    Yao yao= new Yao("姚", 0, 0);
	    yao.createMonkey("徐", 0, 0);
	    System.out.println(yao.getMonkeyname());
	    Scanner input = new Scanner(System.in);
	    String in;
	    System.out.println("Use wasd to move, use e to exit");
        do {
            System.out.println("The present coordinate is" + Arrays.toString(yao.getCoordinate()));
            in = input.nextLine();
            switch (in) {
                    case "w":
                        yao.move(0, 1);
                        break ;
                    case "a":
                        yao.move(-1, 0);
                        break ;
                    case "s":
                        yao.move(0, -1);
                        break ;
                    case "d":
                        yao.move(1, 0);
                        break;
                    case "e":
                        break;
                        /*
                        System.out.println("Game finished");
                        System.out.println("Try again?");
                            System.out.println("Type y for Yes, n for No");
                            if (input.nextLine().equals("y")) {
                                break l;
                            } else if (input.nextLine().equals("n")) {
                                break ;
                            } else {*/
            }

        }
        while (!in.equals("e"));
    }
}


class Person{
	private String name;
	private int[] coordinate;
	
	public Person(String name,int x,int y)
    {
		this.name=name;
		coordinate=new int[]{x,y};
	}
	public void move(int dx,int dy)
    {
		coordinate[0]+=dx;
		coordinate[1]+=dy;
    }
	public int[] getCoordinate(){
		return coordinate;
	}
	public String getName(){
        return name;
    }
}

class Yao extends Person{
    private Monkey monkey;
    public Yao(String name, int x, int y) {
        super(name, x, y);
    }
    public int getMonkeynumber(){
        return 0;
    }
    public void createMonkey(String name, int x, int y){
        monkey = new Monkey(name, x, y);
    }
    public String getMonkeyname(){
        return monkey.getName();
    }
}

class Monkey extends Person{
    public Monkey(String name, int x, int y){
        super(name,x,y);
    }

}



