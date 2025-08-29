import { ApplicationConfig, provideBrowserGlobalErrorListeners, provideZonelessChangeDetection } from '@angular/core';
import { provideRouter } from '@angular/router';
<<<<<<< HEAD
=======
import { provideHttpClient } from '@angular/common/http';
>>>>>>> 8e45b1fbdc7973e54eb84fbe74f9d9ebf42bc777

import { routes } from './app.routes';

export const appConfig: ApplicationConfig = {
  providers: [
    provideBrowserGlobalErrorListeners(),

    //provideZonelessChangeDetection(),
    provideRouter(routes)
    provideZonelessChangeDetection(),
    provideRouter(routes),
    provideHttpClient()

  ]
};
