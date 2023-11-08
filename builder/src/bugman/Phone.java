package bugman;

public class Phone {
    private String cpu;
    private String screen;
    private String memory;
    private String name;

    private Phone(Builder builder) {
        this.name = builder.cpu;
        this.cpu = builder.cpu;
        this.memory = builder.memory;
        this.screen = builder.screen;
    }

    static class Builder {
        private String cpu;
        private String screen;
        private String memory;
        private String name;

        public Builder cpu(String cpu) {
            this.cpu =  cpu;
            return this;
        }

        public Builder screen(String screen) {
            this.screen = screen;
            return this;
        }

        public Builder memory(String memory) {
            this.memory = memory;
            return this;
        }

        public Builder name (String name){
            this.name = name;
            return this;
        }

        public Phone build() {
            return new Phone(this);
        }
    }

}
