public abstract class AFlight implements Flight
{

    String flightNumber;
    int totalPassengers;
    String airlineOfPlane;

    public void setFlightNumber(String flightNumber)
    {
        this.flightNumber = flightNumber;
    }

    public void setTotalPassengers(int totalPassengers)
    {
        this.totalPassengers = totalPassengers;
    }

    public void setAirlineOFPlane(String airlineOfPlane)
    {
        this.airlineOfPlane = airlineOfPlane;
    }



    public String getFlightNumber()
    {
        return this.flightNumber;
    }

    public int getTotalPassengers()
    {
        return this.totalPassengers;
    }

    public String getAirlineOfPlane()
    {
        return this.airlineOfPlane;
    }
}
