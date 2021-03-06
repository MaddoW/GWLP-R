/**
 * For copyright information see the LICENSE document.
 */

package gwlpr.database.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;


/**
 *
 * @author _rusty
 */
@Embeddable 
public class WeaponsetPK implements Serializable 
{
    @Basic(optional = false)
    @Column(name = "CharacterID")
    private int characterID;
    @Basic(optional = false)
    @Column(name = "Number")
    private short number;

    public WeaponsetPK() {
    }

    public WeaponsetPK(int characterID, short number) {
        this.characterID = characterID;
        this.number = number;
    }

    public int getCharacterID() {
        return characterID;
    }

    public void setCharacterID(int characterID) {
        this.characterID = characterID;
    }

    public short getNumber() {
        return number;
    }

    public void setNumber(short number) {
        this.number = number;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) characterID;
        hash += (int) number;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WeaponsetPK)) {
            return false;
        }
        WeaponsetPK other = (WeaponsetPK) object;
        if (this.characterID != other.characterID) {
            return false;
        }
        if (this.number != other.number) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gwlpr.database.entities.WeaponsetPK[ characterID=" + characterID + ", number=" + number + " ]";
    }

}
