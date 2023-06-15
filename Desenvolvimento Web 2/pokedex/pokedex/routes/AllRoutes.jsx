import { BrowserRouter, Route, Routes } from 'react-router-dom'
import { Header } from '../src/components/Header'
import Home from '../src/pages/Home'

export function AllRoutes() {
    return (
        <BrowserRouter>
            <Routes>
                <Route Component={Header}> {/* Esse aparece em todos que estão dentro dele */}
                <Route Component={Home}  path='/'></Route>
                </Route>
            </Routes>

        </BrowserRouter>
    )
}