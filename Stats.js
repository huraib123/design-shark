import React from 'react'

export default function Stats() {
  return (
    <div>
       <div className="seo-overview">

      {/* COUNTER SECTION */}
      <div className="seo-counters">
        <div className="counter-block">
          <h2>3K+</h2>
          <p>Successful Project</p>
        </div>
        <div className="divider" />
        <div className="counter-block">
          <h2>20K</h2>
          <p>Experienced Team</p>
        </div>
        <div className="divider" />
        <div className="counter-block">
          <h2>43K+</h2>
          <p>Happy Customers</p>
        </div>
        <div className="divider" />
        <div className="counter-block">
          <h2>36K+</h2>
          <p>Client 5 Star Review</p>
        </div>
      </div>

      {/* ROTATED BANNER STRIP */}
      <div className="seo-banner-wrapper">
        <div className="seo-banner">
          <span>✨ SEO Strategy Development ✨ Search Engine Optimization ✨ Research & Analysis ✨</span>
        </div>
      </div>

      {/* SERVICE SECTION */}
      <div className="seo-services">
        <div >🟡 ● Our Services</div>
       <div className='bhai'> <h1> Boost your SEO ranking with <br /> excellent effective services</h1>
        </div>
        <div className="circle-button">View All Work ↗</div>
      </div>

    </div>
    </div>
  )
}
