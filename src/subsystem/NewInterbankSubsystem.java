package subsystem;

import common.exception.PaymentException;
import common.exception.UnrecognizedException;
import entity.payment.CreditCard;
import entity.payment.PaymentTransaction;

/**
 * @author Dao Nguyen - 20183879
 */
public class NewInterbankSubsystem implements InterbankInterface {
    @Override
    public PaymentTransaction payOrder(CreditCard card, int amount, String contents) throws PaymentException, UnrecognizedException {
        return null;
    }

    @Override
    public PaymentTransaction refund(CreditCard card, int amount, String contents) throws PaymentException, UnrecognizedException {
        return null;
    }
}
