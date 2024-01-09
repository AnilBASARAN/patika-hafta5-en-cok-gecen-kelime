import java.util.*;
public class Main {

    public static void findTheMostCommon(String str){

        String [] wordsArray;
        HashMap<String,Integer> uniqueWords = new HashMap<>();

        String inputString = str;
        wordsArray = inputString.split(" ");

        for(int i = 0; i < wordsArray.length;i++){
            if(!uniqueWords.containsKey(wordsArray[i])){
                uniqueWords.put(wordsArray[i],1 );
            }else{
                uniqueWords.put(wordsArray[i], uniqueWords.get(wordsArray[i])+1 );
            }
        }
        int mostRepeatedTimes = 0;
        String mostRepeatedWord = "";

        for(int i = 0 ; i < uniqueWords.size();i++){
            if(uniqueWords.get(wordsArray[i])>mostRepeatedTimes){
                mostRepeatedTimes = uniqueWords.get(wordsArray[i]);
                mostRepeatedWord = wordsArray[i];
            }
        }
        System.out.println();
        System.out.println("En çok kullanılan kelime : "+ mostRepeatedWord+ " , " +mostRepeatedTimes + " kere metinde geçiyor");
        System.out.println();
        System.out.println("Metindeki kelimelerin hashmap ile metinde geçme sıklıklarıyla kaydedilmiş hali: ");
        System.out.println();
        System.out.println(uniqueWords.entrySet());

    }
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir metin giriniz:");
        String userInput = input.nextLine();

        findTheMostCommon(userInput);





       /* Pratik - En Çok Geçen Kelimeyi Bulma
        Soru: Kullanıcı tarafından girilen bir metinde en çok geçen kelimeyi bulup ekrana yazdıran bir Java projesi yazınız.


        Eğer araştırma yapmak isterseniz bu soruyu HashMap kullanarak çözebilirsiniz. HashMap kullanmak isterseniz aşağıdaki ipuçlarını kullanabilirsiniz.


        İpucu 1: Öncelikle, metni kelimelere ayırmanız gerekecek. Bu işlemi yapmak için `String` sınıfının `split` metodunu kullanabilirsiniz.


        İpucu 2: Kelimeleri saymak için bir veri yapısı kullanmanız gerekiyor. `HashMap` bunun için iyi bir seçenek olabilir.
        HashMap, key-value çiftlerini saklar. Burada key kelimeler, value ise o kelimenin metinde kaç kere geçtiği olabilir.


        İpucu 3: Kelimeleri döngüyle tek tek dolaşıp her birini `HashMap`'e ekleyin. Eğer kelime `HashMap`'de zaten varsa, count'u bir artırın.
         Eğer yoksa, kelimeyi `HashMap`'e ekleyip count'u 1 olarak belirleyin.


        İpucu 4: Son olarak, `HashMap`'i dolaşıp en yüksek count değerine sahip kelimeyi bulun. Bu kelime metinde en çok geçen kelime olacaktır.


        Bu ipuçlarına dayanarak, verilen bir metinde en çok geçen kelimeyi bulan bir Java projesi yazabilirsiniz. Bol şanslar!
*/
    }
}
