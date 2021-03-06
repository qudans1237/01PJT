import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class GetDataKr extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException{
		
		/*========================
		 * ==> Tomcat 8.X 이상 Get방식 한글해결
		 * ==> servev.xml 설정 변
		 *<Connector port = "8080" protocol = "HTTP/1.1"
		 *connectionTimeout="20000"
		 *redirectPort="8443"
		 *useBodyEncodingForURI="true"/> <==추
		 ==========================*/
	
		req.setCharacterEncoding("EUC_KR");

		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();

		// client form data(QueryString :: name=vlaue)처리(API 확인)
		String clientName = req.getParameter("name");
		String clientAddr = req.getParameter("addr");

		// client form data출력(출력은??)
		System.out.println(clientName + ":" + clientAddr);
		
		/*================================
		 * Tomcat 7.X 이하의 Get 방식 한글 해결방법
		 * 16진수 인코딩된 client form data 한글 디코딩
		 * String clientNameKo = this.convertKo(clientName)
		 * String clientAddrKo = convertKo(clientAddr);
		 *  //client form data 출력(출력은 ?? )
		 *  System.out.println(clientKo+ ":"+clientAddrKo);
		 ===============================*/
		
		out.println("<html>");
		out.println("<head><title>GetDataKr.java</title></head>");
		out.println("<body>");
		
		out.println("<h2>Get Test Kr</h2>");
		out.println("<li> 이름 : "+clientName);
		out.println("<li> 주소 : "+clientAddr);
		
		out.println("<p><p><a href='/edu/getDataKr.html'>뒤로</a>");
		
		out.println("</body>");
		out.println("</html>");
	}
	/*=====================================
	 * Tomcat 7.X 이하의 Get 방식 한글해결방
	 * //Method
	 * private String convertKo(String paramValue){
	 * 	String convertParamValue = null;
	 * try{
	 * 		//== API 확인
	 * 		byte[] b = paramValue.getBytes("8859_1");
	 * 		convertParamValue = new String(b,"EUC_KR");
	 * 	}catch(UnsupportedEncodingException uee){
	 * 		System.out.println("한글 변환중 Exception 발생");
	 * 		uee.printStackTrace();
	 * 	}
	 * 	return convertParamValue;
	 * }
	 ======================================*/

}
