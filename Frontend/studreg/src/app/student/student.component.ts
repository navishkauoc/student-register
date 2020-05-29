import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

//01. Create an interface for Single object
export interface Student{
  id: string;
  name: string;
  age: string;
  gender: string;
  photo: string;
}

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {

  //02. Create array variable for all objects
  students: Student[]= [];

  //03. Http Object injection
  constructor(private http: HttpClient) { }

  ngOnInit(): void {
    //04. Load data from URL
    var url= "http://localhost:8080/students";
    this.http.get<Student[]>(url)
    .subscribe(data=>{
      this.students= data;
    })
  }

  

}
