
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import myproject.database;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class bookingbackened
 */
@WebServlet("/bookingbackened")
public class bookingbackened extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

		// for output printing
		PrintWriter pw = response.getWriter();
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String date = request.getParameter("date");
		String phone = request.getParameter("phone");
		String occasion = request.getParameter("occasion");
		String hours = request.getParameter("hours");
		int Totalbill = 0;
		
		
		switch (occasion) {
		case "Birthday celebrations": {
			if (hours == "1 hour") {
				Totalbill = 1500;
			} else if (hours == "2 hours") {
				Totalbill = 2000;
			} else {
				Totalbill = 2500;
			}

		}
			break;
		case "Anniversary celebrations": {
			if (hours == "1 hour") {
				Totalbill = 2000;
			} else if (hours == "2 hours") {
				Totalbill = 2500;
			} else {
				Totalbill = 3500;
			}

		}
			break;
		case "private Party": {
			if (hours == "1 hour") {
				Totalbill = 2000;
			} else if (hours == "2 hours") {
				Totalbill = 3000;
			} else {
				Totalbill = 4000;
			}

		}
			break;
		default:

			// throw new IllegalArgumentException("Unexpected value: " + Totalbill);
			
		}
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myproject", "root", "Nani141149");
			PreparedStatement pr = con
					.prepareStatement("Insert into booking(name,age,date,occasion,phone,hours,Totalbill) values(?,?,?,?,?,?,?)");
			pr.setString(1, name);
			pr.setInt(2, age);
			pr.setString(3, date);
			pr.setString(4, occasion);
			pr.setString(5, phone);
			pr.setString(6, hours);
			pr.setInt(7, Totalbill);
			int i = pr.executeUpdate();
			if (i > 0) {
				System.out.println("done!");
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}

		
		
		
		database db=new database();

		request.setAttribute("name", name);
		request.setAttribute("occasion", occasion);
		request.setAttribute("date", date);
		request.setAttribute("phone", phone);
		request.setAttribute("hours", hours);
		request.setAttribute("Totalbill", Totalbill);
		RequestDispatcher rd = request.getRequestDispatcher("bookingconformation.jsp");
		rd.forward(request, response);
		RequestDispatcher d = request.getRequestDispatcher("database.java");
		d.forward(request, response);

	}

}
