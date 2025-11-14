package PhoneBook;
import java.util.*;

public class PhoneBook implements PhoneBookInterface
{

    private final Map<String, List<String>> book;

    public PhoneBook()
    {
        this.book = new HashMap<>();
    }

    @Override
    public void add(String surname, String phoneNumber)
    {
        if (!book.containsKey(surname))
        {
            book.put(surname, new ArrayList<>());
        }
        book.get(surname).add(phoneNumber);
    }

    @Override
    public List<String> get(String surname)
    {
        return book.getOrDefault(surname, Collections.emptyList());
    }


    public void printAllEntries()
    {
        for (Map.Entry<String, List<String>> entry : book.entrySet())
        {
            System.out.println("Фамилия: " + entry.getKey() + "\nНомера: " + entry.getValue().toString());
        }
    }
}