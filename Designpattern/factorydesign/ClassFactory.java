package Designpattern.factorydesign;

public class ClassFactory {
      public Ring handleRing(String typeOfRing)
      {
          if(typeOfRing==null||typeOfRing.isEmpty())
          {
              return null;
          }

          switch(typeOfRing){
              case "Door":
                  return new DoorbellRing();
              case "Mobile":
                  return new MobileRing();
              case "Telephone":
                  return new TelephoneRing();
              default:
                 throw  new IllegalArgumentException("invalid ring type  "+typeOfRing);
          }

      }
}
