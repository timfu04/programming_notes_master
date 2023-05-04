package com.clementlee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@SpringBootApplication
@RestController
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/greet") // http://localhost:8080/greet
    public GreetResponse greet(){
        return new GreetResponse("Hello");
    }

//    record GreetResponse(String greet){}

    class GreetResponse{
        private final String greet;

        public GreetResponse(String greet) {
            this.greet = greet;
        }

        // must have this getter method to get the correct value of "greet" key in JSON response
        public String getGreet() {
            return greet;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            GreetResponse that = (GreetResponse) o;

            return Objects.equals(greet, that.greet);
        }

        @Override
        public int hashCode() {
            return greet != null ? greet.hashCode() : 0;
        }
    }

}