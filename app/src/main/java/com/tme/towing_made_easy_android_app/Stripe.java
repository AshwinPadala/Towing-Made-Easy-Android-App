package com.tme.towing_made_easy_android_app;
/**
 * Created by ashwi on 5/2/2016.
 */
public class Stripe {
    Card card = new Card(
            cardNumber,
            cardExpMonth,
            cardExpYear,
            cardCVC
    );

    card.validateNumber();
    card.validateCVC();
    Card card = new Card("4242-4242-4242-4242", 12, 2017, "123");

    if ( !card.validateCard() ) {
        // Show errors
    }
    Card card = new Card("4242424242424242", 12, 2017, "123");

    Stripe stripe = new Stripe("pk_test_ja9mbiJW0FGpbGRUsyOOEhVB");
    stripe.createToken(
    card,
            new TokenCallback() {
        public void onSuccess(Token token) {
            // Send token to your server
        }
    public void onError(Exception error) {
        // Show localized error message
        Toast.makeText(getContext(),
                error.getLocalizedString(getContext()),
                Toast.LENGTH_LONG
        ).show();
    }
}
)
}
