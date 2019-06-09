import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/display-discount")
public class ProductDiscountCalculator extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String des = req.getParameter("description");
        double listprice = Double.parseDouble(req.getParameter("price"));
        double discount = Double.parseDouble(req.getParameter("discount"));

        PrintWriter writer = resp.getWriter();

        writer.println("Infor of product: "+ des);
        writer.println("Standard Price: "+ listprice);
        writer.println("Discount Percentage: "+discount);
        double DiscountAmount = listprice * discount * 0.01;
        writer.println("Discount Amount: " + DiscountAmount );
        writer.println("Discount Price: "+ (listprice -DiscountAmount));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher =req.getRequestDispatcher("index.jsp");
        requestDispatcher.forward(req,resp);
    }
}
