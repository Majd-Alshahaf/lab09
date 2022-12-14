/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess;

import java.util.List;
import javax.persistence.EntityManager;
import models.Role;


public class RoleDB {

    public List<Role> getAll() throws Exception {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        try {
            List<Role> roles = em.createNamedQuery("Role.findAll", Role.class).getResultList();
            return roles;
        } finally {
            em.close();
        }
    }

    public Role get(int id) throws Exception {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        try {
            Role role = em.find(Role.class, id);
            return role;
        } finally {
            em.close();
        }
    }

    public void insert(Role newRole) throws Exception {
        //TO DO
    }

    public void update(Role role) throws Exception {
        //TO DO
    }

    public void delete(int roleId) throws Exception {
        //TO DO
    }

    public void delete(Role role) throws Exception {
        delete(role.getRoleId());
    }
}
