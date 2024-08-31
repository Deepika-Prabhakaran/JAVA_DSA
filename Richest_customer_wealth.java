/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sneha
 */
//https://leetcode.com/problems/richest-customer-wealth/description/
public class Richest_customer_wealth {
    public static void main(String args[]){
        int[][] accounts={{1,5},{7,5},{3,5}};
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {
        int ans=Integer.MIN_VALUE;
        for (int[] person : accounts) {
            int rowsum=0;
            for (int account:person) {
                rowsum += account;
            }
            if(rowsum>ans){
                ans=rowsum;
            }
        }
        return ans;   
    }
}
