/*
*****************************************************************
*	    Name: Peter Faber (2836641), Clemens Mayer (2815170), Han Ngoc Phan (2821355)
*	   Datum: Fri Nov  9 13:13:48 CET 2012 
*	 Aufgabe: IsteMediaPlayer				
*	 Version: 1.0						
*	Funktion: Funktionsaufrufe von Klassen in iste.media.*
*****************************************************************
*/

import iste.media.*;

class ISTEMediaPlayer implements ISTEMediaInterface
{
   public static void main(String[] args)
   {

	/* Aufruf aller Methoden von MaschenDrahtZaunSong */
	/* Aufruf der Getter*/
	MaschenDrahtZaunSong.getDescription();
	MaschenDrahtZaunSong.getDuration();
	/*Spielt 2 Sekunden das Lied da man es länger nicht aushält :) */
	MaschenDrahtZaunSong.play(2);

	/* Aufruf aller Methoden von TourSong Analog zum ersten */
	TourSong.getDescription();
	TourSong.getDuration();
	TourSong.play(45);

/* **************************************************
*	         	 /|         ,
*	               ,///        /|
*	              // //     ,///
*	             // //     // //
*	            // //     || ||
*	            || ||    // //
*	            || ||   // //
*	            || ||  // //
*	            || || || ||
*	            \\,\|,|\_//
*	             \\)\)\\|/
*	             )-."" .-(
*	            //^\` `/^\\
*	           //  |   |  \\  
*	         ,/_| 0| _ | 0|_\,
*	       /`    `"=.v.="`    `\
*	      /`    _."{_,_}"._    `\
*	 jgs  `/`  ` \  |||  / `  `\`
*	       `",_  \\=^~^=//  _,"`
*	           "=,\'-=-'/,="
*	               '---'
*
* 	ASCII ART by http://www.geocities.com/spunk1111/warnerb.htm#bugs
************************************************************/
 
	/* Aufruf aller Methoden von BugsBunnyMusik */
	BugsBunnyMusik.getDescription();
	BugsBunnyMusik.getDuration();
	/*Spiel das ganze Lied ab, weil jeder diese Musik liebt  */
	BugsBunnyMusik.play(35);
   }
}
