import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { RegistrationComponent } from './components/registration/registration.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { CustomMaterialModule } from './CustomMaterialModule';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { ReactiveFormsModule } from '@angular/forms';

import { UserService } from './services/user.service';



//Material imports
import {MatButtonModule} from '@angular/material/button';
import {MatMenuModule} from '@angular/material/menu';
import {MatCardModule} from '@angular/material/card';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatInputModule} from '@angular/material/input';
import {MatIconModule} from '@angular/material/icon';
import {MatSidenavModule} from '@angular/material/sidenav';
import { MatToolbarModule } from '@angular/material';
import { HttpClientModule, HttpClient } from '@angular/common/http';




//

const appRoutes: Routes = [
  { path: '', component: RegistrationComponent },

];

@NgModule({
  declarations: [
    AppComponent,
    RegistrationComponent,
    NavbarComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    CustomMaterialModule,
    RouterModule.forRoot(appRoutes),
    MatButtonModule,
    MatMenuModule,
    MatCardModule,
    MatFormFieldModule,
    MatInputModule,
    BrowserAnimationsModule,
    MatIconModule,
    MatSidenavModule,
    MatToolbarModule,
    ReactiveFormsModule
  ],
  providers: [
    UserService,
    HttpClient
    ],
  bootstrap: [AppComponent]
})
export class AppModule { }
