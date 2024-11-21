import { Component } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent {

  currentView: string = 'default';

  setView(view: string) {
    this.currentView = view;
  }
}
