package pl.sda.structure.server;

import pl.sda.structure.server.request.HttpRequest;
import pl.sda.structure.server.request.TcpRequest;
import pl.sda.structure.server.server.HttpServer;
import pl.sda.structure.server.server.Server;
import pl.sda.structure.server.server.TcpServer;

public class ServerRunner {

    public static void main(String args[]){

        Server serverHttp = new HttpServer();
        Server tcpServer = new TcpServer();


        serverHttp.handleRequest(new HttpRequest());
        tcpServer.handleRequest(new TcpRequest());
    }

}


