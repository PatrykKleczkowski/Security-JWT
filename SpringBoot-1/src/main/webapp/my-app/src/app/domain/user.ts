import { Role } from "./role";

export class User {

    user_id?: Number;
    username: String;
    last_name: String;
    password: String;
    roles?:Role[];

    // constructor(first_name:String, last_name:String, password:String, roles:Role[]){
    //     this.first_name = first_name;
    //     this.last_name = last_name;
    //     this.password = password;
    //     this.roles = roles;
    // }


}