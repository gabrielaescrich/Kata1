package kata1;

import java.util.Date;

public class Person {
    private static final long MILLISECONDS__PER_YEAR = (long)(1000*60*60*24*365);
    
    private final String name;
    private final Date birthday;

    public Person(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public int getAge(){
        return millisecondsToYears(getAgeInMilliseconds());
    }
    
    public int millisecondsToYears(long milliseconds){
        return (int)(milliseconds/MILLISECONDS__PER_YEAR);
    }
    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }
    
    private long getAgeInMilliseconds(){
        return now().getTime() -birthday.getTime();
    }
    
    private Date now(){
        return new Date();
    }
 
    

}
