package com.onimaskesi.motorrehberi

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var titleArray = ArrayList<String>()
        titleArray.add("Touring – Sport Touring – Uzun Yol, Tur Motosikleti")
        titleArray.add("Enduro – Arazi ve Asfalt Motosikleti")
        titleArray.add("Cruiser – Amerikan Uzun Yol Motosikleti / Chopper / Custom")
        titleArray.add("Racing Supersport – Yarış Motosikleti")
        titleArray.add("Street – Cadde Motosikleti")

        var textArray = ArrayList<String>()
        textArray.add("Uzun mesafeleri rahatça ve kolayca katedebilmeniz için dizayn edilmiştir. Uzun asfalt yolculukları için yapılmıştır. Motosiklet yere yakındır. Sürücünün uzun yolculuk yapabilmesi için konforludur. Ağır bir motosiklettir. Eşya taşımak için idealdir.Yere yakın olduğu için bozuk yollar için uygun değildir. Şehir içi kullanımında fazla yer kapladığı için problem yaşayabilirsiniz. Sürüşte rahat olabilmeniz için oldukça teknolojiden yararlanılmıştır. Bundan dolayı herhangi bir arıza durumunda çokça ücret ödemeniz olasıdır. Büyük rüzgar kesici ön cam ve radyo yada GPS yön bulma sistemleri bulunur. \n Örnek olarak; Honda – Goldwing, Honda Pan European, BMW R 1200 RT, BMW K 1600 GTL")
        textArray.add("Enduro’nun kelime anlamı dayanıklılıktır. Hem asfalt hemde yol olmayan yerlerde kullanıma uygundur. Oturuşu en rahat türlerden biridir ve görüşü açıktır. Tahmin ettiğiniz üzere yerden yüksektir. Bazı motorların sele yüksekliği 88-90 cm’e kadar çıkmaktadır. Ayakta kullanılmaya uygun olması gerektiği için kullanışlıdır.Ağırlığı fazla olduğundan kısa boylulara tavsiye etmeyiz. Güvenlik donanımları üst seviyededir. Motor olarak beygir gücünden ziyada daha çok tork (dönme momenti) ağırlıklıdırlar. Yani Hızlanma ivmesi yüksektir. Doğasal etkenlere yani suya, çamura, darbeye dayanıklıdırlar. Sağına, soluna, arkasına takabileceğiniz çantalarla çok rahat uzun yolculuk yapabilirsiniz fakat artçınız için aynı şeyi söyleyemeyiz.Zorlu yollarda sürüşler yapıldığı için sık sık bakım isteyen bir motordur. Enduroların motor hacmi 125cc`den başlayıp, 1000cc`ye kadar çıkabilir. Son süratleri ise 240 km/s`ye kadar ulaşabilir. sağlam motokroslarla uzun-mesafe touring motorlarının bir karışımıdır. Crosslar kadar kötü arazilerde yol gidemesede bozuk yollarda rahatlıkla gidebilir.\nÖrnek olarak; Safkan Endurolar – Yamaha’nın Xt serisi Kawasaki’nin Wr serisi")
        textArray.add("Amerika’da ortaya çıkmıştır ve sonrasında zaman geçtikçe Dünya’ya yayılmıştır. Yüksek yakıt tüketimleri vardır ve uzun yol için oturşunuz itibari ile pek rahat edeceğiniz bir motor türü değildir.marka ve modele göre tork ve beygir gücü eğrisi değişkenlik gösterir.Seri üretim halinde yani fabrikadan çıktığı gibi yollara dökülen motorlara cruiser motor diyoruz.  Cruiserlar daha “makul” chopper’lardır.  Bunların ön çatal açıları daha “normaldir” ve rahat sürüş için yaratılmışlardır.Motosiklet Türleri nden Custom motorlar, cruiser motorların eklenip çıkarılarak sürücünün zevkine ve isteğine göre özelleştirerek kendine yaptırdığı motorlara verilen addır.Chopper motorlar ise sürücünün motor daha yapım aşamasındayken yani fabrikadayken kendine göre yaptırdığı ve Dünya’da başka hiç kimsede bulunmayan yollardada çok nadir olarak görebileceğiniz motorlardandır. Kelimenin anlamı İngilizce’de ki chopping kesme biçme anlamından türemiştir. Bunlar, kendilerini uzun ön çatalları, geriye kaykılan oturma pozisyonu ve bol bol parlak kromajla belli ederler.Ülkemizde genelde bu üç kavram aynı kefeye konur.\n" +
                "\n" +
                "Bu motosiklet türünde tasarım ön plandadır. Motosikletinizi kendinize göre şekillendirmek istiyorsanız yine en uygun motor türüdür. Aynı zamanda aksesuar çeşitliliği de boldur. Viraj kabiletleri düşüktür. Fakat trafikteki saygısı gözle görülür derecededir.\n" +
                "\n" +
                "Yere çok yakındır. Her tip kullanıcı rahatça sürebilir. Sürüşü rahattır. Fiyat skalası oldukça geniştir. \nÖrnek olarak; Kawasaki’nin Vulcan, Yamaha Dragstar, Harley Davidson, Indian")
        textArray.add("Bu türler pist ve yarışmalar için üretilmiş fakat daha sonrasında kullanıcıya göre uyarlanmıştır. Motosiklet Türleri nden Oturuşu rahat değildir. Vücut ileriye doğru eğilir. Frenleme sistemi iyi çalışır.Yakıt tüketiminiz yüksek performanstan dolayı oldukça fazladır. Hızlanma performansı üst seviyededir. Yani tecrübesiz sürücülerin kullanmamasını öneririz. 600cc-1000 cc arasında değişirler. Modifiye etmek için uygundurlar. Yüksek güç üretirler ve oldukça ağırdırlar. Yüksek devirli motorları vardır ve dönüşleri hızlıdır.\nÖrnek olarak; Yamaha R serisi, Honda Cbr serisi, BMW S1000RR, Ducati Panigale, Honda CBR1000")
        textArray.add("Adındanda anlaşıldığı gibi şehiriçi asfaltlarda kullanım için üretilmiştir. Pozisyon olarak yarış motoruna yakın fakat bi tık daha dik bir konuma sahiptir. Kısa mesafer kullanımına uygun olduğu için rüzgar önleyici etkisi azdır ve çıplak şase üzerinde olurlar.\nÖrnek olarak; Ducati ve Monster, Diavel serisi")

        var gorselArray = ArrayList<Bitmap>()
        var a = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.a )
        var b = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.b )
        var c = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.c )
        var d = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.d )
        var e = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.e )

        gorselArray.add(a)
        gorselArray.add(b)
        gorselArray.add(c)
        gorselArray.add(d)
        gorselArray.add(e)

        val lm = LinearLayoutManager(this)
        recyclerView.layoutManager = lm
        val ra = RecyclerAdapter(titleArray, gorselArray , textArray)
        recyclerView.adapter = ra


    }
}
