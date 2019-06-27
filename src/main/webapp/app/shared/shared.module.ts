import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { GaragecontrolServiceImplSharedCommonModule, JhiLoginModalComponent, HasAnyAuthorityDirective } from './';

@NgModule({
  imports: [GaragecontrolServiceImplSharedCommonModule],
  declarations: [JhiLoginModalComponent, HasAnyAuthorityDirective],
  entryComponents: [JhiLoginModalComponent],
  exports: [GaragecontrolServiceImplSharedCommonModule, JhiLoginModalComponent, HasAnyAuthorityDirective],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class GaragecontrolServiceImplSharedModule {
  static forRoot() {
    return {
      ngModule: GaragecontrolServiceImplSharedModule
    };
  }
}
