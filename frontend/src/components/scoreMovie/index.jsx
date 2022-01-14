
import MovieStar from 'components/starMovie';
import './style.css'

const scoreMovie = () => {
    const score = 3.5

    return (
        <div className="dsmovie-score-container">
            <p className="dsmovie-score-value">{score > 0 ? score.toFixed(1) : '-'}</p>
            <MovieStar />
            <p className="dsmovie-score-count">{10} avaliações</p>
        </div>
    )
}

export default scoreMovie;