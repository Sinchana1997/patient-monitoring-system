

import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class Patient {
  private baseUrl = 'http://localhost:8081/api/patients';

  constructor(private http: HttpClient) {}

  getAllPatients(): Observable<any> {
    return this.http.get(this.baseUrl);
  }

  sendVitals(data: any): Observable<any> {
    return this.http.post(`${this.baseUrl}/vitals`, data);
  }
}

export interface Patient {
  name: string;
  temperature: number;
  heartRate: number;
  oxygenLevel: number;
}
