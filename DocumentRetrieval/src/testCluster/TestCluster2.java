package testCluster;

import model.Document;
import model.InvertedIndex;

public class TestCluster2 {
    public static void main(String[] args) {
        Document doc1 = new Document(1, "Fahri Hamzah Usul Ibu Kota Pindah ke Kepulauan Seribu");
        Document doc2 = new Document(2, "Gaya Nyentrik Menteri Susi Saat Pimpin Penenggelaman 13 Kapal Vietnam di Kalbar");
        Document doc3 = new Document(3, "TNI AL: KRI Tjiptadi-381 Diprovokasi Kapal Pengawas Ikan Vietnam ");

        InvertedIndex index = new InvertedIndex();
        doc1.IndonesiaStemming();
        doc2.IndonesiaStemming();
        doc3.IndonesiaStemming();
        index.addNewDocument(doc1);
        index.addNewDocument(doc2);
        index.addNewDocument(doc3);
        index.makeDictionaryWithTermNumber();
        index.clustering();

        for (int i = 0; i < index.getListOfCluster().size(); i++) {
            System.out.println("cluster = " + i + ", center = " + index.getListOfCluster().get(i).getCenter().getId());
            for (int j = 0; j < index.getListOfCluster().get(i).getMember().size(); j++) {
                System.out.println(index.getListOfCluster().get(i).getMember().get(j).getJudul());
            }
        }
    }
   
}









