import { HttpInterceptor, HttpRequest, HttpHandler, HttpEvent, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { LoginServiceService } from './login-service.service';

@Injectable()
export class BasicAuthHtppInterceptorService implements HttpInterceptor {

    constructor(private authenticationService: LoginServiceService) { }

    intercept(req: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
        if (this.authenticationService.isUserLoggedIn() && req.url.indexOf('basicauth') === -1) {
            const authReq = req.clone({
                headers: new HttpHeaders({
                    'Content-Type': 'application/json',
                    'Authorization': `Basic ${window.btoa(this.authenticationService.username1 + ":" + this.authenticationService.password1)}`
                })
            });
            return next.handle(authReq);
        } else {
            return next.handle(req);
        }
    }
}