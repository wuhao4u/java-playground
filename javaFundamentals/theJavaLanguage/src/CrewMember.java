public class CrewMember {
    private FlightCrewJob job;

    public CrewMember(FlightCrewJob job) {
        this.job = job;
    }

    public FlightCrewJob getJob() {
        return job;
    }

    public void setJob(FlightCrewJob job) {
        this.job = job;
    }

    public static void main(String[] args) {
        CrewMember judy = new CrewMember(FlightCrewJob.CoPilot);

        judy.setJob(FlightCrewJob.Pilot);
    }
}
