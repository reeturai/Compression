/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.Compression;

import java.util.Scanner;


public class program {

   
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter thr string you want to compress");
        String ch=in.next();
        
        String output="";
        char prev='0';//this is empty
        int count=0;
        for(int i=0;i<ch.length();i++){
            if(prev=='0'){
                prev=ch.charAt(i);
                count=1;}
            else if(prev!=ch.charAt(i)){
                output=output.concat(count+String.valueOf(prev));
                prev=ch.charAt(i);
                count=1;}
            else
                count++;
            if(i==ch.length()-1){
                output=output.concat(count+String.valueOf(prev));
            } }System.out.println(output);
    }
    
}
