package io.github.uetoyo.patterns.specification;

import io.github.uetoyo.patterns.specification.protocols.Immutable;

/** 
 * Conjunction specification represents the logical AND.
 * 
 * @param <T> The type of entity for which the specification is defined.
 */
@Immutable
final class ConjunctionSpecification<T> extends BinaryCompositeSpecification<T> {
	
	public ConjunctionSpecification(final Specification<T> spec1, final Specification<T> spec2) {
		super(spec1, spec2);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isSatisfiedBy(final T candidate) {
		return getSpecificationOne().isSatisfiedBy(candidate) && getSpecificationTwo().isSatisfiedBy(candidate);
	}
}
