import React from "react";

class sycle extends React.Component {

    constructor(props) {
        super(props);
        this.state = { count : 0 };
        console.log('1. constructor Call');
    }

    render() {
        console.log('3. render Call');
        return (
            <div>
                <h2> [This is Render Function] </h2>
                <p> {this.state.count} 번 클릭했어용 </p>
                <button onClick={() => this.setState({count : this.state.count +1})}>
                    Click!
                </button>
            </div>
        )
    }
}

export default sycle;