
package com.maersk.poc.repo;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.maersk.poc.model.Booking;

/**
 * @author rkumar
 *
 */
public interface BookingRepo extends CassandraRepository<Booking> {

}
