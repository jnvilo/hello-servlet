package com.example.servlet;

import javax.servlet.http.*;
import java.io.IOException;

public class ExampleServlet extends HttpServlet {
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
        throws IOException {
        httpServletResponse.getWriter().print("Hello from servlet");
    }
}
