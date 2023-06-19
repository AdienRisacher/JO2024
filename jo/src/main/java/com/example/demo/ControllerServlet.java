package com.example.demo;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet (name = "FormServlet", urlPatterns = "/getBook")
public class ControllerServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ServletException, IOException {
        request.setAttribute("book_title", "1984");
        RequestDispatcher dispatcher = request.getRequestDispatcher("bookTitle.jsp");
        dispatcher.forward(request, response);
    }
}
