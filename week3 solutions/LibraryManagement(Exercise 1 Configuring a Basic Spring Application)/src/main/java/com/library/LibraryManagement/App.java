package com.library.LibraryManagement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;

public class App {
    public static void main(String[] args) {
        // Load Spring context
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get bookService bean
        BookService bookService = (BookService) context.getBean("bookService");

        // Use the service
        bookService.addBook("The Alchemist");
    }
}
