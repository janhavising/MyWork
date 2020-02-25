package controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Time;
import java.util.ArrayList;

import bean.Show;
import service.ImplementShowInterface;

public class SetData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try 
		{
			ArrayList<Show> al=new ArrayList<Show>();
			Show show = new Show();
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter the number of shows for the day");
			int n=Integer.valueOf(br.readLine());
			for(int i=1;i<=n;i++)
			{
				
				System.out.println("enter the show name:");
				show.setShowName(br.readLine());
				System.out.println("enter the show Id:");
				show.setShowId(Integer.valueOf(br.readLine()));
				System.out.println("enter screen id");
				show.setScreenId(Integer.valueOf(br.readLine()));
				System.out.println("enter theatre id");
				show.setTheaterId(Integer.valueOf(br.readLine()));
				System.out.println("enter start hour");
				int startHour=Integer.valueOf(br.readLine());
				System.out.println("enter start minute");
				int startMin=Integer.valueOf(br.readLine());
				System.out.println("enter start second");
				int startSec=Integer.valueOf(br.readLine());
				
				Time t=new Time(startHour,startMin,startSec);
				show.setShowStartTime(t);
				
				System.out.println("enter end hour");
				int endHour=Integer.valueOf(br.readLine());
				System.out.println("enter end minute");
				int endMin=Integer.valueOf(br.readLine());
				System.out.println("enter end second");
				int endSec=Integer.valueOf(br.readLine());
				
				Time t1=new Time(endHour,endMin,endSec);
				show.setShowEndTime(t1);
				
				/*Movie mov=new Movie();
				String p=mov.movie();
				show.setMovieName(mov);
			
				Seat seat=new Seat();
				int x=seat.vacant_Seat();
				show.setSeat(x);*/
				
				al.add(show);
			}
			ImplementShowInterface obj=new ImplementShowInterface();
			obj.upLocalDateSeatsBooked();
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}

}
