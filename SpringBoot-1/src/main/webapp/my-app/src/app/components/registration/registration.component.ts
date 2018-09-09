import { Component, OnInit } from '@angular/core';
import { FormControl, Validators, FormGroup, FormBuilder } from '@angular/forms';
import { UserService } from '../../services/user.service';
import { Router } from '@angular/router';
import { User } from '../../domain/user';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {

  constructor(private userService: UserService, private router: Router, private formBuilder: FormBuilder) {
    this.initRegisterForm();
  }
  registerForm: FormGroup;
  user: User;

  ngOnInit() {
    this.initUser();
  }

  initRegisterForm() {
      this.registerForm = this.formBuilder.group({
      username: ['', Validators.required],
      last_name: ['', [Validators.required]],
      password: ['', [Validators.required]]
    });
  }

  initUser() {
    this.user = { username: null, last_name: null, password: null };
  }



  registerUser() {
    this.userService.createUser(this.user).subscribe((user) => {
      console.log(user);
      this.router.navigate(['']);
    }, (error) => {
      console.log(error);
    });
  }



}
