class hello2{
	public static void main(String[] args){
	
	float x = 2.85f;
	float y = 3.55f;

	float multiply = x * y ;

System.out.println("Multification of x * y is : " + multiply);

System.out.println("before swap:");
System.out.println("first number: " + x);
System.out.println("second number: " + y);

float temp = x;

x=y;
y=temp;

System.out.println("after swap:");
System.out.println("first number: " + x);
System.out.println("second number: " + y);

}
}