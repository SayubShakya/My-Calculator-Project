package MyPackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private String[] jokes = { "Why do Java developers wear glasses? Because they don't C#!",
			"I told my computer I needed a break, and now it won't stop sending me Kit Kat bars.",
			"Why don't programmers like nature? It has too many bugs.",
			"How many programmers does it take to change a light bulb? None, it's a hardware problem.",
			// Add more jokes here
	};

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String str1 = request.getParameter("num1");
		String str2 = request.getParameter("num2");
		String str3 = request.getParameter("bt1");

		int a = Integer.parseInt(str1);
		int b = Integer.parseInt(str2);
		int result = 0;

		switch (str3) {
		case "1":
			result = a + b;
			break;
		case "2":
			result = a - b;
			break;
		case "3":
			result = a * b;
			break;
		case "4":
			if (b != 0) {
				result = a / b;
			} else {
				response.getWriter().println("Error: Division by zero!");
				return;
			}
			break;
		default:
			response.getWriter().println("Invalid operation selected");
			return;
		}

		int randomIndex = (int) (Math.random() * jokes.length);
		String randomJoke = jokes[randomIndex];

		// Store result and joke in request attributes
		request.setAttribute("result", result);
		request.setAttribute("joke", randomJoke);

		// Forward the request to result.jsp
		request.getRequestDispatcher("result.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
