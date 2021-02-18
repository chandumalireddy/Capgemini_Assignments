package spring10;

import org.springframework.beans.factory.annotation.Required;

public class circle implements shape {
	
	private point center;
	
public point getCenter() {
		return center;
	}

	public void setCenter(point center) {
		this.center = center;
	}

public void draw()
{
	System.out.println(center.getX()+" "+center.getY());
}
}
