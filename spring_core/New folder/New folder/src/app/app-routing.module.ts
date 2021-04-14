import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddTrainsComponent } from './add-trains/add-trains.component';
import { AdminMenuComponent } from './admin-menu/admin-menu.component';
import { AdminComponent } from './admin/admin.component';
import { BookingComponent } from './booking/booking.component';
import { CancelTicketComponent } from './cancel-ticket/cancel-ticket.component';
import { DeleteTrainComponent } from './delete-train/delete-train.component';
import { LoginComponent } from './login/login.component';
import { SerachTrainComponent } from './serach-train/serach-train.component';
import { UserBookTicketComponent } from './user-book-ticket/user-book-ticket.component';
import { UserMenuComponent } from './user-menu/user-menu.component';
import { UserComponent } from './user/user.component';
import { WelcomeComponent } from './welcome/welcome.component';

const routes: Routes = [
{path:'searchtrainbytrainno',component:SerachTrainComponent},
{path:'login',component:LoginComponent},
{path:'adminmenu/addtrain',component:AddTrainsComponent},
{path:'login/searchtrain',component:SerachTrainComponent},
{path:'userlogin',component:UserComponent},
{path:'userMenu',component:UserMenuComponent},
{path:'userMenu/bookticket',component:BookingComponent},
{path:'userMenu/bookticket/:trainName/:source/:destination/:date',component:BookingComponent},
{path:'userMenu/cancelticket',component:CancelTicketComponent},
{path:'userMenu/viewtrains',component:UserBookTicketComponent},
{path:'',component:WelcomeComponent},
{
  path:'admin',component:AdminComponent},
{path:'adminmenu',component:AdminMenuComponent},
{path:'adminmenu/deletetrain',component:DeleteTrainComponent}
];






@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
 
 }
 /*export const routingComponents=[SerachTrainComponent]*/
