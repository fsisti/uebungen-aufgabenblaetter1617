package traSim;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;

public class TransportSimulator {
	
	private List<Moveable> passangerFleet = new ArrayList<>();
		
	public static void main (String[] args){
		TransportSimulator simulator = new TransportSimulator();
		simulator.passangerFleet.add(new Elevator("Fahrstuhl 1",5));
		simulator.passangerFleet.add(new Ship ("Titantic",6,10));
		simulator.passangerFleet.add(new Helicopter("DAPCOPTER",200,150,30));
		
		simulator.simulate(10);
	}
		void increaseSpeedByRandom (Moveable mov){
			if(mov instanceof CanMoveHorizontally){
			((CanMoveHorizontally) mov).increaseHorizontalSpeed(Math.random()*100);	
			}
			if(mov instanceof CanMoveVertically){
				((CanMoveVertically) mov).increaseVerticalSpeed(Math.random()* 10-5);
			}
		}
		
		void simulate(int steps){
			
			for(int i=0;i< steps;i++){
				for(Moveable mov: passangerFleet){
					increaseSpeedByRandom(mov);
					if(mov instanceof CanMoveHorizontally && Math.random()< 0.25){
						((CanMoveHorizontally) mov).turnBy(Math.PI/2);
						
					}
					
					mov.move();
					System.out.println(mov);
				}
			}
		}
		
		//passangerFleet.add(new Elevator());
		//passangerFleet.add(new Helicopter());
		//passangerFleet.add(new Ship());
	
	}
