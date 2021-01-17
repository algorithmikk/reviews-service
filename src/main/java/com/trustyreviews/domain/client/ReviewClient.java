package com.trustyreviews.domain.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jukeboxapp.jukebox.domain.dto.JukeBoxDto;
import com.jukeboxapp.jukebox.domain.dto.SettingsDto;

@FeignClient(name = "geopos", url = "https://www.googleapis.com/geolocation/v1")
@Primary
public interface ReviewClient {

	@RequestMapping(method = RequestMethod.POST, value = "/geolocate?key=AIzaSyAfVpvYn3Tno40FmU-eP56POFkR1B-BNr0")
	List<JukeBoxDto> getListOfGeoPos();


}
