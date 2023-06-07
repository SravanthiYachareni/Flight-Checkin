package com.kk.flightcheckin.integration;

import com.kk.flightcheckin.dto.Reservation;
import com.kk.flightcheckin.dto.ReservationUpdateRequest;

public interface ReservationRestClient {

	public Reservation findReservation(Long Id);

	public Reservation updateReservation(ReservationUpdateRequest request);

}
