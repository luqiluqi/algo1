package pl.sda.structure.server.server;

import pl.sda.structure.server.request.Request;
import pl.sda.structure.server.Response;

public abstract class Server {

    public Response handleRequest(Request request) {
        return new Response("Response dla requesta" + request);
    }

}
