package com.warframeapi.warframeapifx.Model;

public class Fissures {
    public String id;

    public String activation;

    public String startString;

    public String expiry;

    public String active;

    public String node;

    public String missionType;

    public String missionKey;

    public String enemy;

    public String enemyKey;

    public String nodeKey;

    public String tier;

    public String tierNum;

    public String expired;

    public String eta;

    public String isStorm;

    public String isHard;

    public Fissures(String id, String activation, String startString, String expiry, String active, String node, String missionType, String missionKey, String enemy, String enemyKey, String nodeKey, String tier, String tierNum, String expired, String eta, String isStorm, String isHard) {
        this.id = id;
        this.activation = activation;
        this.startString = startString;
        this.expiry = expiry;
        this.active = active;
        this.node = node;
        this.missionType = missionType;
        this.missionKey = missionKey;
        this.enemy = enemy;
        this.enemyKey = enemyKey;
        this.nodeKey = nodeKey;
        this.tier = tier;
        this.tierNum = tierNum;
        this.expired = expired;
        this.eta = eta;
        this.isStorm = isStorm;
        this.isHard = isHard;
    }

    public Fissures(){
        this.id = null;
        this.activation = null;
        this.startString = null;
        this.expiry = null;
        this.active = null;
        this.node = null;
        this.missionType = null;
        this.missionKey = null;
        this.enemy = null;
        this.enemyKey = null;
        this.nodeKey = null;
        this.tier = null;
        this.tierNum = null;
        this.expired = null;
        this.eta = null;
        this.isStorm = null;
        this.isHard = null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getActivation() {
        return activation;
    }

    public void setActivation(String activation) {
        this.activation = activation;
    }

    public String getStartString() {
        return startString;
    }

    public void setStartString(String startString) {
        this.startString = startString;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public String getMissionType() {
        return missionType;
    }

    public void setMissionType(String missionType) {
        this.missionType = missionType;
    }

    public String getMissionKey() {
        return missionKey;
    }

    public void setMissionKey(String missionKey) {
        this.missionKey = missionKey;
    }

    public String getEnemy() {
        return enemy;
    }

    public void setEnemy(String enemy) {
        this.enemy = enemy;
    }

    public String getEnemyKey() {
        return enemyKey;
    }

    public void setEnemyKey(String enemyKey) {
        this.enemyKey = enemyKey;
    }

    public String getNodeKey() {
        return nodeKey;
    }

    public void setNodeKey(String nodeKey) {
        this.nodeKey = nodeKey;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public String getTierNum() {
        return tierNum;
    }

    public void setTierNum(String tierNum) {
        this.tierNum = tierNum;
    }

    public String getExpired() {
        return expired;
    }

    public void setExpired(String expired) {
        this.expired = expired;
    }

    public String getEta() {
        return eta;
    }

    public void setEta(String eta) {
        this.eta = eta;
    }

    public String getIsStorm() {
        return isStorm;
    }

    public void setIsStorm(String isStorm) {
        this.isStorm = isStorm;
    }

    public String getIsHard() {
        return isHard;
    }

    public void setIsHard(String isHard) {
        this.isHard = isHard;
    }
}
