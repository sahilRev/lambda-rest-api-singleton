package org.consultadd.lambdarestapi.singleton.funtionalInterfaces;

import org.consultadd.lambdarestapi.singleton.model.Request;
import org.consultadd.lambdarestapi.singleton.model.Response;
import org.consultadd.lambdarestapi.singleton.utils.RequestContext;

public interface AbstractRestApiController {

    Response doGet(Request request, RequestContext context);

    Response doPut(Request request, RequestContext context);

    Response doPost(Request request, RequestContext context);

    Response doDelete(Request request, RequestContext context);

    default Response handle(Request request, RequestContext context) {
        Response response;
        switch (request.getMethod()) {
            case GET:
                response = doGet(request, context);
                break;
            case PUT:
                response = doPut(request, context);
                break;
            case POST:
                response = doPost(request, context);
                break;
            case DELETE:
                response = doDelete(request, context);
                break;
            default:
                response = null;
        }
        return response;
    }

}
