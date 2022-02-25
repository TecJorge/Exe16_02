import java.util.Arrays;

public class MyArray {
    private int[] array;

    MyArray(int[] array) {
        this.array = array;
    }

    public MyArray(int i, int i1, int i2, int i3, int i4) {

    }

    public int lenghtReturn() {
        return this.array.length;
    }

    public int BiggestReturn() {
        int x = 0;
        for (int a : this.array) {
            if (a > x) {
                x = a;
            }
        }
        return x;
    }

    public int NotNullReturn() {
        int x = 0;
        int[] test;
        test = this.array.clone();
        for (int i = 0; i < this.lenghtReturn(); i++) {
            if (test[i] != 0)
                x++;
        }
        return x;
    }

    public double calcMedia() {
        int x = this.NotNullReturn();
        int y = 0;
        for (int a : this.array) {
            y += a;
        }
        return (double) y / x;
    }

    public double calcMediaMult(int c) {
        int x = 0;
        int y = 0;
        for (int a : this.array) {
            if (a % c == 0) {
                x++;
                y += c;
            }
        }
        return (double) y / x;
    }

    public boolean isEmpty() {
        return (this.NotNullReturn() == 0);
    }

    public boolean onlyPair() {
        boolean ispair = true;
        for (int a : this.array) {
            if (a % 2 != 0) {
                ispair = false;
                break;
            }
        }
        return ispair;
    }

    public int[] onlyElemPair() {
        int[] Elempair = new int[4];
        int i = 0;
        for (int a : this.array) {
            while (a > 0) {
                if (a % 2 != 0)
                    break;
                else a = (int) (a * (Math.pow(10, -1)));
            }
            if (a == 0)
                Elempair[i] = this.array[i];
            i++;
        }
        return Elempair;
    }

    public int[] sameElem() {
        int[] Elempair = new int[4];
        int i = 0;
        for (int a : this.array) {
            int b = a % 10;
            while (a % 10 == b) {
                if (a % 10 == b) {
                    a = (int) (a * (Math.pow(10, -1)));
                }
                if (a == b)
                    Elempair[i] = this.array[i];

            }
            i++;
        }return Elempair;
    }
    public int[] crescElem() {
        int[] Elempair = new int[5];
        int i = 0,c=0;
        for (int a : this.array) {
                if (c<a){
                    Elempair[i] = this.array[i];
                c=a;}
            i++;
        }return Elempair;
    }
    public boolean sameContent(MyArray o) {
        return (this.equals(o));
    }

    public int[] reverseArray() {
        whu
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyArray myArray = (MyArray) o;
        return Arrays.equals(array, myArray.array);
    }

}





