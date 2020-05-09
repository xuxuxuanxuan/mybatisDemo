package refect;

import java.lang.reflect.Method;

public class ReflectServiceImpl {

    public void sayHello(String name){
        System.out.println("Hello" +name);
    }

    /***
     * 1.通过反射构建对象
     *
     */
    public static ReflectServiceImpl getInstance(){

        ReflectServiceImpl object = null;

        try {
            object = (ReflectServiceImpl) Class.forName("refect.ReflectServiceImpl").newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return object;
    }

    public static void main(String[] args) {
        getInstance().sayHello(" World");
        reflectMethod();
        reflect();
    }

    /*
     * 这里的代码就是生成一个对象，然后将其返回，下面这行代码的目的就是给类加载器注册了一个类ReflectServiceImpl
     * 的全限定名，然后通过newInstance方法初始化了一个类对象
     *
     * object = (ReflectServiceImpl) Class.forName("refect.ReflectServiceImpl").newInstance();
     *
     */


    /***
     * 反射方法
     * 当有具体的对象target，而不知道具体是哪个类时，也可以使用targe.getClass.getMethod("sayHello",String.class)
     * 来替代它，其中第一个参数是方法名称，第二个参数是参数类型，是一个列表，多个参数可以继续编写多个类型，这样便能获得反射的方法对象。
     * 反射方法是运用returnObj = method.invoke(target, "World");代码完成的，第一个参数为target，就是确定用哪个
     * 对象调用，而"World"是参数，这行就等同于target.sayHello("World")。
     *
     * 如果存在多个参数，可以写成Method.invoke(target,obj1,obj2,obj3...)
     *
     */
    public static Object reflectMethod(){
        Object returnObj = null;
        ReflectServiceImpl target = new ReflectServiceImpl();

        try {
            Method method = ReflectServiceImpl.class.getMethod("sayHello", String.class);
            returnObj = method.invoke(target, "World");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return returnObj;
    }

    public static Object reflect(){
        ReflectServiceImpl object = null;

        try {
            object  = (ReflectServiceImpl) Class.forName("refect.ReflectServiceImpl").newInstance();
            Method method = object.getClass().getMethod("sayHello", String.class);
            method.invoke(object, "--World");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return object;
    }
}

