package models

import play.libs.Scala
import be.objectify.deadbolt.core.models.Subject

/**
 *
 * 
 */

class User(val userName: String) extends Subject
{
  def getRoles: java.util.List[SecurityRole] = {
    Scala.asJava(List(new SecurityRole("foo"),
                      new SecurityRole("bar")))
  }

  def getPermissions: java.util.List[UserPermission] = {
    Scala.asJava(List(new UserPermission("printers.edit")))
  }

  def getIdentifier: String = userName
}
