#Application.java

class Circle
{
    double radius;
    
    void calculateArea() //method 1 definition
    {
        double area = 3.14*radius*radius;
        System.out.println("Area of circle: " +area);
    }
    void calculateCircumference() //method 2 definition
    {
        double circum = 2*3.14*radius;
        System.out.println("Circumference of circle: " +circum);
    }
}
class Main
{
    public static void main(String args[])
    {
        Circle c = new Circle(); //creating object of class circle
        c.radius = 5; 
        c.calculateArea(); //invokes calculateArea() with object c
        c.calculateCircumference(); //invokes calculateCircumference() with object c
    }
	#feature202 changes by Ana Developer for User Module in oct 2024
	public class StrategyFactory implements InitializingBean {
    @Autowired
    private List<Strategy> strategyList;
    private Map<String, Strategy> strategyMap;
    @Override
    public void afterPropertiesSet() {
        if (CollectionUtils.isNotEmpty(strategyList)) {
            int size = (int) Math.ceil(strategyList.size() * 4.0 / 3);
            Map<String, Strategy> map = new ConcurrentHashMap<>(size);
            for (Strategy strategy : strategyList) {
                map.put(strategy.getType(), strategy);
            }
            strategyMap = Collections.unmodifiableMap(map);
        }
    }
    ...
}
#feature202 changes done
}