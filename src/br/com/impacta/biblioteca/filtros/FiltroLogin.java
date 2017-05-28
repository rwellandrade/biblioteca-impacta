package br.com.impacta.biblioteca.filtros;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import br.com.impacta.biblioteca.model.Inscricao;
@WebFilter("/*")
public class FiltroLogin implements Filter {
	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest r = (HttpServletRequest)req;
		HttpSession session = r.getSession();
		Inscricao i = (Inscricao)session.getAttribute("user");
		if(i != null || "Login".equals(r.getParameter("logica"))){
			chain.doFilter(req, res);
		}else{
			RequestDispatcher rd = req.getRequestDispatcher("/index.html");
			rd.forward(req, res);
		}
		
	}

}
