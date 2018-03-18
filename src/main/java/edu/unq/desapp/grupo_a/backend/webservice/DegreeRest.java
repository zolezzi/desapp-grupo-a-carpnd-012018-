
package edu.unq.desapp.grupo_a.backend.webservice;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unq.desapp.grupo_a.backend.dto.DegreeDTO;
import edu.unq.desapp.grupo_a.backend.model.Degree;
import edu.unq.desapp.grupo_a.backend.service.DegreeService;
import edu.unq.desapp.grupo_a.backend.service.GenericService;

@Service
@Produces("application/json")
@Consumes("application/json")
@Path("/degrees")
public class DegreeRest extends GenericRest<Degree> {

	@Autowired
	private DegreeService degreeService;

	@Override
	public GenericService<Degree> getService() {
		return degreeService;
	}

	@POST
	@Path("/saveDegree")
	public Response saveDegree(@Context HttpServletRequest request, DegreeDTO dto) {
		try {
			degreeService.saveDegree(dto);
			return this.getResponseGenerator().buildSuccessResponse("Success");
		} catch (Exception e) {
			return this.getResponseGenerator().buildErrorResponse(new RuntimeException(e.getMessage()));
		}
	}
	
	@GET
	@Path("/saludo")
	public Response saludo(@Context HttpServletRequest request) {
		try {
			DegreeDTO dto = new DegreeDTO();
			dto.setName("Saludo");
			return this.getResponseGenerator().buildResponse(dto, Status.ACCEPTED);
			
		} catch (Exception e) {
			return this.getResponseGenerator().buildErrorResponse(new RuntimeException(e.getMessage()));
		}
	}

}