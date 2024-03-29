class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
        if(num == 0){
            return steps;
        }
        if(num % 2 == 0){
            steps += numberOfSteps(num / 2);
        }
        else{
            steps += numberOfSteps(num - 1);
        }
        steps ++;
        return steps;
    }
}