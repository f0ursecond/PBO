
class Demo {

    public void tampil(int x) {
        System.out.println("In int" + x);
    }

    public void tampil(String s) {
        System.out.println("In String" + s);
    }

    public void tampil(byte b) {
        System.out.println("In byte" + b);
    }
}

class Sum {

    public static void main(String[] args) {
        byte a = 25;
        Demo obj = new Demo();
        obj.tampil(a);
        obj.tampil("A");
        obj.tampil(100);
        obj.tampil('A');
    }
}
