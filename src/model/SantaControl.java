package model;

import java.util.ArrayList;

public class SantaControl {
	
    private ArrayList<Child> goodList;
    private ArrayList<Child> naughtyList;

    public SantaControl() {
        goodList = new ArrayList<Child>();
        naughtyList = new ArrayList<Child>();

    }

    public ArrayList<Child> getGoodList() {
        return goodList;
    }

    public void setGoodList(ArrayList<Child> goodList) {
        this.goodList = goodList;
    }

    public ArrayList<Child> getNaughtyList() {
        return naughtyList;
    }

    public void setNaughtyList(ArrayList<Child> naughtyList) {
        this.naughtyList = naughtyList;
    }

    public String createChild(int option, String name, String address, String city, String country, String christmasWish,int age) {
			
            String out = "";
            boolean added = false;

         if (option != 1 && option != 2) {
            out = "error";
        } else {
            ArrayList<Child> auxArrayList;

            if (option == 1) {
                auxArrayList = goodList;
            } else {
                auxArrayList = naughtyList;
            }

            Child newChild = new Child(name, address, city, country, christmasWish, age);

            if (auxArrayList.size() == 0) {
                auxArrayList.add(newChild);
            } else {

                boolean add = false;
                for (int i = 0; i < auxArrayList.size() && add == false; i++) {

                    if (newChild.compareTo(auxArrayList.get(i)) < 0) {
                        System.out.println("fd");
                        auxArrayList.add(i, newChild);
                        add = true;
                    }

                }
            }

			out	= "the child was added";

        }

        return out;
    }

    public String changeList(String name) {
       
		String out = "";
        boolean find = false;
        Child child = null;

        for (int i = 0; i < goodList.size() && find == false; i++) {
            if (name.equals(goodList.get(i).getName())) {
                child = goodList.get(i);
                find = true;
                goodList.remove(child);
                naughtyList.add(child);
            }

        }

        for (int j = 0; j < naughtyList.size() && find == false; j++) {
            if (name.equals(naughtyList.get(j).getName())) {
                child = naughtyList.get(j);
                find = true;
                naughtyList.remove(child);
                goodList.add(child);
            }
        }

        if (child == null) {
            out = "Child dont exist";
        } else {
            out = "Child changed list";
        }

        return out;
    }

    public void orderAge(ArrayList<Child> list, Child child) {

        for (int i = list.size(); i > 0; i--) {
            int name = list.get(i).compareTo(child);

            if (name == -1) {

            }

        }

    }

}
