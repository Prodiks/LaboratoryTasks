package LR10.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AddBook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        JSONParser parser = new JSONParser();
        Object obj = null;
        try {
            obj = parser
                    .parse(new FileReader("src/LR10/json/example-json.json"));
        } catch (IOException | ParseException ex) {
            throw new RuntimeException(ex);
        }
        JSONObject library = (JSONObject) obj;
        JSONArray books = (JSONArray) library.get("books");

        JSONObject newBook = new JSONObject();
        System.out.println("Введите название книги: ");
        newBook.put("title", in.nextLine());
        System.out.println("Введите автора книги: ");
        newBook.put("author", in.nextLine());
        System.out.println("Введите год выпуска книги: ");
        newBook.put("year", in.nextLine());

        books.add(newBook);

        library.put("books", books);

        try(FileWriter file = new FileWriter("src/LR10/json/example-json.json")){
            file.write(library.toJSONString());
            System.out.println("Книга успешно добавлена");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }


}
