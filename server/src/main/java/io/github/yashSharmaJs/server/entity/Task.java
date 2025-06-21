package io.github.yashSharmaJs.server.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private LocalDate dueDate;
    private boolean activeYN;
    private LocalDate createdAt;
    private LocalDate updatedAt;
//    @Enumerated(EnumType.STRING)
//    private TaskStatus status; // TO_DO, IN_PROGRESS, DONE

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    // Optionally: assigned user
    @ManyToOne
    @JoinColumn(name = "assigned_to")
    private User assignedTo;

    // Getters & setters
}
