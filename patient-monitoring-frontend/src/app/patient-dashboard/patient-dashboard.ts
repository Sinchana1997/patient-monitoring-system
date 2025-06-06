import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Patient } from '../patient'; // adjust path if needed

@Component({
  selector: 'app-patient-dashboard',
  standalone: true,
  templateUrl: './patient-dashboard.html',
  styleUrls: ['./patient-dashboard.css'],
  imports: [CommonModule]
})
export class PatientDashboard {
  patients: Patient[] = 
  [];
}
