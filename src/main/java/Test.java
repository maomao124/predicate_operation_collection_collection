import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

/**
 * Project name(项目名称)：Predicate操作Collection集合
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/21
 * Time(创建时间)： 13:40
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test
{
    public static int calAll(Collection c, Predicate p)
    {
        int total = 0;
        for (Object obj : c)
        {
            if (p.test(obj))
            {
                total++;
            }
        }
        return total;
    }

    public static void main(String[] args)
    {
        HashSet<String> p = new HashSet<>();
        p.add("1");
        p.add("12");
        p.add("123");
        p.add("1234");
        p.add("12345");
        p.add("123456");
        p.add("1234567");
        p.add("12345678");
        p.add("123456789");
        p.add("1234567890");
        p.forEach(System.out::println);
        System.out.println();
        p.removeIf(s -> (s.length() < 5));
        p.forEach(System.out::println);
        System.out.println();
        System.out.println(calAll(p, s -> ((String) s).contains("123456")));
        System.out.println(calAll(p, s -> ((String) s).contains("1234566")));
        System.out.println(calAll(p, s -> ((String) s).length() > 6));
    }
}
