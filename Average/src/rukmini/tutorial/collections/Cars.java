package rukmini.tutorial.collections;

public class Cars {
private String name;

public Cars(String name){
	this.name = name;
	
}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return name;
}

}
