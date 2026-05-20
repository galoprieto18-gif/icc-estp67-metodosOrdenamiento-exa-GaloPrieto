package models;

public class CarYear {

  private int year;
  private boolean isVaild;

  public CarYear() {
  }

  public CarYear(int year, boolean isVaild) {
    this.year = year;
    this.isVaild = isVaild;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public boolean isVaild() {
    return isVaild;
  }

  public void setVaild(boolean isVaild) {
    this.isVaild = isVaild;
  }

  @Override
  public String toString() {
    return "CarYear [year=" + year + ", isVaild=" + isVaild + "]";
  }
}
