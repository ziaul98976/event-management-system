import React from 'react';
import Events from './pages/Events';

export default function App(){
  return (
    <div className="container mx-auto p-4">
      <h1 className="text-2xl font-bold mb-4">Event Management (Frontend)</h1>
      <Events />
    </div>
  );
}
