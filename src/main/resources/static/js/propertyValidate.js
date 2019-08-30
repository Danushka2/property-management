function formValidation(){
    var otherFacilities = document.getElementById("otherFacilities");
    var description = document.getElementById("description");
    var time = document.getElementById("time");
    var NoRooms = document.getElementById("NoRooms");
    

    if(otherFacilities.value == 0 ){
            alert("Every box must be filled out");
            return false;
        }

     //checking contact number is a integer or not
     if (isNaN(NoRooms.value)){
        alert("Incorrect no of Rooms.Check again!");
        NoRooms.focus();
      return false;
    }


    /*
    var cityid = document.getElementById("cityid");
    var Birthdayid = document.getElementById("birthdayid");
    var contactid = document.getElementById("contactid");
    var pcodeid = document.getElementById("pcodeid");
    var emailid = document.getElementById("emailid");
    var passwordid = document.getElementById("passwordid");
    var cpasswordid = document.getElementById("cpasswordid");
    

 

    //checking whether every input field is filled or not
    if(fullnameid.value == 0 || emailid.value ==0 || passwordid.value ==0 || cpasswordid.value ==0 || Initialsid.value ==0 
    || addressid.value ==0 || nicNOid.value ==0 || cityid.value ==0 || Birthdayid.value ==0 || contactid.value ==0 || pcodeid.value ==0){
        alert("Every box must be filled out");
        return false;
    }


   
   
     

    //checking contact number is a integer or not
    if (isNaN(pcodeid.value)){
        alert("Incorrec Postal Id.Try again!");
        pcodeid.focus();
      return false;
    }
    */
}