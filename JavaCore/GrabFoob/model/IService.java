package model;
public interface IService<T , L> {
    void changeName(T obj, L objs);
    void changePhone(T obj, L objs);
    void changeAddress(T obj, L objs);
}
