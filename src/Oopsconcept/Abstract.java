package Oopsconcept;
//using abstract method//
abstract class Google
{
	public void message()
	{
		System.out.println("thank u for using Google");
	}
}
	class Searchall extends Google
{
	void search() {
	System.out.println("search all");
}}
class Searchimage extends Google
{
	void search() {

	System.out.println("image search results");
	
}}
class Searchvideo extends Google
{
	void search() {
		{
	System.out.println("search video");
	
}}}
public class Abstract
{
public static void main(String[]args)
{
	Searchall a=new Searchall();
	a.message();
	a.search();
	Searchimage b=new Searchimage();
	b.message();
	b.search();
	Searchvideo c=new Searchvideo();
	c.message();
	c.search();

}}
	
