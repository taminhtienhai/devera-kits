package devera.kits.injector.model;

import devera.kits.injector.Dependency;
import devera.kits.injector.Inject;

@Dependency
public class School {
    @Inject
    public Student student;

    @Inject
    public Certification certification;
}
