/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomorSatu;

/**
 *
 * @author Nada Alya
 */
public class NodeMahasiswa {
    
    Mahasiswa data;
    NodeMahasiswa next;
    
    public NodeMahasiswa( Mahasiswa data, NodeMahasiswa next){
        this.data = data;
        this.next = next;
    }
}
