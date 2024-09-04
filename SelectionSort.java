import java.util.Scanner;

public class SelectionSort {
        public static void main(String[] args) {
            System.out.println("==============================================");
            System.out.println("Aluno:Bruno Custodio de Castro Silva");
            System.out.println("Professor: Ricardo");
            System.out.println("==============================================");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Informe o tamanho do vetor: ");
            int tamanho = scanner.nextInt();
            int[] vetor = new int[tamanho];
            System.out.println("Informe os valores do vetor:");
            for (int i = 0; i < tamanho; i++) {
                vetor[i] = scanner.nextInt();
            }

            selectionSort(vetor);
            scanner.close();
        }

        public static void selectionSort(int[] vetor) {
            int n = vetor.length;
            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < n; j++) {
                    if (vetor[j] < vetor[minIndex]) {
                        minIndex = j;
                    }
                }
                if (minIndex != i) {
                    int temp = vetor[i];
                    vetor[i] = vetor[minIndex];
                    vetor[minIndex] = temp;
                }
                System.out.println("Passagem " + (i + 1) + ": " + arrayToString(vetor));
            }
        }

        public static String arrayToString(int[] array) {
            StringBuilder sb = new StringBuilder();
            for (int num : array) {
                sb.append(num).append(" ");
            }
            return sb.toString().trim();
        }
    }



