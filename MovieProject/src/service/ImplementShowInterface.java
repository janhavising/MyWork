package service;

import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

import bean.Show;
import controller.SetData;
import controller.GetData;

public class ImplementShowInterface implements ShowInterface {

	
	@Override
	public void upLocalDateSeatsBooked(){
		// TODO Auto-generated method stub
		
		try {
			ArrayList<Show> al=new ArrayList<Show>();
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter the show to be searched");
			String show_name=br.readLine();
			Iterator it=al.iterator();
			int flag=0;
			while(it.hasNext())
			{
				Show element=(Show)it.next();
				if(show_name.equals(element.getShowName()))
				{
					Show show=new Show();
					System.out.println("Show name is: "+element.getShowName());
					System.out.println("Show Id is: "+element.getShowId());
					System.out.println("Screen Id is: "+element.getScreenId());
					System.out.println("Theater Id is: "+element.getTheaterId());
					System.out.println("Movie name is: "+element.getMovieName());
					System.out.println("Movie start time is: "+element.getShowStartTime());
					System.out.println("Movie end time is: "+element.getShowEndTime());
					System.out.println("Seat Availability : "+element.getSeat());
					System.out.println("----------------------------------------------");
					flag++;
				}
						
				else
				{
					if(flag==0)
					{
						System.out.println("oops!!!!   No such show found");
						System.out.println("------------------------------------------");
					}
				}
			}
			
					
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
