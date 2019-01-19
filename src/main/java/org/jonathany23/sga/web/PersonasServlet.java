package org.jonathany23.sga.web;

import org.jonathany23.sga.domain.Persona;
import org.jonathany23.sga.servicio.PersonaService;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/personas")
public class PersonasServlet extends HttpServlet {
    @Inject
    PersonaService personaServiceEjbLocal;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Persona> personas = personaServiceEjbLocal.listarPersonas();
        System.out.println("personas:" + personas);
        req.setAttribute("personas", personas);
        req.getRequestDispatcher("/listadoPersonas.jsp").forward(req, resp);
    }
}
