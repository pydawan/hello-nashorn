package org.java.hello.nashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * @author thiago-amm
 * @version v1.0.0 13/09/2017
 * @since v1.0.0
 */
public class HelloNashorn {
   
   public static void main(String[] args) {
      ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
      ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");
      try {
         nashorn.eval("print('Hello Nashorn!!!');");
         Integer resultado = (Integer) nashorn.eval("10 + 2");
         System.out.println(resultado);
      } catch (ScriptException e) {
         System.out.println("Erro na execução do script: " + e.getMessage());
      }
   }
   
}
