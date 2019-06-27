import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';
import { JhiLanguageService } from 'ng-jhipster';
import { JhiLanguageHelper } from 'app/core';

import { GaragecontrolServiceImplSharedModule } from 'app/shared';
import {
  GarageCodeComponent,
  GarageCodeDetailComponent,
  GarageCodeUpdateComponent,
  GarageCodeDeletePopupComponent,
  GarageCodeDeleteDialogComponent,
  garageCodeRoute,
  garageCodePopupRoute
} from './';

const ENTITY_STATES = [...garageCodeRoute, ...garageCodePopupRoute];

@NgModule({
  imports: [GaragecontrolServiceImplSharedModule, RouterModule.forChild(ENTITY_STATES)],
  declarations: [
    GarageCodeComponent,
    GarageCodeDetailComponent,
    GarageCodeUpdateComponent,
    GarageCodeDeleteDialogComponent,
    GarageCodeDeletePopupComponent
  ],
  entryComponents: [GarageCodeComponent, GarageCodeUpdateComponent, GarageCodeDeleteDialogComponent, GarageCodeDeletePopupComponent],
  providers: [{ provide: JhiLanguageService, useClass: JhiLanguageService }],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class GaragecontrolServiceImplGarageCodeModule {
  constructor(private languageService: JhiLanguageService, private languageHelper: JhiLanguageHelper) {
    this.languageHelper.language.subscribe((languageKey: string) => {
      if (languageKey !== undefined) {
        this.languageService.changeLanguage(languageKey);
      }
    });
  }
}
