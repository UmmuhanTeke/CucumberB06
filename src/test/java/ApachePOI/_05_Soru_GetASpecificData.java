package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * Kullanıcı aşağıdaki excelde, 1.sutundaki bilgilerden istediğini girecek
 * karşılığında bu bilginin satırındaki karşılık gelen bilgilerin tamamı yazdırılacak.
 * yani metoda "Password" kelimesi gönderilecek, dönen değer Password un değeri olacak.
 * bulup ve sonucun döndürülmesi için metod kullanınız.
 * src/test/java/ApachePOI/resources/LoginData.xlsx
 */
public class _05_Soru_GetASpecificData {
    public static void main(String[] args) throws IOException {
        String path="src/test/java/ApachePOI/resource/LoginData.xlsx";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Requested word: ");
        String userResponse = scanner.nextLine();
        String returnedData=getFromExcell(userResponse, path);
        System.out.println("returnedData = " + returnedData);
    }

    private static String getFromExcell(String userResponse, String path) throws IOException {
        String returnData="";

        FileInputStream inputStream=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(0);

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {

            if (sheet.getRow(i).getCell(0).toString().equalsIgnoreCase(userResponse)){
                for (int j = 1; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {
                    returnData+=" "+ sheet.getRow(i).getCell(j);
                }
                break;
            }
        }
        return returnData;
    }
}


