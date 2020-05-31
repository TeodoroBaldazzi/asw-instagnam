package asw.instagnam.common.event;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RicettaCreatedEvent implements DomainEvent {
    private Long id;
    private String autore;
    private String titolo;
}
