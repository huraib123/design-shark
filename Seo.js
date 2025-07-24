import React from 'react'

export default function Seo() {
  return (
    <div>
         <center><p className="seo-subheading">🔊 Welcome to SEO Agency</p></center>
      <center> <h1 ClassName="seo-h">Comprehensive SEO & <br></br> Digital Marketing Solutions.</h1></center>
       <div className="seo-container">
        
      <div className="seo-text">
        <p>
          Our SEO services ensure your website ranks higher on search engines like Google,
          helping your
          business attract more organic traffic. From keyword research and
          on-page optimization to link building and technical SEO, we use proven strategies
          to improve your visibility and authority online.We believe in making informed decisions by using analytics and performance.
        </p>

        <div className="progress-section">
          <p>SEO Analysis</p>
          <div className="progress-bar">
            <div className="progress-fill" style={{ width: '80%' }}></div>
          </div>
          <p>Marketing Strategy</p>
          <div className="progress-bar">
            <div className="progress-fill" style={{ width: '90%' }}></div>
          </div>
        </div>

        <button className="cta-button">More About Us ➜</button>
      </div>

      <div className="seo-image">
        <img src="./image/person2.webp" alt="SEO Banner" />
      </div>
      <div className="hello">
        <img src="./image/person3.webp" alt="SEO Banner"/>
      
      </div>
      
       
      
    </div>
    </div>
  )
}
