package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String userName="Patika",password="Java101";
        String inpUserName,inpPassword;
        System.out.print("Kullanıcı Adınız:");
        inpUserName=scanner.nextLine();

        System.out.print("Şifreniz:");
        inpPassword=scanner.nextLine();
        if(inpPassword.equals(password)&&inpUserName.equals(userName))
        {
            System.out.print("Giriş Başarılı!");
        }
        else
        {
            System.out.print("Giriş Başarısız!Şifre Değiştirmek İster misiniz?(y/n)");
            String cevap=scanner.nextLine();
            if(cevap.equals("y"))
            {
                inpPassword="";
                while(!inpPassword.equals(password))
                {
                    System.out.print(userName+" kullanıcısı için yeni şifreyi giriniz:");
                    inpPassword=scanner.nextLine();
                    if(!inpPassword.equals(password))
                    {
                        password=inpPassword;
                        System.out.print("Şifre oluşturuldu");
                    }
                    else
                       System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");

                }

            }
        }


    }
}