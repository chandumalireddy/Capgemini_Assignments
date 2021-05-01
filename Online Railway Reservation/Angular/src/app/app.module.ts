import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { FormArray, FormsModule, ReactiveFormsModule } from '@angular/forms';  
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule, /*routingComponents*/ } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { AdminComponent } from './admin/admin.component';
import { AddTrainsComponent } from './add-trains/add-trains.component';

import { SerachTrainComponent } from './serach-train/serach-train.component';
import { BasicAuthHtppInterceptorService } from './basic-auth-service.service';
import { AdminMenuComponent } from './admin-menu/admin-menu.component';
import { DeleteTrainComponent } from './delete-train/delete-train.component';
import { UserComponent } from './user/user.component';
import { UserMenuComponent } from './user-menu/user-menu.component';
import { BookingComponent } from './booking/booking.component';
import { CancelTicketComponent } from './cancel-ticket/cancel-ticket.component';
import { UserBookTicketComponent } from './user-book-ticket/user-book-ticket.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NewsComponent } from './news/news.component';
import { UsersListComponent } from './users-list/users-list.component';
import {MatButtonModule} from '@angular/material/button';
import {MatExpansionModule} from '@angular/material/expansion';
import { PaymentComponent } from './payment/payment.component';
import { NgxPayPalModule } from 'ngx-paypal';
@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    WelcomeComponent,
    AdminComponent,
    AddTrainsComponent,
    SerachTrainComponent,
    AdminMenuComponent,
    DeleteTrainComponent,
    UserComponent,
    UserMenuComponent,
    BookingComponent,
    CancelTicketComponent,
    UserBookTicketComponent,
    NewsComponent,
    UsersListComponent,
    PaymentComponent,
  ],
  imports: [
    BrowserModule,
    
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    BrowserAnimationsModule,
    MatButtonModule,
    MatExpansionModule,
 NgxPayPalModule 

 

   
  ],
  providers: [
  {  
      provide:HTTP_INTERCEPTORS, useClass:BasicAuthHtppInterceptorService, multi:true 
    }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
