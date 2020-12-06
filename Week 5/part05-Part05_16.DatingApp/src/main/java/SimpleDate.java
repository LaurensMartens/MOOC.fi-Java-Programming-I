
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {
        this.advance(1);
    }

    public void advance(int howManyDays) {
        this.day = this.day + howManyDays;

        if (this.day > 30) {
            int remaining = this.day - 30;
            this.day = remaining;
            this.month++;
            
            if (this.month > 12) {
                this.year++;
                this.month = 1;
            }
        }
    }
    
    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate clone = new SimpleDate(this.day, this.month, this.year);
        clone.advance(days);
        
        return clone;
    }

}
