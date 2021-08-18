import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  private baseUrl = "http://localhost:8080/api/";
  constructor(private http: HttpClient) {
    
  }

  getStudents(): Observable<any> {
    return this.http.get(`${this.baseUrl}student-list`);
  }

  createStudent(student: object): Observable<object> {
    return this.http.post(`${this.baseUrl}save-student`,student);
  }

  deleteStudent(id: number): Observable<Object> {
    return this.http.post(`${this.baseUrl}delete-student/${id}`,id);
  }

  getStudent(id: number): Observable<Object> {
    return this.http.get(`${this.baseUrl}student/${id}`);
  }

  updateStudent(id: number, value: any): Observable<Object> {
    return this.http.post(`${this.baseUrl}update-student/${id}`,value);
  }

}
