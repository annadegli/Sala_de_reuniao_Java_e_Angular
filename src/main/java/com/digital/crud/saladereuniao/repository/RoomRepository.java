package com.digital.crud.saladereuniao.repository;

import com.digital.crud.saladereuniao.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.PagingAndSortingRepository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long>{

}
