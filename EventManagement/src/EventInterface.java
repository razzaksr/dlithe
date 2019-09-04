import java.time.*;
public interface EventInterface
{
	public void insert(Event a);
	public void delete(Event a) throws EventNotFoundException, ParticipantNotFoundException;
	public void update(Event EventName, String PName);
	public void list();
	public void addParticipant(Event EventName, String PName) throws EventNotFoundException, ParticipantNotFoundException;
	public void search(String Date);
}
