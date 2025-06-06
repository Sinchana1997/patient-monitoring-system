import { Component } from '@angular/core';
import { RouterModule } from '@angular/router'; // ✅ Add this

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterModule], // ✅ Required for <router-outlet>
  templateUrl: './app.html',
  styleUrls: ['./app.css']
})
export class AppComponent {
  protected title = 'patient-monitoring-frontend';
}
