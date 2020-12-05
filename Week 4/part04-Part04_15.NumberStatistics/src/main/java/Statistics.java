
public class Statistics {

    private int totalNum;
    private int totalSum;

    public Statistics() {
        this.totalNum = 0;
        this.totalSum = 0;
    }

    public void addNumber(int num) {
        this.totalNum++;
        this.totalSum += num;
    }

    public int getCount() {
        return this.totalNum;
    }

    public int sum() {
        return this.totalSum;
    }

    public double average() {
        if (totalSum > 0) {
            return this.totalSum / (double) this.totalNum;
        } else {
            return 0;
        }
    }
}
