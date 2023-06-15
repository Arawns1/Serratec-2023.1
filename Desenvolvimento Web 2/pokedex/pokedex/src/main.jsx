import React from 'react'
import ReactDOM from 'react-dom/client'
import { AllRoutes } from '../routes/AllRoutes.jsx'
import { GlobalStyle } from './commom/global/GlobalStyle.jsx'
import './index.css'

ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
      <GlobalStyle/>
      <AllRoutes/>
  </React.StrictMode>,
)
