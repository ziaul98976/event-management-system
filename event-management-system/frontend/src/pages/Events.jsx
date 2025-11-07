import React, {useEffect, useState} from 'react';
import axios from 'axios';

export default function Events(){
  const [events, setEvents] = useState([]);

  useEffect(()=>{
    axios.get('http://localhost:8080/api/public/events')
      .then(res => setEvents(res.data))
      .catch(err => console.error(err));
  },[]);

  return (
    <div>
      <h2 className="text-xl mb-2">Upcoming Events</h2>
      <ul>
        {events.map(e=>(
          <li key={e.id} className="p-2 border mb-2 rounded">
            <strong>{e.title}</strong> — {e.description} <br/>
            <small>{e.eventDate} @ {e.location}</small>
          </li>
        ))}
      </ul>
    </div>
  );
}
