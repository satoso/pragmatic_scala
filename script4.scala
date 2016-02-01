package society {
  package professional {
    class Executive {
      private[professional] val workDetails = null
      private[society] val friends = null
      private[this] val secrets = null

      def help(another: Executive) = {
        println(another.workDetails)
        println(secrets)
        println(another.secrets) //ERROR
      }
    }
    class Assistant {
      def assist(anExec: Executive) = {
        println(anExec.workDetails)
        println(anExec.friends)
      }
    }
  }

  package social {
    class Acquaintance {
      def socialize(person: professional.Executive) {
        println(person.friends)
        println(person.workDetails) //ERROR
      }
    }
  }
}
