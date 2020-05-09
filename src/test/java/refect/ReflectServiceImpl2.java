package refect;

/**
 * 
 * 如果一个类的所有构建方法里都至少存在一个参数
 * 
 * @author XX
 *
 */
public class ReflectServiceImpl2 {

	private String name;
	
	
	public ReflectServiceImpl2(String name){
		this.name = name;
	}
	
	public void sayHello(){
		System.out.println("Hello" + name);
	}
	
	public static ReflectServiceImpl2 getInstance(){
		ReflectServiceImpl2 object = null;
		
		try {
			object = (ReflectServiceImpl2) Class.forName("refect.ReflectServiceImpl").getConstructor(String.class).newInstance("-World");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return object;
	}
	
	public static void main(String[] args) {
		getInstance().sayHello();
	}
	
	/*
	 * 
	 * object = (ReflectServiceImpl2) Class.forName("refect.ReflectServiceImpl").getConstructor(String.class).newInstance("World");
	 * 
	 * 先通过forName加载到类的加载器。然后通过getConstructor方法，它的参数恶意是多个，这里定义为String.class，意为有且只有
	 * 一个参数类型为String的构建方法.通过这个方法可以对重名方法进行排除，此时再用newInstance方法生成对象，只是newInstance方法也多了
	 * 一个参数"-World"而已.实际就等于object = new ReflectServiceImpl2("-World"),只是这里用反射机制来生成这个对象而已。
	 * 
	 * 
	 * 反射的优点是只要配置就可以生成对象，可以解除程序的耦合度，比较灵活。
	 * 反射的缺点是运行比较慢
	 * 但是大部分情况下为了灵活度，降低程序的耦合度，我们还是会使用反射的，比如Spring IoC 容器
	 * 
	 * 
	 */
}
