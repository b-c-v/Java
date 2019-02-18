package com.bcv.finalProject.Exceptions;

public class UnsupportedException extends Exception {
    /*экспепшн можно добавить к JSpinner
     * method double "Name" (parameters) throws UnsupportedException {
     * if ("variable"<=0){
     * return throw new UnsupportedException();
     * else
     * */
    public UnsupportedException() {
        super("Enter a positive number");
    }
}
