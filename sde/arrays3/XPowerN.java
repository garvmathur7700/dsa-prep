class XPowerN {
    public double myPow(double x, int n) {
        if (n == 0) return 1.0;
        if (x == 0 || x == 1) return x;
        
        long N = n;
        if (N < 0) {
            N = -N;
            x = 1 / x;
        }
        
        double result = 1.0;
        while (N > 0) {
            if ((N & 1) == 0) { // if n is even
                // square the base
                x *= x;
                
                // half 'n'
                N /= 2;
            } else { // if 'n' is odd
                // multiply result and base
                result *= x;
                
                // square the base
                x *= x;
                
                // subtract one and half 'n'
                N /= 2;
            }
        }
        
        return result;
    }
}
