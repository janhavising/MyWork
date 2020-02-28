package project;
import java.io.*;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Iterator;

public class ShowMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			ArrayList<Show> al=new ArrayList<Show>();
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter the number of shows for the day");
			int n=Integer.valueOf(br.readLine());
			for(int i=1;i<=n;i++)
			{
				Show show = new Show();
				System.out.println("enter the show name:");
				show.setShowName(br.readLine());
				System.out.println("enter the show Id:");
				show.setShowId(Integer.valueOf(br.readLine()));
				//System.out.println("enter the movie name:");
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
				
				al.add(show);
				
			}
			System.out.println("enter the show to be searched");
			String show_name=br.readLine();
			ImplementShowInterface isi=new ImplementShowInterface();
			isi.upLocalDateSeatsBooked(al,show_name);
						
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
