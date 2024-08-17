public class absVenba extends absKathir implements TrafficRules {
    // public static void main(String[] args) { /*code dual purpose if remove from
    // implements Traffic Rules used as normal absraction code */
    // absVenba venba = new absVenba();
    // venba.study();

    // }

    // public void study() {
    // System.out.println("Study Well");
    // }

    // }

    /* interface code starts from below */
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        absVenba venba = new absVenba();
        venba.study();
        venba.wearHelmet(); // TafficRules Class method
        System.out.println("Fine 1:" + " " + venba.fine); /*any one either class name venba can be give to view thefine amout or by interface name*/
        System.out.println("Fine 2:" + " " + TrafficRules.fine); /*any one either class name venba can be give to view the fine amout or by interface name */

    }

    @Override /*trafficRules method override add the my own rule in TrafficRule method only created here add msg sop*/
    public void wearHelmet() {
        System.out.println("WearHelmet while riding"); /* traffic rule defination given by veba */
    }

    @Override /*absvenda and abskathir has same method override add the my own rule in absvenda method only created here add msg sop*/
    public void study() {
        System.out.println("Study well"); /* parent study defination given by venba */
    }

}
