package org.jonathany23.sga.servicio;


import org.jonathany23.sga.domain.Persona;

import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

//Bean: Implementa los metodos de negocio,
//Puede implementar 0 o mas interfaces de negocio, dependeindo del tipo de EJB
//Se debe anotar con @Stateless, @Stateful o @Singleton dependiendo del tipo de ejb
//Convertir un pojo a bean simplemente usando la anotacion correspondiente
@Stateless
public class PersonaServiceImpl implements PersonaServiceRemote, PersonaService {
    //el EJB puede implementar o no una o varias interfaces locales o remotas

    //El EJB puede tener uno o mas metodos de Negocio
    @Override
    public List<Persona> listarPersonas() {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(1, "Carlos", "Prueba1", "Apellido2", "test@gmail.com", "12345678"));
        personas.add(new Persona(2, "Pedro", "Prueba2", "Apellido2", "test2@gmail.com", "12345676"));
        return personas;
    }

    @Override
    public Persona buscarPersonaPorId(Persona persona) {
        return null;
    }

    @Override
    public Persona buscarPersonaPorEmail(Persona persona) {
        return null;
    }

    @Override
    public void registrarPersona(Persona persona) {

    }

    @Override
    public void modificarPersona(Persona persona) {

    }

    @Override
    public void eliminarPersona(Persona persona) {

    }
}
