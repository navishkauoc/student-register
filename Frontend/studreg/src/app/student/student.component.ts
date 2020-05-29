import { Component, OnInit } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { FormControl } from '@angular/forms';
import Swal from 'sweetalert2';

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

  //a. Create FormControl object per each input
  name = new FormControl();
  age = new FormControl();
  gender = new FormControl();

  //02. Create array variable for all objects
  students: Student[]= [];

  //b. Http Object injection
  //03. Http Object injection
  constructor(private http: HttpClient) { }

  ngOnInit(): void {
    
    //04. Load data from URL
    var url= "http://localhost:8080/students";
    this.http.get<Student[]>(url)
    .subscribe(data=>{
      this.students= data;
    });
  }

  loadAll(): void{
    //04. Load data from URL
    var url= "http://localhost:8080/students";
    this.http.get<Student[]>(url)
    .subscribe(data=>{
      this.students= data;
    });
  }

  // c. Create save function for save operation
  save(){
    //d. Collect form data
    let body = new HttpParams({
      fromObject: {
        'name': this.name.value,
        'age': this.age.value,
        'gender': this.gender.value
      }
    });

    //e. Pass to the URL
    this.http.post<any> ('http://localhost:8080/student', body)
    .subscribe(data=>{
      console.log(data);
      this.loadAll();
      Swal.fire('Successfully Saved!');
    });
  }

  

}
