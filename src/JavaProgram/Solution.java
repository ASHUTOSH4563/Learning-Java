package JavaProgram;

import java.util.Scanner;

//class Solution {
//    public static int pos(int s,int n,int[] nums2){
//        for(int k=s;k<nums2.length;k++){
//            if(nums2[k]>n){
//                return nums2[k];
//            }
//        }
//        return -1;
//    }
//    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
//        int i,j;
//        for(i=0;i<nums1.length;i++){
//            for( j=0;j<nums2.length;j++){
//                if(nums1[i]==nums2[j]){
//                    nums1[i]=pos(j,nums1[i],nums2);
//                    break;
//                }
//            }
//        }
//        return nums1;
//    }
//    public static void main(String args[]){
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int arr[]=new int[n];
//        for(int i=0;i<n;i++) {
//            arr[i] = sc.nextInt();
//        }
//        nextGreaterElement(arr1)
//    }
//}