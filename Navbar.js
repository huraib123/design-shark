import React from 'react'
import { Link } from 'react-router-dom'
export default function Navbar() {
  return (
    <div>
      <header className="hero-container">
      <nav className="navbar">
        <div className="logo">🟡 SAOR</div>
        <ul className="nav-links">
          <li to="/Home">Home</li>
          <li>About</li>
          <li>Portfolio</li>
          <li>Pages</li>
          <li>Blog</li>
          <li>Contact</li>

          <li><button className="quote-btn">Get A Quote →</button></li>
          <Link to="/enroll"className="quote-btn">Click hero to Enroll Yourself</Link>
        </ul>
      </nav>

      <div className="hero-content">
        <div className="text-content">
          <span className="highlight">SEO & Marketing Agency</span>
          <h1>
            Empowering <br />
            Growth Unlock <br />
            <strong>SEO Solutions</strong>
          </h1>
          <p>
            At Saor, we are dedicated to helping businesses navigate the complex
            digital landscape with ease. We specialize in providing a full
            spectrum of SEO.
          </p>
          <button className="get-started">Get Started Now →</button>
        </div>

        <div className="image-content">
          <img src="./image/myimage.jpg" alt="Person" />
        </div>
      </div>
    </header>
    </div>
  )
}
