/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    let presentCounter = init;
    function increment(){
        return ++presentCounter;
    }
    function decrement(){
        return --presentCounter;
    }
    function reset(){
        return (presentCounter=init);
    }

    return {increment, decrement, reset};
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */