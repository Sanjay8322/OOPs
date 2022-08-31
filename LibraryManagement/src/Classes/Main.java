package Classes;

import Enums.Gender;
import Exceptions.BookAlreadyExist;
import Exceptions.BookNotExist;
import Exceptions.NoUserExist;
import Exceptions.UserAlreadyExist;
import Services.LibraryServiceImplements;
import Services.StudentServiceImplements;

public class Main {
    public static void main(String[] args) throws UserAlreadyExist, BookAlreadyExist, BookNotExist, NoUserExist {
        Student sanjay=new Student("Sanjay",21, Gender.Male,1,"Fourth");
        Student Jay=new Student("Jay",22,Gender.Male,2,"Passed-out");

        Book habits=new Book(1,"Habits","John","Motivation");
        Book beautiful=new Book(2,"BeautifulDamned","G","Romance");

        StudentServiceImplements studentService=new StudentServiceImplements();
        LibraryServiceImplements libraryService=new LibraryServiceImplements();
        
        studentService.register(sanjay);
        studentService.register(Jay);


        libraryService.addBook(habits);
        libraryService.addBook(beautiful);
//
//        studentService.deleteAccount(Jay);
        studentService.getDetails(1);
        libraryService.getGenres();
        libraryService.getAvailableBooks();

    }
}
