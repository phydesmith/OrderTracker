package io.javasmithy.order;

public class Order {

    public static class OrderBuilder{
        private String firstName;
        private String lastName;
        private String cemeteryName;
        private String dealerName;
        private String dateEntered;
        private String dateCut;
        private String notes;
        private boolean stencilCut;

        public OrderBuilder(){}

        public OrderBuilder withFirstName(String fName){
            this.firstName = fName;
            return this;
        }
        public OrderBuilder withLastName(String lName){
            this.lastName = lName;
            return this;
        }
        public OrderBuilder withCemeteryName(String cemeteryName){
            this.cemeteryName = cemeteryName;
            return this;
        }
        public OrderBuilder withDealerName(String dealerName){
            this.dealerName = dealerName;
            return this;
        }
        public OrderBuilder withDateEntered(String dateEntered){
            this.dateEntered = dateEntered;
            return this;
        }
        public OrderBuilder withDateCut(String dateCut){
            this.dateCut = dateCut;
            return this;
        }
        public OrderBuilder addNotes(String notes){
            this.notes = notes;
            return this;
        }
        public OrderBuilder setStencilCut(boolean isCut){
            this.stencilCut = isCut;
            return this;
        }

        public Order build(){
            Order order = new Order();
            order.firstName = this.firstName;
            return order;
        }

    }

    private String firstName;
    private String lastName;
    private String cemeteryName;
    private String dealerName;
    private String dateEntered;
    private String dateCut;
    private String notes;
    private boolean stencilCut;

    private Order(){}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCemeteryName() {
        return cemeteryName;
    }

    public void setCemeteryName(String cemeteryName) {
        this.cemeteryName = cemeteryName;
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public String getDateEntered() {
        return dateEntered;
    }

    public void setDateEntered(String dateEntered) {
        this.dateEntered = dateEntered;
    }

    public String getDateCut() {
        return dateCut;
    }

    public void setDateCut(String dateCut) {
        this.dateCut = dateCut;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public boolean isStencilCut() {
        return stencilCut;
    }

    public void setStencilCut(boolean stencilCut) {
        this.stencilCut = stencilCut;
    }

    public String getName(){
        return this.firstName;
    }

    public String toString(){
        String str = "";

        return str;
    }
}
