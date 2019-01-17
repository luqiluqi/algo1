package pl.sda.structure.server.request;

public abstract class Request {

    /**
     * Zwraca adres url żądania
     */
    public abstract void getRequestUrl();


    /**
     * Zwraca ty
     * @return
     */
    public abstract String getHttpType();

}
