package Controllers;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import Models.Book;
import Models.Std;

public class DBhelper {

	public static void tableBuilder() {

		Connection conn = null;
		try {
			conn = DB.connect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String sql;

		sql = "create table Student (" +
				"id int primary key IDENTITY (1,1)," +
				"Fname varchar(255) not null," +
				"Lname varchar(255) not null," +
				"password varchar(255) not null," +
				"phone varchar (15)," +
				"email varchar(255) not null," +
				"gender int );";

		try {
			conn.createStatement().executeUpdate(sql);
		} catch (SQLException e) {
		}

		sql = "create table Book (" +
				"ID int primary key IDENTITY (1,1) ," +
				"photo varchar(255) ," +
				"Title  varchar(255)," +
				"Year  varchar(15)," +
				"pages int," +
				"ISBN varchar(50) not null );";

		try {
			conn.createStatement().executeUpdate(sql);
		} catch (SQLException e) {

		}

		sql = "create table Publisher(" +
				"Publisher_name varchar (255) ," +
				"Books_published int foreign key references Book(ID));";

		try {
			conn.createStatement().executeUpdate(sql);
		} catch (SQLException e) {
		}

		sql = "create table Author(" +
				"Author_Name varchar (255)," +
				"Books_written int foreign key references Book(ID));";

		try {
			conn.createStatement().executeUpdate(sql);
		} catch (SQLException e) {
		}

		sql = "create table Book_copies (" +
				"ncopies int," +
				"ID int foreign key references Book (ID));";

		try {
			conn.createStatement().executeUpdate(sql);
		} catch (SQLException e) {
		}

		sql = "create table Borrowed_book(" +
				"Student_ID int foreign key references student(id)," +
				"Book_ID int foreign key references Book(ID),);";

		try {
			conn.createStatement().executeUpdate(sql);
		} catch (SQLException e) {
		}

		sql = "create table Admin(" +
				"ID int primary key IDENTITY (1,1) ," +
				"Fname varchar(255) Not null," +
				"Lname varchar(255) Not null," +
				"email varchar(255) not null," +
				"password varchar(255) not null," +
				"phone varchar (15) );";

		try {
			conn.createStatement().executeUpdate(sql);
		} catch (SQLException e) {
		}

	}

	public static void insertBook(Book book) throws Exception {
		Connection conn = DB.connect();
		String sql = "INSERT INTO Book(Title, Year, photo, ISBN, pages) values" +
				"(?, ?, ?, ?, ?)";

		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setString(1, book.getTitle());
		stmt.setString(2, book.getYear().toString());
		stmt.setString(3, book.getLink());
		stmt.setString(4, book.getISBN());
		stmt.setInt(5, book.getPages());
		stmt.executeUpdate();

		sql = "SELECT ID FROM Book WHERE ISBN = ?;";
		stmt = conn.prepareStatement(sql);
		stmt.setString(1, book.getISBN());
		ResultSet res = stmt.executeQuery();
		res.next();
		int id = res.getInt("ID");

		sql = "INSERT INTO  publisher(Publisher_name, Books_published) values" +
				"(?, ?)";
		stmt = conn.prepareStatement(sql);
		stmt.setString(1, book.getPublisher());
		stmt.setInt(2, id);
		stmt.executeUpdate();

		sql = "INSERT INTO Author(Author_Name, Books_written) values" +
				"(?, ?)";
		stmt = conn.prepareStatement(sql);
		stmt.setString(1, book.getAuther());
		stmt.setInt(2, id);
		stmt.executeUpdate();

		sql = "INSERT INTO Book_copies(ncopies, ID ) values" +
				"(?, ?)";
		stmt = conn.prepareStatement(sql);
		stmt.setInt(1, book.getCopies());
		stmt.setInt(2, id);
		stmt.executeUpdate();

	}

	public static void insertStudent(Std student) throws Exception {
		Connection conn = DB.connect();

		String sql = "INSERT INTO student(Fname, Lname, password, email, phone, gender) VALUES" +
				"(?, ?, ?, ?, ?, ?, ?);";

		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setString(1, student.getFname());
		stmt.setString(2, student.getLname());
		stmt.setString(3, student.getPass());
		stmt.setString(4, student.getEmail());
		stmt.setString(5, student.getPhone());
		stmt.setInt(6, student.getGender());

		stmt.executeUpdate();

	}

	public static List<Std> getStudents() throws Exception {

		Connection conn = DB.connect();

		List<Std> stds = new ArrayList<Std>();

		String sql = "SELECT * FROM student;";

		ResultSet res = conn.createStatement().executeQuery(sql);

		while (res.next()) {
			stds.add(new Std(res.getInt("id"), res.getString("fname"), res.getString("lname"), res.getString("email"),
					res.getString("pass"), res.getInt("gender"), res.getString("phone")));
		}

		return stds;
	}

}
