

/**
 * 测试英雄
 * @author HYT
 */

public class Hero {
    String name;    //姓名
    double hp;  //血量
    double armor;   //护甲
    int moveSpeed;  //移动速度
    float atackSpeed;
    int death;  //死亡数
    int kills;  //杀人数
    int assist; //助攻
    int bounty; //赏金
    int gold;   //金币
    int creepScore; //击杀小兵数量
    String killVoice; //杀人音效
    String deathVoice;  //死亡音效

//超神 方法
    void legendary(){
        System.out.println("超神了！");
    }

    //坑 方法
    void keng(){
        System.out.println("坑队友！");
    }

    //获得护甲 方法
    double getArmor(){
        return armor;
    }


    //获得血量 方法
    double getHp(){
        return hp;
    }

    //增加移动速度 方法
    void addSpeed(int speed){
        //在原来的基础上增加移动速度
        moveSpeed+=speed;
    }


    //增加血量 方法
    void recovery(float blood){
        //在原来的基础上增加血量
        hp+=blood;
    }





    public static void main(String[] args){
        Hero garen=new Hero();
        garen.name="盖伦";
        garen.hp=616.d;
        garen.armor=27.d;
        garen.moveSpeed=350;
        garen.atackSpeed=0.70f;
        garen.death=3;
        garen.kills=7;
        garen.assist=14;
        garen.bounty=300;
        garen.gold=3214;
        garen.creepScore=163;
        garen.killVoice="懦弱之举";
        garen.deathVoice="人在塔在";
        garen.keng();
        garen.legendary();
        garen.recovery(300f);
        garen.addSpeed(500);
        garen.getArmor();
        garen.getHp();


        Hero teemo=new Hero();
        teemo.name="提莫";
        teemo.hp=383.d;
        teemo.armor=14.d;
        teemo.moveSpeed=330;

        System.out.println(garen.name+"的血量为"+ garen.hp+"护甲为"+garen.armor+"移动速度为"+garen.moveSpeed);
        System.out.println(teemo.name+"的血量为"+ teemo.hp+"护甲为"+teemo.armor+"移动速度为"+teemo.moveSpeed);
    }

}
