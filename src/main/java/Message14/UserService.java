package Message14;

public class UserService {
    private User[] usersArray = new User[4];

    public void create4Users(){

        usersArray[0] = new User("Диана", "DiVilisova", "LoveLoveluv782", "+79393373236");
        usersArray[1] = new User("Евгений", "fourteenJule", "MusiC1407", "+79172823129" );
        usersArray[2] = new User("Риана", "rioriosol", "Kolipaiol", "+79073264412");
        usersArray[3] = new User("Давид", "Crumbl", "Jokitusi", "+79023254639");
    }

    public User[] getUsersArray() {
        return usersArray;
    }

    public void printUsers() {
        for (User user: usersArray){
            System.out.println(user);
        }
    }

}
