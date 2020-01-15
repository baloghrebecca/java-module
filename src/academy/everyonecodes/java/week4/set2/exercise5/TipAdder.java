package academy.everyonecodes.java.week4.set2.exercise5;

public class TipAdder {

    public double tipper(double payment) {
        double paymentFivePercent = payment/100*5;
        double paymentPlusPercent = paymentFivePercent + payment;
        double paymentCeiled = Math.ceil(paymentPlusPercent);
        if ((paymentCeiled - paymentPlusPercent > 0.5)) {
            return paymentCeiled - 0.5;
        } else {
            return paymentCeiled;
        }
    }


}
