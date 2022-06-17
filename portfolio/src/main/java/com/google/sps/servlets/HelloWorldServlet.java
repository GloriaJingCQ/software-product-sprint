package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Handles requests sent to the /hello URL. Try running a server and navigating to /interests */
@WebServlet("/interests")
public class InterestServlet extends HttpServlet {
  ArrayList<String> mylist = new ArrayList<String> ();
  mylist.add("Hiking");
  mylist.add("Boxing");
  mylist.add("Salsa dance");
  String json = new Gson().toJson(mylist);
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    response.setContentType("application/json;");
    response.getWriter().println(json);
    }

  }
