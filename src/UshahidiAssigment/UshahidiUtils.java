package UshahidiAssigment;
import org.json.*;
import edu.grinnell.glimmer.ushahidi.*;
import java.time.LocalDateTime;


public class UshahidiUtils{
	public void printIncidentsDateRange(UshahidiClient client, LocalDateTime startDate, LocalDateTime endDate) throws Exception
	{
		while(client.hasMoreIncidents())
		{
			UshahidiIncident currentIncident = client.nextIncident();
			if(currentIncident.getDate().isBefore(endDate) && currentIncident.getDate().isAfter(startDate))
			{
				System.out.println(currentIncident.toString());
			}
		}
	}
}
