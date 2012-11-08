/*
*****************************************************************
*	    Name: Peter Faber (2836641), Clemens Mayer (2815170), Han Ngoc Phan (2821355)
*	   Datum: Tue Oct 30 18:33:09 CET 2012			
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
	MaschenDrahtZaunSong.getDescription();
	MaschenDrahtZaunSong.getDuration();
	MaschenDrahtZaunSong.play();

	/* Aufruf aller Methoden von TourSong */
	TourSong.getDescription();
	TourSong.getDuration();
	TourSong.play();
 
	/* Aufruf aller Methoden von BugsBunnyMusik */
	BugsBunnyMusik.getDescription();
	BugsBunnyMusik.getDuration();
	BugsBunnyMusik.play();
   }
}
