// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * Adds interests to the portfolio page.
 */
async function getServerInterest() {
    const responseFromServer = await fetch("/interests");
    // The json() function returns an object that contains fields that we can
    // reference to create HTML.
    const inJFile = await responseFromServer.json();
    const interestListElement = document.getElementById('server-interests-container');
    interestListElement.innerHTML = inJFile;// can I return a string json file here?
  
  }
/**
 * Adds google map to the portfolio page.
 */
  function createMap() {
    const map = new google.maps.Map(
        document.getElementById('map'),
        {center: {lat: 49.24, lng: -123.116}, zoom: 10});

    const trexMarker = new google.maps.Marker({
        position: {lat: 49.246292, lng: -123.116226},
        map: map,
        title: 'My location'
          });
  }