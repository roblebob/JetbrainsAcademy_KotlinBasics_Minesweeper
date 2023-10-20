// Do not change the code below!

interface IMovable {
    val externalEffect: Boolean
    val selfEffect: Boolean
}

interface IMassive {
    val mass: Int
    var massMultiplier: Int
}

interface IControllable {
    var currentlyControlled: Boolean
    var controllers: Int
}

interface ISimulated : IMovable, IMassive {
    var isSimulating: Boolean
}

interface Entity : ISimulated {
    val entityId: Int
}

// Do not change the code above!

class Player : Entity, IControllable {
    override val externalEffect: Boolean
    override val selfEffect: Boolean
    override val mass: Int
    override var massMultiplier: Int
    override var currentlyControlled: Boolean
    override var controllers: Int
    override var isSimulating: Boolean
    override val entityId: Int

    //Your code here
    constructor(
        externalEffect: Boolean,
        selfEffect: Boolean,
        mass: Int,
        massMultiplier: Int,
        currentlyControlled: Boolean,
        controllers: Int,
        isSimulating: Boolean,
        entityId: Int
    ) {
        this.externalEffect = externalEffect
        this.selfEffect = selfEffect
        this.mass = mass
        this.massMultiplier = massMultiplier
        this.currentlyControlled = currentlyControlled
        this.controllers = controllers
        this.isSimulating = isSimulating
        this.entityId = entityId
    }
}