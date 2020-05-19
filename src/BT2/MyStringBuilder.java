/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;
/**
 *
 * @author zasx1
 */
public class MyStringBuilder {
    String str;

    public MyStringBuilder(Builder b) {
        this.str = b.str;
    }

    @Override
    public String toString() {
        return "Ket qua: " + str;
    }
    
    public static class Builder{
        String str = "";

        public Builder() {
        }
        
        public Builder addString(String s){
            str = str + s;
            return this;
        }
        public Builder addFloat(float f){
            str = str + f;
            return this;
        }
        public Builder addBool(Boolean b){
            str = str + b;
            return this;
        }
        public MyStringBuilder build(){
            return new MyStringBuilder(this);
        }
    }
}
