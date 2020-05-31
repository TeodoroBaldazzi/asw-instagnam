package asw.instagnam.common.event;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ConnessioneCreatedEvent implements DomainEvent {
    private String followedId;
    private String followerId;
}
