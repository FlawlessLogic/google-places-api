/*
Copyright 2013 TENEA TECNOLOG�AS. All rights reserved.

Redistribution and use in source and binary forms, with or without modification, are
permitted provided that the following conditions are met:
 
   1. Redistributions of source code must retain the above copyright notice, this list of
      conditions and the following disclaimer.
 
   2. Redistributions in binary form must reproduce the above copyright notice, this list
      of conditions and the following disclaimer in the documentation and/or other materials
      provided with the distribution.
 
THIS SOFTWARE IS PROVIDED BY TENEA TECNOLOG�AS ''AS IS'' AND ANY EXPRESS OR IMPLIED
WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL TENEA TECNOLOG�AS OR
CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 
The views and conclusions contained in the software and documentation are those of the
authors and should not be interpreted as representing official policies, either expressed
or implied, of TENEA TECNOLOG�AS.
 */

package com.tenea.googleplacesapi.places;

public class Geometry {

	private Coordinates location;
	private Coordinates northeast;
	private Coordinates southwest;

	public Coordinates getLocation() {
		return location;
	}

	public void setLocation(Coordinates location) {
		this.location = location;
	}

	public Coordinates getNortheast() {
		return northeast;
	}

	public void setNortheast(Coordinates northeast) {
		this.northeast = northeast;
	}

	public Coordinates getSouthwest() {
		return southwest;
	}

	public void setSouthwest(Coordinates southwest) {
		this.southwest = southwest;
	}

}
