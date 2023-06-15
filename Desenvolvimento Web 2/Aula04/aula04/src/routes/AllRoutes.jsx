import { BrowserRouter, Route, Routes } from 'react-router-dom'
import Home from '../components/Home'
import LoginPage from '.././components/Login/LoginPage'
import { Header } from '.././components/Header/Header'
import ComponenteDePagina404 from '.././components/404/ComponenteDePagina404'

export function AllRoutes() {
    return (
        <BrowserRouter>
            <Routes>
                <Route Component={Header}> {/* Esse aparece em todos que estão dentro dele */}
                    <Route Component={Home} path='/' ></Route>
                    <Route Component={LoginPage} path='/login' ></Route>
                </Route>

                <Route path='*' Component={ComponenteDePagina404} />
            </Routes>

        </BrowserRouter>
    )
}