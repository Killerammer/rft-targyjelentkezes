package hu.nye.rft.tja.web.domain;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SubjectView implements Comparable<SubjectView>{
    private Long id;
    private String subjectName;
    private String details;

    @Override
    public int compareTo(SubjectView o){
        return id.compareTo(o.id);
    }
}
