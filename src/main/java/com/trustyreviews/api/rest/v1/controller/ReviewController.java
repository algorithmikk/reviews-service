package com.trustyreviews.api.rest.v1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.trustyreviews.domain.Review;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api/review-service/v1")
public class ReviewController {
	
	@ApiOperation(value = "Return a list of paginated Reviews with a supported coordinate Id", nickname = "getReviews")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "The execution has been successfull", response = Review.class),
			@ApiResponse(code = 400, message = "Bad request"),
			@ApiResponse(code = 404, message = "The Coordinate for that review has not been found"),
			@ApiResponse(code = 500, message = "Internal server error") })
	@GetMapping(value = { "/review/coordinate/{id}" }, produces = { "application/json" })
	public ResponseEntity<List<Review>> getSettingJukeBox(
			@PathVariable(value = "id") @ApiParam(value = "The ID of the Coordinate", required = true) final Optional<String> id,
			@RequestParam(value = "offset") @ApiParam(value = "Offset for paginated results", required = false) final Optional<Integer> offset,
			@RequestParam(value = "limit") @ApiParam(value = "Limit for paginated results", required = false) final Optional<Integer> limit) {

		return ResponseEntity.ok().body(null);

	}

}
