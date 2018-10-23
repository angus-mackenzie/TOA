GCD(m, n){
    if(n==0){
        return m;
    }
    return GCD(n,m%n);
}
