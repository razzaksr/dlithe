public interface E1 {
void Insert(EventManagement E1);
public void Delete(EventManagement E1) throws EventNotFoundException,ParticipantNotFoundException;
public void Update(EventManagement EName,String P_Name);
public void List();
public void Search(String Date);
public void Addparticipant(EventManagement EName,String P_Name) throws EventNotFoundException,ParticipantNotFoundException;
}
