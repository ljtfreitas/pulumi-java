// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1.inputs.DistributionResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * This represents a particular package that is distributed over various channels. E.g., glibc (aka libc6) is distributed by many, at various versions.
 * 
 */
public final class PackageNoteResponse extends io.pulumi.resources.InvokeArgs {

    public static final PackageNoteResponse Empty = new PackageNoteResponse();

    /**
     * The various channels by which a package is distributed.
     * 
     */
    @InputImport(name="distribution", required=true)
      private final List<DistributionResponse> distribution;

    public List<DistributionResponse> getDistribution() {
        return this.distribution;
    }

    /**
     * Immutable. The name of the package.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    public PackageNoteResponse(
        List<DistributionResponse> distribution,
        String name) {
        this.distribution = Objects.requireNonNull(distribution, "expected parameter 'distribution' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private PackageNoteResponse() {
        this.distribution = List.of();
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackageNoteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<DistributionResponse> distribution;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(PackageNoteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distribution = defaults.distribution;
    	      this.name = defaults.name;
        }

        public Builder setDistribution(List<DistributionResponse> distribution) {
            this.distribution = Objects.requireNonNull(distribution);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public PackageNoteResponse build() {
            return new PackageNoteResponse(distribution, name);
        }
    }
}
