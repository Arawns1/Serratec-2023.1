import React from 'react'
import ReactDOM from 'react-dom/client'
import './index.css'
import Home from './components/Home/index.jsx'
import LoginPage from './components/Login/LoginPage'
import {BrowserRouter, Routes, Route} from 'react-router-dom'
import { Header } from './components/Header/Header'
import ComponenteDePagina404 from './components/404/ComponenteDePagina404'

ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    <BrowserRouter>
      <Routes>
        <Route Component={Header}> {/* Esse aparece em todos que estão dentro dele */}
          <Route Component={Home}  path='/' ></Route>
          <Route Component={LoginPage} path='/login' ></Route>
        </Route>

        <Route path='*' Component={ComponenteDePagina404} />
      </Routes>
    </BrowserRouter>
    
   {/* 
   <LoginPage/>
   <Home />*/}
  </React.StrictMode>,
)
