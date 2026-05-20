package controllers;

import models.Brand;

public class BrandController {

  public Brand[] sortBubbleDesc(Brand[] brands) {
    // Ordenamiento de arreglo.
    for (int i = 0; i < brands.length - 1; i++) {
      boolean swap = false;
      for (int j = 0; j < brands.length - i - 1; j++) {
        if (brands[j].getTotalVaildYears() < (brands[j + 1].getTotalVaildYears())) {
          Brand temp = brands[j];
          brands[j] = brands[j + 1];
          brands[j + 1] = temp;
          swap = true;
        }

      }
      if (!swap) {
        break;
      }
    }
    return brands;
  }
}
