public class ProductRating {
    public static void main(String[] args) {

        int[][] ratings = {
            {4, 5, 4},
            {3, 5, 3},
            {4, 5, 3},
            {1, 2, 1}
        };

        double[] avgCriteria = new double[3];
        double total;

        System.out.println("Rating\tProduct\tPackaging\tDelivery");

        // Display ratings
        for (int i = 0; i < ratings.length; i++) {
            System.out.print("Customer " + (i + 1) + "\t");
            for (int j = 0; j < ratings[i].length; j++) {
                System.out.print(ratings[i][j] + "\t\t");
            }
            System.out.println();
        }

        // Average per criterion
        System.out.print("\nAverage\t");
        for (int j = 0; j < 3; j++) {
            total = 0;
            for (int i = 0; i < 4; i++) {
                total += ratings[i][j];
            }
            avgCriteria[j] = total / 4;
            System.out.printf("%.2f\t\t", avgCriteria[j]);
        }

        // Average per customer
        System.out.println("\n");
        for (int i = 0; i < ratings.length; i++) {
            total = 0;
            for (int j = 0; j < ratings[i].length; j++) {
                total += ratings[i][j];
            }
            double avg = total / 3.0;
            System.out.printf("Customer %d provide the average rating %.2f\n", (i + 1), avg);
        }
    }
}
