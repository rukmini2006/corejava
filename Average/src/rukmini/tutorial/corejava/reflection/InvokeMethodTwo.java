package rukmini.tutorial.corejava.reflection;

import java.lang.reflect.Method;

public class InvokeMethodTwo {

	public static void main(String... args) throws Exception {
		// TODO Auto-generated method stub
		Class classObj = ReflectionOne.class;
		Method[] methods=classObj.getMethods();
		for(Method method:methods){
			if(method.getName().equals("callMe")){
				ReflectionOne ref = (ReflectionOne) classObj.newInstance();
				ref.callMe("rukmini");
				
				Method meth = classObj.getMethod("callMe",null);
				meth.invoke(ref, null);
				break;
			}
			
		}

	}

}
