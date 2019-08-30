function formValidation(){
    var otherFacilities = document.getElementById("otherFacilities");
    var description = document.getElementById("description");
    var time = document.getElementById("time");
    var NoRooms = document.getElementById("NoRooms");
    var payment = document.getElementById("payment");
    var keymoney = document.getElementById("keymoney");
    var cityId = document.getElementById("cityId");
    var address = document.getElementById("address");
    var ownerid = document.getElementById("ownerid");

    if(otherFacilities.value == 0 || description.value ==0 || time.value ==0 || NoRooms.value ==0 || payment.value ==0 
    		|| keymoney.value ==0 || cityId.value ==0 || address.value ==0 || ownerid.value ==0 ){
            alert("Every box must be filled out");
            return false;
        }

     //checking no of rooms is a integer or not
     if (isNaN(NoRooms.value)){
        alert("Incorrect no of Rooms.Check again!");
        NoRooms.focus();
      return false;
    }

   //checking owner id is a integer or not
     if (isNaN(ownerid.value)){
        alert("Incorrect owner id.Check again!");
        ownerid.focus();
      return false;
    }


}