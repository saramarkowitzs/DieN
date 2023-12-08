public class DieN
{
  private int value;
  private int n;
  private int sides;
  public DieN(int sides) {
    this.n = n;
    this.roll();
  }
  public int getValue() {
    return value;
  }
  public void roll() {
    this.value = (int)(Math.random() * n) + 1;
  }
  public int rollAndGetValue() {
    roll();
    return getValue();
  }

}

