import { Component, OnInit } from '@angular/core';
import { Student } from '../student/student.component';

//01. Create an Interface for single object
export interface StudentContact{
  id: string;
  mobile: string;
  address: string;
  email: string;
  student: Student;
}

@Component({
  selector: 'app-student-contact',
  templateUrl: './student-contact.component.html',
  styleUrls: ['./student-contact.component.css']
})
export class StudentContactComponent implements OnInit {

  //0. 

  constructor() { }

  ngOnInit(): void {
  }

}
