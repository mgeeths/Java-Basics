package StreamsBasics;

import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Stationeries {




    public static void main(String[] args) {

        ProductsSample hp = new ProductsSample(101,"HP Laptop", 500.35);
        ProductsSample lenova = new ProductsSample(201,"Lenova Laptop", 1500.56);
        ProductsSample dell = new ProductsSample(301,"Dell Laptop", 700.23);
        ProductsSample mac = new ProductsSample(401,"Mac Laptop", 2500.59);

        List<ProductsSample> allLaptops = Arrays.asList(hp,lenova,dell,mac);
        List<ProductsSample> highPricedLaptops = new ArrayList<>();

        allLaptops.stream().filter(prod -> prod.prodPrice>1000).forEach(prod -> System.out.println(prod.prodName));
        highPricedLaptops = allLaptops.stream().filter(prod -> prod.prodPrice>1000).collect(Collectors.toList());
    }


}
