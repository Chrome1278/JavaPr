class ExceptionNum extends RuntimeException{
    public ExceptionNum(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }

}
