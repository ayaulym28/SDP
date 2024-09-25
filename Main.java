public class Main {
    public static void main(String[] args) {
        // Создаем экземпляры продуктов
        Product food = new FoodProduct(100);          // Продукт питания с ценой 100
        Product electronics = new ElectronicsProduct(200);  // Электроника с ценой 200
        Product clothing = new ClothingProduct(150);  // Одежда с ценой 150

        // Создаем объект калькулятора скидок
        DiscountCalculator calculator = new DiscountCalculator();

        // Вычисляем и выводим скидки для каждого продукта
        Printer.print("Скидка на продукты питания: " + calculator.calculateDiscount(food));           // Скидка на продукты
        Printer.print("Скидка на электронику: " + calculator.calculateDiscount(electronics)); // Скидка на электронику
        Printer.print("Скидка на одежду: " + calculator.calculateDiscount(clothing));    // Скидка на одежду
    }
}
