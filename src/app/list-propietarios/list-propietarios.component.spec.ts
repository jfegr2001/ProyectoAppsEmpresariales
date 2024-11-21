import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListPropietariosComponent } from './list-propietarios.component';

describe('ListPropietariosComponent', () => {
  let component: ListPropietariosComponent;
  let fixture: ComponentFixture<ListPropietariosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ListPropietariosComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListPropietariosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
