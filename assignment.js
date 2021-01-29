//kilometer To Meter convert
function kilometerToMeter(kilometer) {
    var meter = kilometer * 1000;
    return meter;
    
}
var result = kilometerToMeter(6.5);
console.log(result);
//budgetCalculator
function budgetCalculator({watch,phone,laptop}){
    if (watch.price <= 0 && phone.price <= 0 && laptop.price <= 0) {
       throw error("negtive price is not allow");
        
    } 
    if (watch.quantity <= 0 && phone.quantity <= 0 && laptop.quantity <= 0) {
        throw error("negtive quantity is not allow");
        
    }
    return(watch.price * watch.quantity)+(phone.price * phone.quantity)+(laptop.price * laptop.quantity)
}
var total= {
    watch:{
        price:50,
        quantity:5
    },
    phone:{
        price:100,
        quantity:1

    },
    laptop:{
        price:500,
        quantity:55
    }
}
console.log(budgetCalculator (total));


//hotelCost
function hotelCost(day){
    var Cost = 0;
    if (day <= 10) {
      Cost = day * 100;  
    }
    else if(day <= 20){
        var firstSlot = 10 * 100;
        var remaining = day - 10;
        var secondSlot= remaining * 80;
        Cost = firstSlot + secondSlot;
    }
    else{
        var firstSlot =  10 * 100;
        var secondSlot= 10 * 80;
        var remaining = day - 20;
        var thirdSlot = remaining * 50;
       Cost = firstSlot + secondSlot + thirdSlot;


    }
    return Cost;

}
var total= hotelCost(12) ;
console.log(total);

//megaFriend
function megaFriend(name){
    var large = name[0];
    for(var i=0; i<name.length ;i++)
    {
        var element = name[i];
        if (element>large) {
           large = element; 
        }
    }
    return large;
}
var nam=["shoshe","ritu","limaa"];
var result= megaFriend(nam);
console.log(result);


