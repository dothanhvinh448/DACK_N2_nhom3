public class testDangky {

    public boolean tentruoc(String input){
        int a;
        if(input == ""){

            return false;
        }
        if(input == "@"){
            return false;
        }
        if(input =="123"){
            return false;
        }else{
            return true;
        }


    }

    public boolean tensau(String input){
        if(input == ""){
            return false;
        }
        if(input == "@"){
            return false;
        }
        if(input == "123"){
            return false;
        }
        return true;
    }
    public boolean email(String input){
        if(input == ""){
            return false;
        }
        if(input==""){
            return false;
        }
        if(input == "123"){
            return false;
        }

        return true;
    }

    public boolean password(String input){
        if(input == ""){
            return false;
        }else{
            return true;
        }
    }

}