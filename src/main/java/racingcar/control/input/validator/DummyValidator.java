package racingcar.control.input.validator;

public class DummyValidator<T> implements Validator<T> {
    @Override
    public void verify(T value) {
        // do nothing
    }
}
