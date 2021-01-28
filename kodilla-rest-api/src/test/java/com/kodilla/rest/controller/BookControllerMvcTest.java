package com.kodilla.rest.controller;


import com.google.gson.Gson;
import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@WebMvcTest(BookController.class)

public class BookControllerMvcTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BookService bookService;

  /*  @Test
    public void shouldFetchBooks() throws Exception{
        List<BookDto> booksList = new ArrayList<>();
        booksList.add(new BookDto("title 1", "author 1"));
        booksList.add(new BookDto("title 2", "author 2"));
        Mockito.when(bookService.getBooks()).thenReturn(booksList);
    }
     mockMvc.perform(MockMvcRequestBuilders.get("/books")
             .contentType(MediaType.APPLICATION_JSON))
            .andExpect(MockMvcResultMatchers.status().is(200))
            .andExpect(MockMvcResultMatchers.jsonPath("$", Matchers.hasSize(2)));
    }*/
    @Test
    public void shouldFetchBooks() throws Exception {
        //given
        List<BookDto> booksList = new ArrayList<>();
        booksList.add(new BookDto("title 1", "author 1"));
        booksList.add(new BookDto("title 2", "author 2"));
        Mockito.when(bookService.getBooks()).thenReturn(booksList);

        //when & then
        mockMvc.perform(MockMvcRequestBuilders.get("/books")                      // [1]
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().is(200))                     // [2]
                .andExpect(MockMvcResultMatchers.jsonPath("$", Matchers.hasSize(2)));
    }

    @Test
    public void shouldAddBook() throws Exception {

        List<BookDto> booksList = new ArrayList<>();
        Gson gson = new Gson();
        Mockito.when(bookService.getBooks()).thenReturn(booksList);
        BookDto bookDtoMock = new BookDto("title 1", "author 1");
        booksList.add(bookDtoMock);
        String json = gson.toJson(bookDtoMock);

        mockMvc.perform(MockMvcRequestBuilders
                .post("/books")
                .contentType(MediaType.APPLICATION_JSON)
                .content(json)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().is(200));

        mockMvc.perform(MockMvcRequestBuilders
                .get("/books")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.jsonPath("$", Matchers.hasSize(1)));
    }
}
/*
JSON:

        [
        {
        "id": 8484,
        "name": "David",
        "height": 173.2,
        "weight": 75.42
        },
        {
        "id": 8485,
        "name": "Ronald",
        "height": 183.73,
        "weight": 83.1
        }
        ]

        Person.java

public class Person {
    public int id;
    public String name;
    public double height;
    public double weight;

    @Override
    public String toString() {
        return "[ id: " + String.valueOf(id) + ", name: " + name + ", height: " + String.valueOf(height) + ", weight: " + String.valueOf(weight) + " ]";
    }
}

Usage:

        Gson gson = new Gson();
        Person[] persons = gson.fromJson(json, Person[].class);
        for(Person person : persons)
        System.out.println(person.toString());

        Output:

        [ id: 8484, name: David, height: 173.2, weight: 75.42 ]
        [ id: 8485, name: Ronald, height: 183.73, weight: 83.1 ]

        Convert String to JsonObject without POJO
        #
        String jsonStr = "{\"name\" : \"Abcd\", \"greeting\": \"Hello\", }"; //Sample Json String

        Gson gson = new Gson(); // Creates new instance of Gson
        JsonElement element = gson.fromJson (jsonStr, JsonElement.class); //Converts the json string to JsonElement without POJO
        JsonObject jsonObj = element.getAsJsonObject(); //Converting JsonElement to JsonObject

        String name = jsonObj.get("name").getAsString(); //To fetch the values from json object
        String greeting = jsonObj.get("greeting").getAsString();

*/