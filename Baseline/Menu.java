import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends Button
{
	/**
	 * Act - do whatever the Menu wants to do. This method is called whenever
	 * the 'Act' or 'Run' button gets pressed in the environment.
	 */
	public void act() 
	{
		if (Greenfoot.mouseClicked(this))
		{
			Greenfoot.setWorld(new HomeWorld());
			((Monkey)getWorld().getObjects(Monkey.class).get(0)).getMusic().pause();
		}
	}    
}
