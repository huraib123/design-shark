import React from 'react'

export default function Login() {
  return (
    <div>
      <div className="login-container">
      <form className="login-form">
        <h2>Login</h2>

        <div className="form-group">
          <label htmlFor="name">name</label>
          <input type="text" id="name" placeholder="Enter your name" required />
        </div>

        <div className="form-group">
          <label htmlFor="username">username</label>    
          <input type="username" id="username" placeholder="Enter your username" required />
        </div>
        <div className="form-group">
          <label htmlFor="password">Password</label>
          <input type="password" id="password" placeholder="Enter your password" required />
        </div>

        <button type="submit">Login</button>
      </form>
    </div>
    </div>
  )
}
