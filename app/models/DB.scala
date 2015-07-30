package models

import sorm._

object DB extends Instance(entities = Seq(Entity[Person]()),url="jdbc:mysql://localhost:3306/test",user="root",password = "rajni")
