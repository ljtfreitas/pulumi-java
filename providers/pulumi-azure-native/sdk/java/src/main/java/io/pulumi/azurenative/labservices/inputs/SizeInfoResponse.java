// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contains detailed information about a size
 * 
 */
public final class SizeInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final SizeInfoResponse Empty = new SizeInfoResponse();

    /**
     * Represents the actual compute size, e.g. Standard_A2_v2.
     * 
     */
    @InputImport(name="computeSize")
    private final @Nullable String computeSize;

    public Optional<String> getComputeSize() {
        return this.computeSize == null ? Optional.empty() : Optional.ofNullable(this.computeSize);
    }

    /**
     * The amount of memory available (in GB).
     * 
     */
    @InputImport(name="memory")
    private final @Nullable Double memory;

    public Optional<Double> getMemory() {
        return this.memory == null ? Optional.empty() : Optional.ofNullable(this.memory);
    }

    /**
     * The number of cores a VM of this size has.
     * 
     */
    @InputImport(name="numberOfCores")
    private final @Nullable Integer numberOfCores;

    public Optional<Integer> getNumberOfCores() {
        return this.numberOfCores == null ? Optional.empty() : Optional.ofNullable(this.numberOfCores);
    }

    /**
     * The pay-as-you-go price per hour this size will cost. It does not include discounts and may not reflect the actual price the size will cost.
     * 
     */
    @InputImport(name="price")
    private final @Nullable Double price;

    public Optional<Double> getPrice() {
        return this.price == null ? Optional.empty() : Optional.ofNullable(this.price);
    }

    public SizeInfoResponse(
        @Nullable String computeSize,
        @Nullable Double memory,
        @Nullable Integer numberOfCores,
        @Nullable Double price) {
        this.computeSize = computeSize;
        this.memory = memory;
        this.numberOfCores = numberOfCores;
        this.price = price;
    }

    private SizeInfoResponse() {
        this.computeSize = null;
        this.memory = null;
        this.numberOfCores = null;
        this.price = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SizeInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String computeSize;
        private @Nullable Double memory;
        private @Nullable Integer numberOfCores;
        private @Nullable Double price;

        public Builder() {
    	      // Empty
        }

        public Builder(SizeInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeSize = defaults.computeSize;
    	      this.memory = defaults.memory;
    	      this.numberOfCores = defaults.numberOfCores;
    	      this.price = defaults.price;
        }

        public Builder setComputeSize(@Nullable String computeSize) {
            this.computeSize = computeSize;
            return this;
        }

        public Builder setMemory(@Nullable Double memory) {
            this.memory = memory;
            return this;
        }

        public Builder setNumberOfCores(@Nullable Integer numberOfCores) {
            this.numberOfCores = numberOfCores;
            return this;
        }

        public Builder setPrice(@Nullable Double price) {
            this.price = price;
            return this;
        }

        public SizeInfoResponse build() {
            return new SizeInfoResponse(computeSize, memory, numberOfCores, price);
        }
    }
}
