package com.example.verinter;

public class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData(); // Calls the API (will be mocked in test)
    }
}
