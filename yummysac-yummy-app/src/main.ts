import { bootstrapApplication } from '@angular/platform-browser';
import {provideRouter, RouterModule} from '@angular/router';
import { routes } from './app/app.routes';
import {AppComponent} from './app/app.component';
import {HTTP_INTERCEPTORS, provideHttpClient, withInterceptors} from '@angular/common/http';
import {AuthInterceptor} from './app/auth/auth.interceptor';
import {importProvidersFrom} from '@angular/core';
import { FormsModule } from '@angular/forms';
import {CommonModule} from '@angular/common';
import 'zone.js';


bootstrapApplication(AppComponent, {
  providers: [
    provideRouter(routes),
    provideHttpClient(),
    importProvidersFrom(
      FormsModule,RouterModule,CommonModule
    ),
    {
      provide: HTTP_INTERCEPTORS,
      useClass: AuthInterceptor,
      multi: true
    }
  ]
});
