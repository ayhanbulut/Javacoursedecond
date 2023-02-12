package AdvancedJavaPractice.Generics.Classes;

public class Student<S,U,V>
{

    private S s;
    private  U u;
    private  V V;

    public Student(S s, U u, V v)
    {
        this.s = s;
        this.u = u;
        V = v;
    }

    public S getS()
    {
        return s;
    }

    public void setS(S s)
    {
        this.s = s;
    }

    public U getU()
    {
        return u;
    }

    public void setU(U u)
    {
        this.u = u;
    }

    public V getV()
    {
        return V;
    }

    public void setV(V v)
    {
        V = v;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "s=" + s +
                ", u=" + u +
                ", V=" + V +
                '}';
    }
}
