package com.chrisThomps;

public class RotateImage {

    public int[][] rotateImage(int[][] img){

//        RotateImage rotateImage = new RotateImage();
//        int[][] image = new int[][]{{1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}};
//
//        int[][]rImag = rotateImage.rotateImage(image);
//
//        for(int[] elem : rImag){
//            for(int i = 0; i < rImag.length; i++){
//                System.out.print(elem[i] + " ");
//            }
//            System.out.println();
//        }

        int n = img.length;
        int[][]matrix = new int[n][n];

        for(int i = 0; i < img.length; i++){
            for(int j = 0; j < img.length; j++){
                matrix[i][j] = img[n-j-1][i];
            }
        }

        return matrix;
    }
}
