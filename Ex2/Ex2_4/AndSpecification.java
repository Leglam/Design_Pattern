import java.util.Arrays;
import java.util.List;

public class AndSpecification<T> implements ISpecification<T>
{
    private List<ISpecification<T>> specification;

    public AndSpecification(ISpecification<T> ...specs)
    {
        this.specification = Arrays.asList(specs);
    }

    @Override
    public boolean isSatisfied(T item)
    {
        return specification.stream().allMatch(spec -> spec.isSatisfied(item));
    }
}
