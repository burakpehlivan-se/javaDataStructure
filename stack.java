import java.util.Stack; // Stack fonksiyonlarını kullanmak için import etmemiz lazım

public class Main {
    public static void main(String[] args) {
        /*
         * Stack oluşturma
         * Stack yapsısı oluşturulurken ön tanımlı olarak gelen "Stack" classının nesnesini oluşturmamız gerekir.
         * Stack<veriTipi> stackAdı = new Stack<>();
         * Yapısı kullanılır. stackde tutulacak verinin tipinin önceden verilmesi gerekir.
         */
        Stack<String> stack1 = new Stack<>();

        /*
        Stack yapısında fonksiyonlar oluşturduğumuz stack nesnesinin ismi kullanılarak yazılır.
        Örneğin stack1 yapısında pop fonksiyonunu kullanmak istersek stack1.pop() şeklinde kullanırız.
        Stack Fonksiyonları:
            push(parametre) -> push fonksiyonu parametre olarak aldığı veriyi stack yapısının en üstüne ekler.
            pop() -> stack'in en üstündeki veriyi siler.
            peek() -> Stack'in en üstündeki veriyi tutar. peek fonksiyonu sayesinde en üstteki veri bir değişkene verilebilir.
            empty() -> Stack'in boş olup olmadığını kontrol eder. Boşsa true, boş değilse false döndürür (boolean).
            search(parametre) -> parametre olarak aldığı verinin stack'de olup olmadığını kontrol eder.
                Eğer bulunuyor ise aradığımız verinin en üstten başlayarak sayıldığındaki sırasını verir.
        */


        // push
        stack1.push("Yüzük Kardeşliği");
        stack1.push("İki Kule");
        stack1.push("Kralın Dönüşü");
        System.out.println(stack1);  // [Yüzük Kardeşliği, İki Kule, Kralın Dönüşü]
        stack1.push("Hobbit");
        System.out.println(stack1);  // [Yüzük Kardeşliği, İki Kule, Kralın Dönüşü, Hobbit]
        System.out.println(stack1.get(0)); // Yüzük Kardeşliği

        // pop
        stack1.pop();
        System.out.println(stack1);  // [Yüzük Kardeşliği, İki Kule, Kralın Dönüşü]

        // peek
        String ilkVeri = stack1.peek();
        System.out.println(ilkVeri); // Kralın Dönüşü

        // search
        System.out.println(stack1.search("Yüzük Kardeşliği")); // 3 -> en sondaki veriden saymaya başlandığında "Yüzük Kardeşliği" nin sırası

        // empty
        System.out.println(stack1.empty()); // false
        while (stack1.isEmpty() == false){
            stack1.pop();
        }
        System.out.println(stack1.empty()); // true  
    }
}
