package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.TB_MEMDAO;
import Controller.TB_MEMDTO;

@WebServlet(name = "TP_memberInsert", urlPatterns = { "/TP_member/Insert.do" })
public class TP_MemberInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		// 사전작업
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		// 클라이언트의 요청정보 추출
		String MEM_NM = request.getParameter("MEM_NM");
		String BIRTH = request.getParameter("BIRTH");
		String GENDER = request.getParameter("GENDER");
		String MEM_ID = request.getParameter("MEM_ID");
		String PWD = request.getParameter("PWD");
		String PWD_CHECK = request.getParameter("PWD_CHECK");
		String CELLNO = request.getParameter("CELLNO");
		String EMAIL = request.getParameter("EMAIL");
		String ADDR = request.getParameter("ADDR");
		
		// 비즈니스메소드 호출
		TB_MEMDAO dao = new TB_MEMDAO();
		TB_MEMDTO user = new TB_MEMDTO(MEM_NM, BIRTH, GENDER, MEM_ID, PWD, PWD_CHECK, CELLNO, EMAIL, ADDR );
		int result = dao.insert(user);
		
	
//		response.sendRedirect("/web-semi-project/member/list.do");
	}
}
