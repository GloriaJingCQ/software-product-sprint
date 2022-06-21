package com.google.sps.servlets;

import java.io.IOException;
import com.google.gson.Gson;
import com.google.sps.Interest;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Handles requests sent to the /interests URL. Try running a server and navigating to /interests */
@WebServlet("/interests")
public class InterestServlet extends HttpServlet {
  Interest interest = new Interest();
  String json = new Gson().toJson(interest.getList());
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    response.setContentType("application/json;");
    response.getWriter().println(json);
    }
}