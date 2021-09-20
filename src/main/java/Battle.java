public class Battle
{
    //variables for constructor
    private String pikachuName;
    private float pikachuHP;
    private float pikachuAttack;
    private float pikachuDefense;

    private String charizardName;
    private float charizardHP;
    private float charizardAttack;
    private float charizardDefense;

    private int round_num = 1;


    //constructor
    Battle(String ashSlaveName, float ashSlaveAttack, float ashSlaveDefense, float ashSlaveHP,
           String ashSlave2Name, float ashSlave2Attack, float ashSlave2Defense, float ashSlave2HP)
    {
        this.pikachuName = ashSlaveName;
        this.pikachuHP = ashSlaveHP;
        this.pikachuAttack = ashSlaveAttack;
        this.pikachuDefense = ashSlaveDefense;

        this.charizardName = ashSlave2Name;
        this.charizardHP = ashSlave2HP;
        this.charizardAttack = ashSlave2Attack;
        this.charizardDefense = ashSlave2Defense;
    }

    //simulates 1 round
    void simulateRound()
    {
        //damage calcs
        float charizardDamage = charizardAttack - pikachuDefense;
        float pikachuDamage = pikachuAttack - charizardDefense;

        System.out.println("Round " + round_num);
        pikachuHP = pikachuHP - charizardDamage;
        charizardHP = charizardHP - pikachuDamage;

        System.out.println(pikachuName + " does " + pikachuDamage + " points of damage to " + charizardName);
        System.out.println(charizardName + " does " + charizardDamage + " points of damage to " + pikachuName);
        System.out.println(pikachuName + ":  " + pikachuHP);
        System.out.println(charizardName + ":  " + charizardHP);

        round_num = round_num + 1;
    }

    //checks for pokemon 1's death
    boolean isMonster1Dead()
    {
        if (pikachuHP < 0)
        {
            return true;
        }

        return false;
    }

    //gets pokemon 1's name
    String getMonster1Name()
    {
        return pikachuName;
    }

    //gets pokemon 1's HP
    float getMonster1HP()
    {
        return pikachuHP;
    }

    //gets pokemon 1's attack
    float getMonster1Attack()
    {
        return pikachuAttack;
    }

    //gets pokemon 1's defense
    float getMonster1Defense()
    {
        return pikachuDefense;
    }

    //checks for pokemon 2's death
    boolean isMonster2Dead()
    {
        if (charizardHP < 0)
        {
            return true;
        }

        return false;
    }

    //gets pokemon 2's name
    String getMonster2Name()
    {
        return charizardName;
    }

    //gets pokemon 2's HP
    float getMonster2HP()
    {
        return charizardHP;
    }

    //gets pokemon 2's attack
    float getMonster2Attack()
    {
        return charizardAttack;
    }

    //gets pokemon 2's defense
    float getMonster2Defense()
    {
        return charizardDefense;
    }
}
