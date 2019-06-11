/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testIRIndonesian;

import model.Document;
import model.InvertedIndex;

/**
 *
 * @author admin
 */
public class TestIndonesianIR1 {

    public static void main(String[] args) {
        // seting dokumen
        Document doc1 = new Document(1, "Fahri Hamzah Usul Ibu Kota Pindah ke Kepulauan Seribu Kompas.com - 07/05/2019, 11:19 WIB \n"
                + "Fahri Hamzah Fahri Hamzah(KOMPAS.com/Haryantipuspasari) JAKARTA, KOMPAS.com - Wakil Ketua DPR RI Fahri Hamzah mengusulkan agar ibu kota dipindahkan ke Kepulauan Seribu dengan mempertimbangkan konsep maritim dan jarak yang tidak terlalu jauh dari Jakarta. Fahri Hamzah, setelah hadir dalam acara buka puasa bersama Presiden Jokowi dengan pimpinan lembaga negara di Istana Negara Jakarta, Senin (6/5/2019), mengatakan, jika pemerintah serius untuk memindahkan ibu kota maka sebaiknya menggunakan konsep maritim. “Tapi kalau serius saya bilang, tadi saya ngomong juga sama Menteri Bappenas, pakailah konsep maritim. Justru ibu kota itu dipindahkan ke pinggir. Maka saya mengusulkan dipilihlah seperti Pulau Seribu,” kata Fahri, dikutip dari Antara. Baca juga: Lobi-lobi Pemindahan Ibu Kota di Forum Buka Puasa... Menurut dia, hal itu lebih masuk akal sebagai upaya Indonesia yang akan mendalami konsepsi negara maritim sehingga lebih baik jika memakai kepulauan sebagai konsep ibu kota. Fahri juga tak sepakat menyebut pindah ibu kota namun selayaknya mencontoh Malaysia yang mengembangkan Putra Jaya sebagai kantor pemerintahan baru. “Apalagi di Teluk Jakarta itu kan ada tanah reklamasi yang statusnya mengambang kan, harusnya itu diselesaikan oleh pemerintah lalu dijadikan bagian pengembangan wilayah baru di pesisir, karena kita menganut konsep negara maritim, itu yang saya bilang, tadi saya bilang juga,” katanya. Baca juga: Bappenas: Porsi APBN Kecil dalam Pembangunan Ibu Kota Baru, Lebih Banyak Swasta Dengan begitu, pemindahan tak perlu jauh-jauh dari Jakarta yang disebutnya bisa menelan ongkos lebih mahal. Fahri menyatakan pendapatnya bahwa penetapan Jakarta sebagai ibu kota merupakan peninggalan Bung Karno. “Jadi konsep DKI itu mengikuti Washington DC sebetulnya. Makanya kalau kita membaca luas distrik Kolombia itu kan cuma 16x10 kilometer. Dan kalau kita tarik gedung DPR sampai ke sini kan lebih kurang 10 kilometer, jadi sebenarnya sudah merupakan konsep Bung Karno tentang ibu kota, apalagi yang mau kita ubah. Tapi kalau mau bikin kantor silakan cari dekat-dekat sini,” katanya. Baca juga: Wali Kota Parepare Prediksi Kotanya Jadi Ibu Kota Baru Sejak 2 Tahun Lalu Maka ia pun mengusulkan lokasi yang dekat dengan Jakarta. “Usul saya mumpung ini ada konsep maritim pindahin saja ke pinggir dekat-dekat Pulau Seribu,” katanya. EditorDiamanty Meiliana SumberAntara\n"
                + "\n"
                + "Artikel ini telah tayang di Kompas.com dengan judul \"Fahri Hamzah Usul Ibu Kota Pindah ke Kepulauan Seribu\", https://nasional.kompas.com/read/2019/05/07/11194971/fahri-hamzah-usul-ibu-kota-pindah-ke-kepulauan-seribu.\n"
                + "\n"
                + "Editor : Diamanty Meiliana");
        Document doc2 = new Document(2, "Gaya Nyentrik Menteri Susi Saat Pimpin Penenggelaman 13 Kapal Vietnam di Kalbar Kontributor Pontianak, Hendra Cipta Kompas.com - 06/05/2019, 11:15 WIB \n"
                + "Menteri Kelautan dan Perikanan Susi Pudjiastuti melihat penenggelaman 13 kapal nelayan pencuri ikan di Pulau Datuk, Kabupaten Mempawah, Kalimantan Barat, Sabtu (4/5/2019) Menteri Kelautan dan Perikanan Susi Pudjiastuti melihat penenggelaman 13 kapal nelayan pencuri ikan di Pulau Datuk, Kabupaten Mempawah, Kalimantan Barat, Sabtu (4/5/2019)(dok Kementerian Kelautan dan Perikanan ) PONTIANAK, KOMPAS.com - Menteri Kelautan dan Perikanan Susi Pudjiastuti memimpin langsung penenggelaman 13 kapal pencuri ikan di Pulau Datuk, Kabupaten Mempawah, Kalimantan Barat, Sabtu (4/5/2019) lalu. Di balik aksinya yang gagah menenggelamkan kapal asing pelaku illegal fishing untuk menegakkan martabat bangsa, terdapat sejumlah aksi nyentrik yang tak luput dari bidikan kamera. Pantauan Kompas.com, Menteri Susi tiba di Stasiun Pengawasan Sumber Daya Kelautan dan Perikanan (PSDKP) Pontianak sekitar pukul 08.30 WIB, dengan mengenakan baju lengan panjang warga biru hitam dibalut jaket biru. Tak ketinggalan aksesori kacamata hitam, anting bulat besar, rambut dijepit dan scarf bercorak putih biru di lehernya. Baca juga: Menteri Susi Pimpin Langsung Penenggelaman 13 Kapal Vietnam di Kalimantan Barat Menteri Susi kemudian mengikuti serangkaian acara seremonial berupa penyampaian kata sambutan dan simulasi pembakaran barang bukti isi kapal pencuri ikan di Stasiun PSDKP Pontianak. Lalu sekitar pukul 09.50 WIB, Menteri Susi bersama rombongan naik ke kapal yang disediakan untuk menuju Pulau Datuk. Setidaknya ada tiga kapal yang disediakan untuk mengangkut rombongan serta dua kapal patroli, masing-masing milik PSDK Pontianak dan TNI Angkatan Laut. Satu kapal berisi rombongan termasuk Menteri Susi dan sejumlah pejabat daerah. Sementara dua kapal lain diisi masing-masing kameramen dan fotografer. Baca juga: 5 Fakta Kapal TNI AL Ditabrak Kapal Vietnam di Natuna, Susi Janji Tenggelamkan Lebih Banyak Kapal Vietnam hingga Anggota TNI Tak Terprovokasi Duduk di haluan kapal Waktu tempuh perjalanan laut dari dermaga PSDKP Pontianak ke perairan Pulau Datuk mencapai 3 jam lamanya. Sekitar pukul 13.10 WIB, seluruh kapal telah tiba di perairan Pulau Datuk. Menteri Susi yang kini telah berganti pakaian dengan kaos biru lengan panjang dibalut cardigan hitam, celana kain hitam dan sepatu sneakers telah 'nongkrong' di haluan kapal. Di belakangnya tampak sejumlah pejabat daerah seperti Gubernur Kalbar Sutarmidji, Kepala Kejaksaan Tinggi Kalimantan Barat Baginda Polin Lumban Gaol; Kapolda Kalimantan Barat (Pol) Didi Haryono; dan Danlantamal XII Pontianak Laksamana Pertama TNI Greg Agung. Saat kapal pencuri ikan satu per satu ditenggelamkan, Susi tampak kegirangan sambil mengangkat tangan terkepal. Sesekali dia juga terlihat memberi komando kepada anggotanya. Baca juga: Menteri Susi Tak Setuju Kapal Nelayan Asing Dilelang, Ini Alasannya Pesan untuk dunia Sebagaimana diketahui, Menteri Susi semakin menjadi sorotan saat nekat meledakkan kapal pencuri ikan di perairan Indonesia, sesaat setelah dia dilantik Oktober 2014. Sejak saat itu, sampai sekarang, sudah 503 kapal pencuri ikan yang karam di \"tangan\" Susi. Jumlah tersebut terdiri dari 284 kapal Vietnam, 92 kapal Filipina, 23 kapal Thailand, 73 kapal Malaysia, 2 kapal Papua Nugini, 1 kapal RRT, 1 kapal Nigeria, 1 kapal Belize, dan 26 kapal Indonesia. Ya, dulu memang diledakkan menggunakan dinamit. Sekarang hanya ditenggelamkan. Menurut Susi, peledakan atau penenggelaman hanya soal teknis, yang paling penting adalah memberikan sinyal pada dunia, Indonesia tak main-main soal aksi illegal fishing. \"Ya memang, sudah beberapa kali kita tenggelamkam dengan melubangi bawah kapal. Dulu diledakkan. Sama saja, itu kan hanya soal teknis,\" kata Susi, usai penenggelaman 13 kapal nelayan Vietnam di Pulau Datuk, Kabupaten Mempawah, Kalimantan Barat, Sabtu (4/5/2019). Baca juga: Menteri Susi Sebut Penenggelaman Kapal Asing Tingkatkan Stok Ikan 100 Persen Pastikan hukum berjalan Menurut dia, kehadirannya dalam prosesi penenggelaman kapal tersebut untuk memastikan kapal tersebut benar-benar ditenggelamkan. \"Kita pernah menemukan kapal yang pernah ditangkap itu ditangkap lagi,\" ucapnya. Selain itu, dia juga ingin bertemu para penegak hukum di Kalbar dan memastikan perkara ini dtangani dengan baik. \"Saat ini masih ada 90 kapal asing yang belum inkracht. Ada yang dalam proses banding, ada yang kasasi,\" ujarnya. Dia harap, putusan ke-90 kapal itu nantinya dimenangkan negara, agar dapat segera ditenggelamkan. Baca juga: Video Lengkap Penenggelaman 13 Kapal Vietnam oleh Menteri Susi\n"
                + "\n"
                + "Artikel ini telah tayang di Kompas.com dengan judul \"Gaya Nyentrik Menteri Susi Saat Pimpin Penenggelaman 13 Kapal Vietnam di Kalbar\", https://regional.kompas.com/read/2019/05/06/11154061/gaya-nyentrik-menteri-susi-saat-pimpin-penenggelaman-13-kapal-vietnam-di?page=all.\n"
                + "Penulis : Kontributor Pontianak, Hendra Cipta\n"
                + "Editor : Aprillia Ika");
        Document doc3 = new Document(3, "TNI AL: KRI Tjiptadi-381 Diprovokasi Kapal Pengawas Ikan Vietnam Kompas.com - 29/04/2019, 06:06 WIB \n"
                + "Kapal patroli milik TNI Angkatan Laut (AL), KRI TOM-357 menangkap 4 kapal perikanan berbendera Vietnam, Minggu (24/2/2019) pukul 07.40 WIB. Kapal patroli milik TNI Angkatan Laut (AL), KRI TOM-357 menangkap 4 kapal perikanan berbendera Vietnam, Minggu (24/2/2019) pukul 07.40 WIB. (Dok KKP) JAKARTA, KOMPAS.com - Di media sosial belakangan ini beredar cuplikan video adegan insiden antara kapal sipil Vietnam dengan KRI Tjiptadi-381, kapal perang korvet TNI AL dari kelas Parchim. Dikutip dari Antara, Markas Besar Komando Armada I TNI AL memberi pernyataan resmi bahwa peristiwa itu benar terjadi di ZEE Indonesia dan ada aksi provokasi dari kapal berbendera Vietnam itu. Panglima Komando Armada I TNI AL Laksamana Muda TNI Yudo Margono, Minggu (28/4/2019), menyatakan, kejadian atau insiden itu terjadi pada pukul 14.45 WIB Sabtu (27/4), dan lokasi kejadian di Laut Natuna Utara, di dalam wilayah ZEE Indonesia. Baca juga: Polisi Sempat Dihadang Coast Guard Vietnam saat Amankan 2 Kapal Pencuri Ikan di Natuna Ia mengurai kronologi singkat kejadian itu, yaitu bermula saat KRI Tjiptadi-381 melaksanakan operasi penegakan hukum di ZEE Indonesia, tepatnya di Laut Natuna Utara terhadap kapal ikan asing berbendera Vietnam bernomor lambung BD 979. Kapal yang sedang mencuri ikan kemudian ditangkap komandan KRI Tjiptadi. Namun ternyata, kapal ikan tersebut dikawal kapal Pengawas Perikanan Vietnam. Kapal pengawal itu berusaha menghalangi proses penegakan hukum oleh personel TNI AL di KRI Tjiptadi-381, dengan cara memprovokasi hingga gangguan fisik dengan cara menabrakkan badan kapalnya ke KRI Tjiptadi-381. Baca juga: Diduga Curi Ikan di Laut Natuna, 2 Kapal Vietnam Ditangkap TNI AL Menurut Komando Armada I TNI AL, lokasi kejadian itu ada di wilayah ZEE nasional, sehingga tindakan penangkapan kapal ikan ilegal itu oleh KRI Tjiptadi-38 sudah benar dan sesuai prosedur. Namun pada sisi lain, pihak Vietnam juga mengklaim wilayah itu merupakan perairan Vietnam. Terkait tindakan KRI Tjiptadi-381 sudah benar dengan menahan diri itu, maka untuk meminimalisir adanya ketegangan atau insiden yang lebih buruk di antara kedua negara, kejadian/insiden tersebut akan diselesaikan melalui jalur resmi antar pemerintahan kedua negara, Indonesia dan Vietnam. Baca juga: Lagi, Dua Kapal Penangkap Ikan Asal Vietnam Ditangkap di Natuna Dinas Penerangan Komando Armada I TNI AL menyatakan, akibat dari provokasi kapal Pengawas Perikanan Vietnam bernomor lambung KN 264 dan KN 23 dengan cara menabrak lambung kiri KRI Tjiptadi-381 dan telah menghadang serta menabrak lambung kiri buritan kapal ikan ilegal bernomor lambung BD 979 yang sedang ditunda KRI Tjiptadi-381, kapal ikan ilegal Vietnam itu bocor dan tenggelam. Untuk selanjutnya, ABK kapal ikan ilegal Vietnam yang berjumlah 12 orang ditahan dan dibawa ke geladak KRI Tjiptadi-381, namun dua ABK yang berada di atas kapal ikan itu berhasil melompat ke laut dan ditolong salah satu kapal Pengawas Perikanan Vietnam. Selanjutnya ke-12 ABK kapal ikan ilegal Vietnam dibawa dan akan diserahkan ke Pangkalan TNI AL Ranai guna proses hukum selanjutnya. Baca juga: 2 Kapal Pemerintah Vietnam Tabrak KRI Tjiptadi-381 yang Sedang Patroli EditorDiamanty Meiliana SumberAntara\n"
                + "\n"
                + "Artikel ini telah tayang di Kompas.com dengan judul \"TNI AL: KRI Tjiptadi-381 Diprovokasi Kapal Pengawas Ikan Vietnam\", https://nasional.kompas.com/read/2019/04/29/06061651/tni-al-kri-tjiptadi-381-diprovokasi-kapal-pengawas-ikan-vietnam.\n"
                + "\n"
                + "Editor : Diamanty Meiliana");

        // buat object invertedIndex
        InvertedIndex index = new InvertedIndex();
        // lakukan stemming untuk semua dokumen
        doc1.IndonesiaStemming();
        doc2.IndonesiaStemming();
        doc3.IndonesiaStemming();
        System.out.println(doc1);
        // tmbahkan document ke index
        index.addNewDocument(doc1);
        index.addNewDocument(doc2);
        index.addNewDocument(doc3);
        // bikin dictionary
        index.makeDictionaryWithTermNumber();
    }
}
