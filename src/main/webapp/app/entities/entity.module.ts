import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

@NgModule({
  imports: [
    RouterModule.forChild([
      {
        path: 'garage',
        loadChildren: './garage/garage.module#GaragecontrolServiceImplGarageModule'
      },
      {
        path: 'garage-code',
        loadChildren: './garage-code/garage-code.module#GaragecontrolServiceImplGarageCodeModule'
      }
      /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
    ])
  ],
  declarations: [],
  entryComponents: [],
  providers: [],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class GaragecontrolServiceImplEntityModule {}
