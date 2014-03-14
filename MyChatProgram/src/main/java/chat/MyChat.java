package main.java.chat;

import static main.java.chat.util.Util.*;

import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * @author alex
 *
 */
public final class MyChat implements Chat
{
    boolean chat;
    Responder responder;
    Scanner scan;
    int gender = 1;

    public MyChat()
    {
        chat = true;
        scan = new Scanner( System.in );
    }

    @Override
    public void initialize( Responder responderIn)
    {
        responder = responderIn;
        if(gender == 1){
        	responder.readConfigFile( "..\\..\\..\\resources\\config2.chat" );
        }
        else{
        	if(gender == 2){
        		responder.readConfigFile( "..\\..\\..\\resources\\config.chat" );
        	}
        	else{
        		responder.readConfigFile( "..\\..\\..\\resources\\config.chat" );
        	}
        }
        
    }
    
    //have a selection of 2 cofigs to have it as a male or female

    @Override
    public String getSentence()
    {
        return scan.nextLine();
    }

    @Override
    public void chat()
    {
    	print( "Welcome to Chat. Please enter a digit to choose the computer to be a male or female: Male = 1, Female = 2 \n Enter Here:");
    	
    	int genderTemp = scan.nextInt();
    	//change to a try-catch statement
    	
    	boolean fin = false;
    	while(fin == false){
    		if((genderTemp == 1) || (genderTemp == 2)){
    			fin = true;
    		}
    		else{
    		print("Error, please only enter the specified digit: 1 for Male or 2 for Female to determine the computer's gender.\n Enter Here:");
    		genderTemp = scan.nextInt();
    		}
    	}
    	
    	gender = genderTemp;
    	
    	String sentence = getSentence();

        while( chat )
        {
            sentence = getSentence();

            responder.respond( sentence );
        }
    }
}
