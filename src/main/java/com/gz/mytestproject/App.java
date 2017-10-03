package com.gz.mytestproject;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("add:"+App.add(12, 15));
        
    }


public static int add(int x,int y) {
	return x+y;	
}
}