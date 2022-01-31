package Lambda.task;

import lombok.*;

//@Getter
//@Setter
//@ToString
//@AllArgsConstructor
@Builder
@Data

public class Orange {

    private int weight;
    private Color color;
}

//Builder generate an @All ArgsConstructor unless there is another @X Constructor