package complex;

class ComplexNumber<T extends Number> implements ArithmeticOperations<ComplexNumber<T>> {
    private T real;
    private T imaginary;

    public ComplexNumber(T real, T imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public T getReal() {
        return real;
    }

    public T getImaginary() {
        return imaginary;
    }

    @Override
    public ComplexNumber<T> add(ComplexNumber<T> other) {
        T newReal = addValues(this.getReal(), other.getReal());
        T newImaginary = addValues(this.getImaginary(), other.getImaginary());
        return new ComplexNumber<>(newReal, newImaginary);
    }

    @Override
    public ComplexNumber<T> subtract(ComplexNumber<T> other) {
        T newReal = subtractValues(this.getReal(), other.getReal());
        T newImaginary = subtractValues(this.getImaginary(), other.getImaginary());
        return new ComplexNumber<>(newReal, newImaginary);
    }

    @Override
    public ComplexNumber<T> multiply(ComplexNumber<T> other) {
        T newReal = getRealProduct(other);
        T newImaginary = getImaginaryProduct(other);
        return new ComplexNumber<>(newReal, newImaginary);
    }

    private T getRealProduct(ComplexNumber<T> other) {
        return subtractValues(multiplyValues(this.getReal(), other.getReal()), multiplyValues(this.getImaginary(), other.getImaginary()));
    }

    private T getImaginaryProduct(ComplexNumber<T> other) {
        return addValues(multiplyValues(this.getReal(), other.getImaginary()), multiplyValues(this.getImaginary(), other.getReal()));
    }

    private T addValues(T a, T b) {
        return (T) Double.valueOf(a.doubleValue() + b.doubleValue());
    }

    private T subtractValues(T a, T b) {
        return (T) Double.valueOf(a.doubleValue() - b.doubleValue());
    }

    private T multiplyValues(T a, T b) {
        return (T) Double.valueOf(a.doubleValue() * b.doubleValue());
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}