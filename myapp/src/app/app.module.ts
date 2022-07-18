import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterModule, Routes } from '@angular/router';


import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { HeaderComponent } from './componentes/header/header.component'; // Lo importó directamente vsc
import { ButtonComponent } from './componentes/button/button.component'; // Lo importó directamente vsc con un pequeño bug
import { TasksComponent } from './componentes/tasks/tasks.component'; // Lo importó directamente vsc
import { TasksItemComponent } from './componentes/tasks-item/tasks-item.component'; //Lo importó directamente vsc
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';  // Lo importó directamente vsc
import { HttpClientModule } from '@angular/common/http';
import { AddTaskComponent } from './componentes/add-task/add-task.component';
import { AboutComponent } from './componentes/about/about.component';
import { FooterComponent } from './componentes/footer/footer.component';
import { LogoApComponent } from './componentes/logo-ap/logo-ap.component';
import { SocialMediaComponent } from './componentes/social-media/social-media.component';
import { BannerComponent } from './componentes/banner/banner.component';
import { ExperienciaComponent } from './componentes/experiencia/experiencia.component';
import { EducacionComponent } from './componentes/educacion/educacion.component';
import { SkillsComponent } from './componentes/skills/skills.component';
import { NgCircleProgressModule } from 'ng-circle-progress';
import { ProyectosComponent } from './componentes/proyectos/proyectos.component';


const appRoutes: Routes = [
  {path: "", component: TasksComponent},
  {path: "about", component: AboutComponent}
]


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent, // Lo registró automáticamente vsc
    ButtonComponent, // Lo registró automáticamente vsc
    TasksComponent,  // Lo registró automáticamente vsc
    TasksItemComponent, 
    AddTaskComponent, 
    AboutComponent, 
    FooterComponent, 
    LogoApComponent, 
    SocialMediaComponent, 
    BannerComponent, 
    ExperienciaComponent, 
    EducacionComponent, 
    SkillsComponent, ProyectosComponent // Lo registró automáticamente vsc
    
  ],
  imports: [
    BrowserModule,
    FormsModule,
    NgCircleProgressModule.forRoot({}),
    FontAwesomeModule, // Lo registró automáticamente vsc
    HttpClientModule,
    RouterModule.forRoot(appRoutes, {enableTracing: true})
    
  ],
  providers: [
    
  ],
  bootstrap: [AppComponent] // Acá está bootstrap
  
})
export class AppModule { }
