package myPackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;


@WebServlet("/myServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private String[]jokes= {
			"Why do java developers wear glasses? Becasue they don't c",
			"I told my computer i needed a break, and now it won't  stop sending me kit kat bars.",
			"Why don't programmers like nature? It has too  many bugs ",
			"How many programmers does it take to change a light bulb? None,It's a hardware problem."
	};
       
    
    public MyServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
				
				//request.setAttribute("ans", ans);
				//request.setAttribute("joke", randomjoke);
				
				//Forward to the result jsp page
				//request.getRequestDispatcher("calculator.jsp").forward(request, response);
				
				
				
	}
				
				 
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		String str1=request.getParameter("num1");
		String str2=request.getParameter("num2");
		String str3=request.getParameter("bt1");
		
		//type casting
		int a=Integer.parseInt(str1);
		int b=Integer.parseInt(str2);
		
         Integer ans;
		if(str3.equals("1")) ans= (a+b);
		else if(str3.equals("2")) ans=(a-b);
		else if(str3.equals("3")) ans= (a*b);
		else ans= (a/b);
		
				
	
				
				//response.getWriter().append("Ans= "+ans);
				int randomIndex=(int)(Math.random()* jokes.length);
				String randomjoke=jokes[randomIndex];
			
				request.setAttribute("Ans", ans);
				request.setAttribute("joke", randomjoke);
				
				//
				
				request.getRequestDispatcher("calculator.jsp").forward(request, response);
				
		
		
	}

}
