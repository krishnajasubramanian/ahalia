package Oopsconcept;
interface Whtuppcalls
{
	void calls();
	void mute();
	void disconnect();
}
class Audiocalls implements Whtuppcalls
{

	@Override
	public void calls() {
		System.out.println("Audio calls");
		
	}

	@Override
	public void mute() {
		System.out.println("Audio muted");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Audio disconnects");
		
	}
	
}
class videocalls implements Whtuppcalls
{

	@Override
	public void calls() {
		System.out.println("video calls");
		
	}

	@Override
	public void mute() {
		System.out.println("Video muted");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Video disconnected");
		
	}
	
	
}


public class Interfaceprogram {
public static void main(String[]args)
{
	Audiocalls a=new Audiocalls();
	a.calls();
	a.disconnect();
	a.mute();
	videocalls v=new videocalls();
	v.calls();
	v.disconnect();
	v.mute();
	//to creating interface referance//by creating interface referance we can call all the child class by using interface reference//
	Whtuppcalls ob=new Audiocalls();
	ob.calls();
	ob.disconnect();
	ob.mute();
	ob=new videocalls();///by using this reference ob we can call videocall class also//
	ob.disconnect();
	ob.mute();
	ob.calls();
	
}
}
