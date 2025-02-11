package com.gentech.polymorphismdemo;
interface Price
{
    void priceOfMealsIs();
}
class OneStarHotel implements Price
{

    @Override
    public void priceOfMealsIs() {
        System.out.println("Price of meals at 1Star Hotel is 70.0");
    }
}
class TwoStarHotel implements Price
{

    @Override
    public void priceOfMealsIs() {
        System.out.println("Price of the meals at 2Star Hotel  is 120.0 ");
    }
}
class ThreeStarHotel implements Price
{

    @Override
    public void priceOfMealsIs() {
        System.out.println("Price of the meals at 3Star hotel is 199.00");
    }
}
class FourStarHotel implements Price
{

    @Override
    public void priceOfMealsIs() {
        System.out.println("Price of the meals at 4Star hotel is 399.00");
    }
}
public class PriceOfMeals {
    public static void main(String[] args) {
        OneStarHotel one = new OneStarHotel();
        TwoStarHotel two = new TwoStarHotel();
        ThreeStarHotel three = new ThreeStarHotel();
        FourStarHotel four = new FourStarHotel();

        Price price;

        price=one;
        price.priceOfMealsIs();;

        price=two;
        price.priceOfMealsIs();

        price=three;
        price.priceOfMealsIs();

        price=four;
        price.priceOfMealsIs();
    }
}
