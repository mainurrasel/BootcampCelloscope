export class UserCreation {
    uid!: string;
    name!: string;
    phonenumber!: string;
    password!: string;
    role! : String;
    
    public User(uid: string, name: string, phonenumber: string, password: string, role: string) {
    this.uid = uid;
    this.name = name;
    this.phonenumber = phonenumber;
    this.password = password;
    this.role = role;
    }
    updateData(userId:any){
        const newFormData = { uid:userId, name:'Mainur', phoneNumber:'012345678',password:'amarami',role:'Teacher' }
    }
    
    
   }