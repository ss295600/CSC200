import java.util.Scanner;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import static java.lang.System.out;

public class main {

    public static void main(String[] args) {
        Scanner InputStream=null;
        PrintWriter WriteOutput,WriteToFile;

        try
        {
            InputStream=new Scanner(new FileInputStream("input.txt"));
        }
        catch(FileNotFoundException e)
        {
            out.println("File input.txt not found");
            out.println("or could not be opened.");
            System.exit(-1);
        }

        String fileLines;
        int numberOfEmails=0, trackEmails=0;
        char temp;
        while(InputStream.hasNextLine())
        {
            fileLines=InputStream.nextLine();
            for(int i=0;i<fileLines.length();i++)
            {
                temp=fileLines.charAt(i);
                if(temp=='@')
                    numberOfEmails++;   //count emails.
            }
        }

        //Create Email array with correct total of emails
        Email [] EmailArr=new Email[numberOfEmails];
        InputStream.close();
       try {
            InputStream=new Scanner(new FileInputStream("input.txt"));
        } catch (FileNotFoundException e) {
            out.println("File 'input.txt' not found");
            System.exit(-1);
        }
        String currentString, userName, domain, ext, department;
        while(InputStream.hasNext())    //Read Next String
        {

            //Read each string
            currentString=InputStream.next();

            //Check if String is an Email
            if(currentString.contains("@")&&!(currentString.endsWith("@"))&&!currentString.startsWith("@")&&currentString.contains("."))
            {
                String [] firstSplitArr = currentString.split("@");      //Split the Email string into 2
                //out.println("FirstSplitArray length is " + firstSplitArr.length);
                if(firstSplitArr.length>1&&!firstSplitArr[1].matches(".*\\d+.*"))
                {
                    String[] secondSplitArr = firstSplitArr[1].split("\\.");   //Split the right half of the Email using a dot delimiter. Double backslash required.

                    secondSplitArr[secondSplitArr.length - 1] = secondSplitArr[secondSplitArr.length - 1].replace(",", "");    //3 new strings if subdomain otherwise 2 new string
                    if (secondSplitArr.length == 3) {
                        userName = firstSplitArr[0];
                        department = secondSplitArr[0];
                        domain = secondSplitArr[1];
                        ext = secondSplitArr[2];
                        EmailArr[trackEmails++] = new UniversityEmail(userName, domain, ext, department);
                    } else if (secondSplitArr.length == 2) {
                        userName = firstSplitArr[0];
                        domain = secondSplitArr[0];
                        ext = secondSplitArr[1];
                        EmailArr[trackEmails++] = new Email(userName, domain, ext);
                    }
                }
            }
        }
        Email[] RealEmails=new Email[trackEmails];
        System.arraycopy(EmailArr,0,RealEmails,0,trackEmails);

        try{
            //WriteOutput= new PrintWriter(new FileOutputStream("AllEmails.txt"));
            WriteToFile= new PrintWriter(new FileOutputStream("out.txt"));
            Scanner readInput =new Scanner(System.in);
            out.print("Enter Email Code: ");
            int emailCode=readInput.nextInt();
                    if(emailCode==0) {
                        for (Email tempEmail : RealEmails) {
                            if (tempEmail.getCode() == 0) {
                                WriteToFile.println(tempEmail);
                            }
                        }
                    }
                    else if(emailCode>0 && emailCode<8)
                    {
                        for (Email tempEmail : RealEmails) {
                            if (tempEmail.getCode()==emailCode ) {
                                WriteToFile.println(tempEmail);
                            }
                        }
                    }
                    else if (emailCode == 8)
                    {
                        for (Email tempEmail : RealEmails) {
                            if (tempEmail.getCode()!=0 ) {
                                WriteToFile.println(tempEmail);
                            }
                        }
                    }
                    /*
            for(Email tempEmail: RealEmails)
            {
                WriteOutput.println(tempEmail);
            }
            WriteOutput.close();*/
            WriteToFile.close();
        }
        catch(FileNotFoundException x);public class Email {
    protected String username,domain,extension;

    public Email(){
        username=domain=extension=null;
    }
    public Email(String username,String domain, String ext) {
        this.username=username;
        this.domain=domain;
        this.extension=ext;
    }
    public int getCode(){
        return 0;
    }

    public String getUsername(){return username;}
    public String getDomain(){return domain;}
    public String getExt(){return extension;}

    public String toString()
    {
        return username + "@" + domain + "." +extension;
    }
}


class UniversityEmail extends Email {
    private String department;
    private int code;

    UniversityEmail() {
        super();
        department=null;
        code=0;
    }

    UniversityEmail(String department, int code) {
        this.department = department;
        this.code = code;
    }

    UniversityEmail(String a, String b, String c, String department) {
        super(a,b,c);
        this.department=department;
        assignCode();
    }

    private void assignCode() {
        if(department!=null)
        {
            switch(department){
                case "art":
                    code=1;
                    break;
                case "chee":
                    code=2;
                    break;
                case "chem":
                    code=3;
                    break;
                case "coe":
                    code=4;
                    break;
                case "cs":
                    code=5;
                    break;
                case "egr":
                    code=6;
                    break;
                case "polsci":
                    code=7;
                    break;
            }
        }
    }

    public int getCode(){
        return code;
    }

    public String toString()
    {
        return username + "@" + department + "." + domain + "." + extension;
    }
}
        {
            System.exit(-1);
        }

    }
}

Email.java

public class Email {
    protected String username,domain,extension;

    public Email(){
        username=domain=extension=null;
    }
    public Email(String username,String domain, String ext) {
        this.username=username;
        this.domain=domain;
        this.extension=ext;
    }
    public int getCode(){
        return 0;
    }

    public String getUsername(){return username;}
    public String getDomain(){return domain;}
    public String getExt(){return extension;}

    public String toString()
    {
        return username + "@" + domain + "." +extension;
    }
}


class UniversityEmail extends Email {
    private String department;
    private int code;

    UniversityEmail() {
        super();
        department=null;
        code=0;
    }

    UniversityEmail(String department, int code) {
        this.department = department;
        this.code = code;
    }

    UniversityEmail(String a, String b, String c, String department) {
        super(a,b,c);
        this.department=department;
        assignCode();
    }

    private void assignCode() {
        if(department!=null)
        {
            switch(department){
                case "art":
                    code=1;
                    break;
                case "chee":
                    code=2;
                    break;
                case "chem":
                    code=3;
                    break;
                case "coe":
                    code=4;
                    break;
                case "cs":
                    code=5;
                    break;
                case "egr":
                    code=6;
                    break;
                case "polsci":
                    code=7;
                    break;
            }
        }
    }

    public int getCode(){
        return code;
    }

    public String toString()
    {
        return username + "@" + department + "." + domain + "." + extension;
    }
}