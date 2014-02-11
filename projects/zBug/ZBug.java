import info.gridworld.actor.Bug;

public class ZBug extends Bug{

    private int steps;
    private int sideLength;
    private boolean horizontal;
    private boolean homestretch;

    public ZBug(int length)
    {
        steps = 0;
        sideLength = length;
	horizontal = true;
	homestretch = false;
        setDirection(90);
    }

    public void act()
    {
	if (canMove()){
	    if (horizontal){
		if (steps < sideLength){
		    move();
		    steps++;
		}
		else{
		    setDirection(235);
		    horizontal = false;
		    steps = 0;
		}
 	    }
	    if (homestretch){
		if (steps < sideLength){
		    move();
		    steps++;
		}
	    }
	    else{
		if (steps < sideLength){
		    move();
		    steps++;
		}
		else{
		    setDirection(90);
		    steps = 0;
		    homestretch = true;
		}
	    }
	}
    }

}
