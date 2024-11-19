package com.demo.proyecto.domain.dto;

import com.demo.proyecto.persistence.entity.Rol;

public class UsuarioRolDTO {

    private String usuarioRolId;
    private PropietarioDTO propietarioDTO;
    private RolDTO rolDTO;


    public UsuarioRolDTO(String usuarioRolId, PropietarioDTO propietarioDTO, RolDTO rolDTO) {
        this.usuarioRolId = usuarioRolId;
        this.propietarioDTO = propietarioDTO;
        this.rolDTO = rolDTO;
    }

    public String getUsuarioRolId() {
        return usuarioRolId;
    }

    public void setUsuarioRolId(String usuarioRolId) {
        this.usuarioRolId = usuarioRolId;
    }

    public PropietarioDTO getPropietarioDTO() {
        return propietarioDTO;
    }

    public void setPropietarioDTO(PropietarioDTO propietarioDTO) {
        this.propietarioDTO = propietarioDTO;
    }

    public RolDTO getRolDTO() {
        return rolDTO;
    }

    public void setRolDTO(RolDTO rolDTO) {
        this.rolDTO = rolDTO;
    }
}
