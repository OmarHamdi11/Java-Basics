import java.util.Scanner;

public class website{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String url;

        System.out.println("Enter Url : ");
        url = sc.nextLine();

        int colonIndex = url.indexOf(":");
        String protocol = url.substring(0 , colonIndex);

        int lastDotIndex = url.lastIndexOf(".");
        String ext = url.substring(lastDotIndex+1);


        if(protocol.equals("http")){
            System.out.println("Hyper text transfer protocol");
        }
        else if(protocol.equals("ftp")){
            System.out.println("file transfer protocol");
        }

        if(ext.equals("com")){
            System.out.println("Commercial");
        }
        else if(ext.equals("gov")){
            System.out.println("Government");
        }
        else if(ext.equals("net")){
            System.out.println("Network");
        }
        else if(ext.equals("org")){
            System.out.println("Organization");
        }

    }
}