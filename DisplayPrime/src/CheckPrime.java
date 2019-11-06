public class CheckPrime {
    public boolean checkPrime(int n){
        if (n<2) return false;
        for (int i = 0; i<n ; i++){
            if (n%i == 0)return false;
        }
        return true;
    }
}
