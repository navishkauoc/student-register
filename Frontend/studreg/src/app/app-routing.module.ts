import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { StudentComponent } from './student/student.component';
import { StudentContactComponent } from './student-contact/student-contact.component';


const routes: Routes = [
  {path: 'home', component: HomeComponent},
  {path: 'student', component: StudentComponent},
  {path: 'student-contact', component: StudentContactComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
