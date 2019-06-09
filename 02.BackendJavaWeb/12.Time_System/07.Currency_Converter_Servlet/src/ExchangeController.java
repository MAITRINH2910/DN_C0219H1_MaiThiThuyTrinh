import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ExchangeCurrency")
public class ExchangeController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        float rate = Float.parseFloat(req.getParameter("rate"));
        float amount = Float.parseFloat(req.getParameter("amount"));

        String fromCurrency = req.getParameter("fromCurrency");
        String toCurrency = req.getParameter("toCurrency");
        PrintWriter writer = resp.getWriter();

        if (fromCurrency.equals("USD") && toCurrency.equals(("VND"))) {
            writer.print(amount +" " +fromCurrency +" <=> ");
            writer.println(rate*amount+" " +toCurrency);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher =req.getRequestDispatcher("index.jsp");
        requestDispatcher.forward(req,resp);
    }
}
