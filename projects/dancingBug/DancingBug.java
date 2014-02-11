import info.gridworld.actor.Bug; 
public class DancingBug extends Bug 
{ 
    private int[] turn; 
    private int step; 
 
    public DancingBug(int[] turntwo) { 
	turn = turntwo; 
	step = 0; 
    } 
 
    public void turn(int num) { 
	for(int i = 1; i <= num; i++) { 
	    turn(); 
	} 
    } 
 
    public void act() { 
	if(step == turn.length) {
	    step = 0; 
	}
	turn (turn[step]); 
	step++; 
	super.act(); 
    } 
} 


