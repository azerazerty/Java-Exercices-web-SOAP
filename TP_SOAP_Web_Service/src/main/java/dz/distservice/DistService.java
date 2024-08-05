package dz.distservice;

import jakarta.jws.WebService;


@WebService
public class DistService {

	public float CalcDistance(Point point1, Point point2 ) {
		System.out.println("Je viens de calculer la distance enter deux points ");
		float r = (float) Math.sqrt(Math.pow((point1.getX()-point2.getX()), 2)+Math.pow((point1.getY()-point2.getY()), 2) );
		return r;
	}
	
	
}
