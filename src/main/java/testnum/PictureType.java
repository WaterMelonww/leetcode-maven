package testnum;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * @create 2019-12-30 15:11
 */
public enum PictureType {
    /**
     * 室外门头正面
     */
    OUTDOOR_FACADE(1,"outdoorFacade"),
    /**
     * 室外门头侧面
     */
    OUTDOOR_SIDE(2,"outdoorSide"),

    /**
     * 室外外摆
     */
    OUTDOOR_PUT(3,"outdoorPut"),

    /**
     * 室内客区
     */
    INDOOR_GUESTAREA(4,"indoorGuestArea"),

    /**
     * 室内操作
     */
    INDOOR_OPERATION(5,"indoorOperation"),

    /**
     * 室内后吧台
     */
    INDOOR_BAR(6,"indoorBar"),

    /**
     * 顶部造型效果图
     */
    TOP_SHAPE(7,"topShape"),

    /**
     * 柜体造型效果图
     */
    WALL_SHAPE(8,"wallShape"),

    /**
     * 柜体造型效果图
     */
    CABINET_SHAPE(9,"cabinetShape");

    private Integer index;
    private String name;

    PictureType(Integer index, String name) {
        this.index = index;
        this.name = name;
    }

    public Integer getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

}
