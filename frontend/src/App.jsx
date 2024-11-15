import React from 'react';
import { BrowserRouter, Routes, Route } from "react-router-dom";

import AddIngredients from './components/AddIngredients';
import AddRecipe from './components/AddRecipe';
import IngredientsList from './components/IngredientsList';
import Login from './components/Login';
import Register from './components/Register';
import Recipes from './components/Recipes';

const App = () => {
  return (
    <BrowserRouter>
      <Routes>
      <Route path="/" element={<Login/>} />
        <Route path="Login" element={<Login/>} />
        <Route path="Register" element={<Register/>} />
        <Route path='Addrecipe' element={<AddRecipe />} />
        <Route path='Addingredients' element={<AddIngredients />} />
        <Route path='Ingredients' element={<IngredientsList />} />
        <Route path='Recipes' element={<Recipes />} />
      </Routes>
    </BrowserRouter>
  );
};

export default App;

