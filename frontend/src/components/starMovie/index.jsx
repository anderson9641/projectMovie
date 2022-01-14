import { ReactComponent as StarFull } from 'assets/img/starFull.svg';
import { ReactComponent as StarHalf } from 'assets/img/starHalf.svg';
import { ReactComponent as StarEmpty } from 'assets/img/starEmpty.svg';

import './style.css'

const starMovie = () => {

    return (
        <div className="dsmovie-stars-container">
            <StarFull />
            <StarFull />
            <StarFull />
            <StarHalf />
            <StarEmpty />
        </div>
    )
}
export default starMovie;