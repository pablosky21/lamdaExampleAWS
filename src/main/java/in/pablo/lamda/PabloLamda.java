package in.pablo.lamda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;


public class PabloLamda implements RequestHandler<LamdaRequest, LamdaResponse> {

	@Override
	public LamdaResponse handleRequest(LamdaRequest request, Context context) {
		LamdaResponse response = new LamdaResponse();
		if (request.getOpcion().equals("1")) {
			response.setApellido("Pablo");
			response.setNombre("Lincoleo");
		} else {
			response.setApellido("Mario");
			response.setNombre("Lincoleo");
		}

		return response;
	}

}
