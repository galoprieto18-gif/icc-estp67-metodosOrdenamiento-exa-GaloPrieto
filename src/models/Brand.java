package models;


public class Brand {

  private String brandName;
  private CarModel[] carModels;

  public Brand() {
  }

  public Brand(String brandName, CarModel[] models) {
    this.brandName = brandName;
    this.carModels = models;
  }

  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  public CarModel[] getModels() {
    return carModels;
  }

  public void setModels(CarModel[] models) {
    this.carModels = models;
  }

  public int getTotalVaildYears() {
    int totalValidYears = 0;
    for (CarModel carModel : carModels) {
      for (CarYear carYear : carModel.getCarYears()){
        if (carYear.isVaild() ){
          totalValidYears++;
        }
    }
    
  }
  return totalValidYears;
}

  @Override
  public String toString() {
    return brandName + " -  Años válidos: " + getTotalVaildYears();
  }

}
