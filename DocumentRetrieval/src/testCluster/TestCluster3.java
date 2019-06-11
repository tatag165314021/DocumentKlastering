package testCluster;

import java.io.File;
import model.InvertedIndex;

public class TestCluster3 {

    public static void main(String[] args) {
        InvertedIndex index = new InvertedIndex();
        File file = new File("Lagu");
        index.readDirectory(file);
        index.preClustering();
        index.clustering();
        for (int i = 0; i < index.getListOfCluster().size(); i++) {
            System.out.println("cluster = " + i + ", Pusat Centroid = " + index.getListOfCluster().get(i).getCenter().getJudul());
            for (int j = 0; j < index.getListOfCluster().get(i).getMember().size(); j++) {
                System.out.println(index.getListOfCluster().get(i).getMember().get(j).getJudul());
            }
            System.out.println("===============================================================");
        }
    }

}
