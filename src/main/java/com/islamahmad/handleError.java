package com.islamahmad;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class handleError {
    // receives the errored request and returns an HTML page with error description

    public handleError(HttpServletResponse resp) throws IOException {
        System.out.println("Error Handled");
    }
}
