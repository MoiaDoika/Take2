import java.util.Locale;
//свитч кейс выборка или или или или
public class SwitchCase {
    public static void main(String[] args) {
 int j = 2+2;//переменная с заданным условиям
        switch (j) {//задается условие для поиска проверки
            case 3:
                System.out.println("3");//не является верным результатом false
                break;
            case 5:
                System.out.println("5");//не является верным результатом false
                break;
            case 4:
                System.out.println("4");//является верным результатом далее код не проводится
                break;
            default:
                System.out.println("X");//дефолтное значение если ни один из вариантов выше не подошел
                break;
//оператор break необходим для выхода из цикла
    }
}
}
