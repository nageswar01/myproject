package myproject;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/database")
public class database extends jakarta.servlet.http.HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String date = request.getParameter("date");
		String occasion = request.getParameter("occasion");
		String phone = request.getParameter("phone");
		String hours = request.getParameter("hours");
		int Totalbill = Integer.parseInt(request.getParameter("Totalbill"));
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

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
