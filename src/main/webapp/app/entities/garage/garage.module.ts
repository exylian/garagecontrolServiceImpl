import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';
import { JhiLanguageService } from 'ng-jhipster';
import { JhiLanguageHelper } from 'app/core';

import { GaragecontrolServiceImplSharedModule } from 'app/shared';
import {
  GarageComponent,
  GarageDetailComponent,
  GarageUpdateComponent,
  GarageDeletePopupComponent,
  GarageDeleteDialogComponent,
  garageRoute,
  garagePopupRoute
} from './';

const ENTITY_STATES = [...garageRoute, ...garagePopupRoute];

@NgModule({
  imports: [GaragecontrolServiceImplSharedModule, RouterModule.forChild(ENTITY_STATES)],
  declarations: [GarageComponent, GarageDetailComponent, GarageUpdateComponent, GarageDeleteDialogComponent, GarageDeletePopupComponent],
  entryComponents: [GarageComponent, GarageUpdateComponent, GarageDeleteDialogComponent, GarageDeletePopupComponent],
  providers: [{ provide: JhiLanguageService, useClass: JhiLanguageService }],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class GaragecontrolServiceImplGarageModule {
  constructor(private languageService: JhiLanguageService, private languageHelper: JhiLanguageHelper) {
    this.languageHelper.language.subscribe((languageKey: string) => {
      if (languageKey !== undefined) {
        this.languageService.changeLanguage(languageKey);
      }
    });
  }
}
