package year2018;

import lombok.Data;

import java.util.Date;

/**
 * @author likun
 * @version V1.0
 * @Title: year2018
 * @date 2018/2/5 10:38
 */
@Data
public class DateBean {
    private Date date;
    private  Integer value;
    public DateBean(int a , Object b) {
        this.value = a;
    }
}
