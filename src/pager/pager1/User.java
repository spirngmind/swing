package pager.pager1;

/**
 * @author zhenghang
 * @date 2018/6/18 21:54
 */
public class User {
    private String name;
    private String pass;

    public User(String name,String pass){
        this.name=name;
        this.pass=pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
