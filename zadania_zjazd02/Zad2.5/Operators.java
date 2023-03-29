class OperatorsXY {
    static class OperatorX {
        int x;

        public OperatorX(int x) {
            this.x = x;
        }
    }

    static class OperatorY {
        int y;

        public OperatorY(int y) {
            this.y = y;
        }
    }

    public void rownania(int x, int y) {
        OperatorX operatorX = new OperatorX(5);
        OperatorY operatorY = new OperatorY(10);

        System.out.println("x = " + operatorX.x);
        System.out.println("y = " + operatorY.y);

        operatorX.x++;
        System.out.println("++x = " + operatorX.x);
        System.out.println("y++ = " + operatorY.y);

        operatorY.y++;
        System.out.println("++x = " + operatorX.x);
        System.out.println("y++ = " + operatorY.y);

        System.out.println("-------------");
    }
}
class OperatorsWZ {
    static class OperatorW {
        double w;

        public OperatorW(double w) {
            this.w = w;
        }
    }

    static class OperatorZ {
        double z;

        public OperatorZ(double z) {
            this.z = z;
        }
    }
    public void rownania2(double w, double z) {
        OperatorW operatorW = new OperatorW(33.5);
        OperatorZ operatorZ = new OperatorZ(17.3);

        System.out.println("w = " + operatorW.w);
        System.out.println("z = " + operatorZ.z);
        System.out.println("w + z = " + (operatorW.w + operatorZ.z));
        System.out.println("w - z = " + (operatorW.w - operatorZ.z));
        System.out.printf("w * z = %.2f\n", (operatorW.w * operatorZ.z));
        System.out.printf("w / z = %.7f\n", (operatorW.w / operatorZ.z));
        System.out.println("w % z = " + (operatorW.w % operatorZ.z));

        System.out.println("-------------");
    }
}


    class OperatorM{
        int m;

        public OperatorM(int m){
            this.m = m;
        }
    }

    class OperatorsMNO {
        static class OperatorN {
            int n;

            public OperatorN(int n) {
                this.n = n;
            }
        }

        static class OperatorO {
            int o;

            public OperatorO(int o) {
                this.o = o;
            }
        }

        public void rownania3(int m, int n, int o) {
            OperatorM operatorM = new OperatorM(3);
            OperatorN operatorN = new OperatorN(17);
            OperatorO operatorO = new OperatorO(10);


            System.out.println("m = " + operatorM.m);
            System.out.println("n = " + operatorN.n);
            System.out.println("o = " + operatorO.o);
            System.out.println("\n");

            if(m<n){
                System.out.print("m < n = ");
                System.out.println(true);
            }else {
                System.out.print("m < n = ");
                System.out.println(false);
            }
            if(m > o ){
                System.out.print("m > o = ");
                System.out.println(true);
            }else {
                System.out.print("m > o = ");
                System.out.println(false);
            }
            if(n <= o){
                System.out.print("n ≤ o = ");
                System.out.println(true);
            }else {
                System.out.print("n ≤ o = ");
                System.out.println(false);
            }
            if(m>=n){
                System.out.print("m ≥ n = ");
                System.out.println(true);
            }else {
                System.out.print("m ≥ n = ");
                System.out.println(false);
            }
            if(n==o){
                System.out.print("n = o =");
                System.out.println(true);
            }else {
                System.out.print("n = o = ");
                System.out.println(false);
            }
            if(m!=o){
                System.out.print("m ≠ o = ");
                System.out.println(true);
            }else {
                System.out.println("m ≠ o = ");
                System.out.println(false);
            }
            System.out.println("-------------");
        }
    }


