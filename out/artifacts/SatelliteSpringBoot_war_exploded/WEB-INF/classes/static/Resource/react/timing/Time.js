'use strict';

const e = React.createElement;
var timeDiff="Chờ 1s, đang lấy dữ liệu 😁 ...";
class Timer extends React.Component {
    constructor(props) {
        super(props);
        this.state = {date: new Date()};
    }

    componentDidMount() {
        this.timerID = setInterval(
            () => this.tick(),
            1000
        );
    }

    componentWillUnmount() {
        clearInterval(this.timerID);
    }

    tick() {
        this.setState({
            date: new Date()
        });
        var ms=(this.state.date)-(new Date("June, 20, 2020"))
        var d, h, m, s;
        s = Math.floor(ms / 1000);
        m = Math.floor(s / 60);
        s = s % 60;
        h = Math.floor(m / 60);
        m = m % 60;
        d = Math.floor(h / 24);
        h = h % 24;
        timeDiff=d+" Ngày, "+h+" giờ và "+m+" phút "+s+" giây";
    }

    render() {
        return (
            <span>{timeDiff}</span>
    );
    }
}

const domContainer = document.querySelector('#react-timer');
ReactDOM.render(<Timer/>, domContainer);