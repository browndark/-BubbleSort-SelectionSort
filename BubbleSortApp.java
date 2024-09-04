import java.util.Scanner;

public class BubbleSortApp {
        public static void main(String[] args) {
            System.out.println("=============================================================");
            System.out.println("Professor: Ricardo");
            System.out.println("Aluno:Bruno Custodio de Castro Silva");
            System.out.println("=============================================================");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Informe o tamanho do vetor: ");
            int tamanho = scanner.nextInt();
            int[] vetor = new int[tamanho];
            System.out.println("Informe os valores do vetor:");
            for (int i = 0; i < tamanho; i++) {
                vetor[i] = scanner.nextInt();
            }

            bubbleSort(vetor);
            scanner.close();
        }

        public static void bubbleSort(int[] vetor) {
            int n = vetor.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - 1 - i; j++) {
                    if (vetor[j] > vetor[j + 1]) {
                        // Troca os elementos
                        int temp = vetor[j];
                        vetor[j] = vetor[j + 1];
                        vetor[j + 1] = temp;
                    }
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

