final public class CreateCustomImmutableClass
{
	private int value;
	CreateCustomImmutableClass(int val)
	{
		this.value = val;
	}
	public CreateCustomImmutableClass modify(int value)
	{
		if( this.value == value)
		{
			return this;
		}
		else 
		{
			return new CreateCustomImmutableClass(value);
		}
	}
	public static void main(String[] args)
	{
		CreateCustomImmutableClass obj = new CreateCustomImmutableClass(100);
		CreateCustomImmutableClass sameObj = obj.modify(100); //existing obj we try to change with the same value hence new obj will not be created
		System.out.println(obj == sameObj); // both reference pointing to same obj //true
		CreateCustomImmutableClass newObj = obj.modify(101);
		System.out.println(obj == newObj); // both reference point to different obj //false
		System.out.println(obj.hashCode()); 
		System.out.println(sameObj.hashCode()); 
		System.out.println(newObj.hashCode()); 
		
	}
}