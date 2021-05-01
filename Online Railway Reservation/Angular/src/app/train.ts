import { ReservationType } from "./reservation-type";
import { StationStops } from "./station-stops";

export class Train {

    constructor(public trainNo:any,public trainName:any,public source:any,public destination:any,
        public date:any,public arrivalTime:any,public departureTime:any,public duration:any,public destinationTime:any,public reservationVacancy:Array<ReservationType>,
        public stops:Array<StationStops>){

    }
}
