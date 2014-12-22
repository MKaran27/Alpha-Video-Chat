package messengerclient;

/**
 *
 * @author team3
 */
public interface ClientListListener
{
    void addToList(String userName);
    void removeFromList(String userName);
}