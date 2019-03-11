class AdapterClassConclusions
{
	//Adapter class is a simple java class that implements an interface with only empty implementation for the methods.
	
	//interface X { void m1(); void m2(); ....... void m1000();} // if we implement X commpulsary we have to implement m1()-m1000() methods
	
	//class abc implements x{ void m1() {10 lines of implemetation} , void m2(){}, void m3(){}, .... void m1000(){}} , just for defining 10lines of 
	// code of m1() we have to write 999 lines to provide empty implementation of m2-m1000 methods.
	
	// to solve this issue we define a class once as (provind empty implementation of all methods in X(I))
	// abstract class AdapterClassX implements X { void m1(){} void m2() {} , void m3(){}, ... void m1000(){}}
	// class UsingAdapterClass extends AdapterClassX { override the needed methods void m5() {20lines of code}} 
	//length of code reduced, readability increased
	
	//servlet is best example of AdapterClassConclusions
	//if we implement servlet(I) we have to provide implementation of all 5 methods
	// if we extend GenericServlet(AC) / HttpServlet(AC) just implementing service() method is enough

}