import { Component, OnInit } from '@angular/core';
import { Student } from '../student/student.component';
import { HttpClient } from '@angular/common/http';

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

  //02. Create array variable for all the objects
  students: Student[] = [];
  studentContacts: StudentContact[] = []; 

  //03. Http object injection
  constructor(private http: HttpClient) { }

  ngOnInit(): void {
    //04. Load data from URL
    var url = "http://localhost:8080/studentcontacts";
    this.http.get<StudentContact[]>(url)
    .subscribe(data=>{
      this.studentContacts = data;
    });

    var url2 = "http://localhost:8080/students";
    this.http.get<Student[]>(url2)
    .subscribe(data=>{
      this.students = data;
    });
  }

}
