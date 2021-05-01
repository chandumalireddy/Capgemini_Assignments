import { PassengerList } from "./passenger-list";

export class Booking {


    constructor(public pnr:any,public username:any,public passengers:Array<PassengerList>,public trainname:any,public source:any,public destination:any,public date:any,public reservationtype:any){}
}
