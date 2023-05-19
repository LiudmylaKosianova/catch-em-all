package com.rpam.rd.autotasks;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CatchEmAll {

    //You may set another exception in this field;
    static Exception exception = new FileNotFoundException();

    public static void riskyMethod() throws Exception {
        throw exception;
    }

    public static void main(String[] args) throws Exception {
        try {
            riskyMethod();
        }catch(FileNotFoundException aa){
            //throw new IllegalArgumentException(aa);
            throw new IllegalArgumentException("Resource is missing", aa);
        }catch (IOException a){
            //throw new IllegalArgumentException(a);
            throw new IllegalArgumentException("Resource error", a);
        }catch (ArithmeticException | NumberFormatException bb){
            System.err.println(bb.getMessage());
        }
    }
}
