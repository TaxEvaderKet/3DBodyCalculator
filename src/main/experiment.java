package src.main;

class something {
    //hi
    //this is my experiment zone
    //have fun
    private static double mess = Math.asin(Math.abs(Math.pow(Math.PI,Math.floor(Math.random()*1000)+0)));
    public static double getMess(){
        return mess;
    }
    public static void main(String[] args) {
        System.out.println(getMess());
    }
}