package controllers;

import models.Brand;

public class BrandController {

  public Brand[] sortBubbleDesc(Brand[] brands) {
    // Ordenamiento de arreglo.
    for (int i = 0; i < brands.length; i++) {
      boolean swap = false;
      for (int j = 0; j < brands.length - i - 1; j++) {
        if (brands[j].getTotalVaildYears() < brands[j + 1].getTotalVaildYears()) {
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


  public Brand binarySetachByValidYeras(Brand [] brands, int validYears,boolean isAscending){
    
    //Implemento de busqueda para carros. 
    int bajo = 0;
    int alto = brands.length-1;
  

    while(bajo<=alto){
      int centro = (bajo + alto)/2;
      int valorCentral= brands [centro].getTotalVaildYears();
      if (valorCentral == validYears){
        return brands[centro];
      }
      if (isAscending){

        if( validYears > valorCentral){
          bajo = centro + 1;

       }else{
          alto = centro - 1;
        
        }

      }else{

        if( validYears < valorCentral){
          bajo = centro + 1;

        }else{
          alto = centro - 1;
        }

      }
    }
  return null;  
  }
}

   

  
