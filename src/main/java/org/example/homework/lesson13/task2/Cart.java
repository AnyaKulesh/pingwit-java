package org.example.homework.lesson13.task2;

public class Cart {
    private Product [] products;

    public Cart() {
        this.products = new Product[] {};
    }

    public void addProduct(Product product){
        Product [] newProducts = new Product[products.length +1]; // создаем массив на 1 элемент больше
        for(int i = 0; i < products.length; i++){ // переносим элементы из старого массива в новый
            newProducts[i] = products[i];
        }
        newProducts [products.length] = product; // добавляем в конец нового массива новый продукт
        products = newProducts; // перекидываем нашу ссылку на новый массив
    }
    public void removeProduct (Product product){
        if( containProduct(product)){ // проверяем, есть ли продукт в корзине
            Product [] newProducts = new Product[products.length - 1]; // создаем массив на 1 элемент меньше
            int j = 0; // свободный индекс в новом массиве
            for ( int i = 0; i < products.length; i++){ // переносим элементы из старого массива в новый (кроме того, что нужно удалить)
                if (!product.equals(products [i])){ // проверяем, текущий продукт, чтобы был не равен тому, что мы хотим удалить
                    newProducts[j] =products[i]; // переносим продукт из старого массива в новый
                    j++;
                }
            }
            products = newProducts; // перекидываем нашу ссылку на новый массив
        }
    }

    public boolean containProduct(Product product){
        for (Product item: products) {
            if(item.equals(product)){
                return true;
            }
        }
        return false;
    }

    public double getTotalPrice (){
        double price = 0;
        for (Product item : products){
            price += item.getPrice() * item.getQuantity();
        }
        return price;
    }

    public int getTotalQuantity(){
        int quantity = 0;
        for(Product item : products){
            quantity += item.getQuantity();
        }
        return quantity;
    }

    public void printCart(){
        for(Product item : products) {
            System.out.println(item);
        }
    }


}
