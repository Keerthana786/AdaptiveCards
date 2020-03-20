package io.adaptivecards.renderer.inputhandler.validation;

public abstract class InputRegexValidator extends ActualValidator
{
    public InputRegexValidator(IInputValidator inputValidator) {
        super(inputValidator);
    }

    @Override
    public boolean isValid()
    {
        return super.isValid() && fulfillsRegex();
    }

    public abstract boolean fulfillsRegex();
}
