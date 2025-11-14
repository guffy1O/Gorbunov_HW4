import java.util.*;
import PhoneBook.*;

public class Main
{
    public static void exercise1()
    {
        String[] words = {"мышка", "клавиатура", "наушники", "геймпад", "мышка",
                "геймпад", "джойстик", "руль", "микрофон", "наушники"};

        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));

        System.out.println("Список уникальных слов:");
        boolean first = true;
        for (String word : uniqueWords)
        {
            if (!first)
            {
                System.out.print(", ");
            }
            System.out.print(word);
            first = false;
        }
        System.out.println();

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words)
        {
            if (!wordCount.containsKey(word))
            {
                wordCount.put(word, 1);
            }
            else
            {
                wordCount.put(word, wordCount.get(word) + 1);
            }
        }

        System.out.println("\nКоличество каждого слова:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet())
        {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void exercise2()
    {
        PhoneBook pb = new PhoneBook();

        pb.add("Иванов", "+79876543210");
        pb.add("Иванов", "+79876543211");
        pb.add("Петров", "+79123456789");
        pb.add("Смирнов", "+79998887766");

        pb.printAllEntries();


        List<String> ivanovNumbers = pb.get("Иванов");
        System.out.println("Телефонные номера Иванова: " + ivanovNumbers);

    }

    public static void main(String[] args)
    {
        exercise1();
        exercise2();
    }
}