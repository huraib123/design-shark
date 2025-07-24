import React from 'react'

export default function Services() {
    
const services = [
  'Pay-Per-Click (PPC) Advertising',
  'Content Marketing',
  'Email Marketing',
  'Social Media Marketing',
  'Conversion Rate Optimization',
];
  return (
    <div>
      <div className="seo-section">
      <div className="seo-left">
        <div className="seo-item active">
          <div ><h2>Search Engine Optimization</h2>
          <span className="arrow">➜</span>
          </div>
          <br/>
          <div>
            Our SEO services ensure your website ranks higher on search engines like Google, helping your business.
          </div>
          
        </div>
        <div className='rasool'>   
                 {services.map((item, idx) => (
          <div className="seo-item" key={idx}>
            <h3>{item}</h3>
            
            <span className="arrow-out">↗</span>
            
          </div>
        ))}
        </div>

      </div>

      <div className="seo-right">
        <img src="./image/seo.webp" alt="SEO Display" />
      </div>
    </div>
    </div>
  )
}
