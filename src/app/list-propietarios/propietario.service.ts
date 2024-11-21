import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Propietario } from './propietario.model';


@Injectable({
  providedIn: 'root'
})
export class PropietarioService {

  private apiUrl = 'http://localhost:8080/propietarios';

  constructor(private http: HttpClient) { }

    /**
   * Obtiene todos los propietarios
   * @returns Observable con la lista de propietarios
   */
    getAllPropietarios(): Observable<Propietario[]> {
      return this.http.get<Propietario[]>(`${this.apiUrl}/buscar`);
    }
  
    /**
     * Busca un propietario por su documento
     * @param documento Documento del propietario
     * @returns Observable con el propietario encontrado
     */
    getPropietarioByDocumento(documento: string): Observable<Propietario> {
      return this.http.get<Propietario>(`${this.apiUrl}/buscar/${documento}`);
    }
  
    /**
     * Crea un nuevo propietario
     * @param propietario Datos del propietario a registrar
     * @returns Observable con el propietario registrado
     */
    createPropietario(propietario: Propietario): Observable<Propietario> {
      return this.http.post<Propietario>(`${this.apiUrl}/registrar`, propietario);
    }
  
    /**
     * Actualiza un propietario existente
     * @param documento Documento del propietario a actualizar
     * @param propietario Datos actualizados del propietario
     * @returns Observable con el propietario actualizado
     */
    updatePropietario(documento: string, propietario: Propietario): Observable<Propietario> {
      return this.http.put<Propietario>(`${this.apiUrl}/actualizar/${documento}`, propietario);
    }
  
    /**
     * Elimina un propietario por su documento
     * @param documento Documento del propietario a eliminar
     * @returns Observable indicando si fue eliminado correctamente
     */
    deletePropietario(documento: string): Observable<void> {
      return this.http.delete<void>(`${this.apiUrl}/eliminar/${documento}`);
    }
}
