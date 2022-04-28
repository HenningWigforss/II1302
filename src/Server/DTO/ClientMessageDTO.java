package Server.DTO;

/**
    The ClientMessageDTO class represents the client message as a 
    Data Transfer Object.
 */

public class ClientMessageDTO{
    private String plainText;
    private String userName;
  /**
    Creates a new instance of the class ClientMessageDTO.
    @param msg String containing message from user.
    @param user String with the user name.
   */
    public ClientMessageDTO(String msg, String user){
        this.plainText = msg;
        this.userName = user;
    }

    public String getPlainText(){
        return this.plainText;
    }
    
    public String getUserName(){
        return this.userName;
    }

    public void setPlainText(String msg){
        this.plainText = msg;
    }

    public void setUserName(String user){
        this.userName = user;
    }
}