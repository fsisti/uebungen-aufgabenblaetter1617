package musterLösungen.uebung6;

import gridworld.framework.actor.ActorWorld;

public class MyGridWorld2 {
	
	public static void main(String[] args) {
		
		ActorWorld world = new ActorWorld();
		world.add(new Breeder());
		world.add(new DisposableBug());
		world.add(new DisposableBug());
		
		world.show();
		
	}

}
