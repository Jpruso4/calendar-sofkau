package co.com.sofka.calendar.services;

import co.com.sofka.calendar.model.ProgramDate;
import reactor.core.publisher.Flux;
import java.time.LocalDate;

public interface ISchedulerService {
    Flux<ProgramDate> generateCalendar(String programId, LocalDate startDate);
}
