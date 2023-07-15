package com.example.Java_Pro_Lesson2;

import java.io.*;
import java.util.concurrent.atomic.AtomicInteger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private final AtomicInteger answerOneQuestionOne = new AtomicInteger(0);
    private final AtomicInteger answerOneQuestionTwo = new AtomicInteger(0);
    private final AtomicInteger answerTwoQuestionOne = new AtomicInteger(0);
    private final AtomicInteger answerTwoQuestionTwo = new AtomicInteger(0);


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String genre = request.getParameter("genre");
        if (genre.equals("Jazz")) {
            answerOneQuestionOne.incrementAndGet();
        } else if (genre.equals("Rock")) {
            answerOneQuestionTwo.incrementAndGet();
        }


        String platform = request.getParameter("platform");
        if (platform.equals("Sound Cloud")) {
            answerTwoQuestionOne.incrementAndGet();
        } else if (platform.equals("YouTube Music")) {
            answerTwoQuestionTwo.incrementAndGet();
        }
        doGet(request, response);

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String action = request.getParameter("action");
        if ("reset".equals(action)) {
            answerOneQuestionOne.set(0);
            answerOneQuestionTwo.set(0);
            answerTwoQuestionOne.set(0);
            answerTwoQuestionTwo.set(0);

            response.sendRedirect("index.jsp");
        } else {
            request.setAttribute("answerOneQuestionOne", answerOneQuestionOne.get());
            request.setAttribute("answerOneQuestionTwo", answerOneQuestionTwo.get());
            request.setAttribute("answerTwoQuestionOne", answerTwoQuestionOne.get());
            request.setAttribute("answerTwoQuestionTwo", answerTwoQuestionTwo.get());

            RequestDispatcher requestDispatcher = request.getRequestDispatcher("results.jsp");
            try {
                requestDispatcher.forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            }
        }

    }

    public void destroy() {
    }
}