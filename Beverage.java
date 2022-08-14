public abstract class Beverage {
private String name;
private TYPE type;
private SIZE size;
private final double BASE_PRICE = 2.0;
private final double SIZE_PRICE = 1.0;

public abstract double calcPrice();

public String getBevName() {
return name;
}
public TYPE getType() {
return type;
}
public SIZE getSize() {
return size;
}
public double getBasePrice() {
return BASE_PRICE;
}
public double getSizePrice() {
return SIZE_PRICE;
}


public void setName(String nam) {
name = nam;
}
public void setType(TYPE typ) {
type = typ;
}
public void setSize(SIZE siz) {
size = siz;
}




public Beverage(String nam, TYPE typ, SIZE siz) {
name = nam;
type = typ;
size = siz;
}




public String toString() {
return name +", " +size;
}

public boolean equals(Beverage bev) {
if (name.equals(bev.getBevName()) && type==bev.getType() && size==bev.getSize()) {
return true;
}
else {
return false;
}
}



}

