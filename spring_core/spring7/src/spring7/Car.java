package spring7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	   private String make;
	    private int model;
	    @Autowired
	     private Engine engine;
	    private int horsePower;
		public String getMake() {
			return make;
		}
		public void setMake(String make) {
			this.make = make;
		}
		public int getModel() {
			return model;
		}
		public void setModel(int model) {
			this.model = model;
		}
		public Engine getEngine() {
			return engine;
		}
		public void setEngine(Engine engine) {
			this.engine = engine;
		}
		public int getHorsePower() {
			return horsePower;
		}
		public void setHorsePower(int horsePower) {
			this.horsePower = horsePower;
		}
	    
}