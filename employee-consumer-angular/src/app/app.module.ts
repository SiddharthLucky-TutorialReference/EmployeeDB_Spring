import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {DepartmentserviceService} from './service/departmentservice.service';
import {HttpClientModule} from '@angular/common/http';
import {FormsModule} from '@angular/forms';
import { DisplaydepartmentComponent } from './displaydepartment/displaydepartment.component';

@NgModule({
  declarations: [
    AppComponent,
    DisplaydepartmentComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [DepartmentserviceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
