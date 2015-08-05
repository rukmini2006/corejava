package rukmini.tutorial.collections;

import java.util.ArrayList;
import java.util.List;

public class Jewwlery {
	

String name;
String type;

/*public Jewwlery(){
	
}*/
public Jewwlery(String name,String type){
	this.name =name;
	this.type = type;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}


@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+ " "+type;
	}
}
