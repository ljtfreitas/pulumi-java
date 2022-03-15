// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.policyinsights.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The filters that will be applied to determine which resources to remediate.
 * 
 */
public final class RemediationFiltersResponse extends io.pulumi.resources.InvokeArgs {

    public static final RemediationFiltersResponse Empty = new RemediationFiltersResponse();

    /**
     * The resource locations that will be remediated.
     * 
     */
    @Import(name="locations")
      private final @Nullable List<String> locations;

    public List<String> getLocations() {
        return this.locations == null ? List.of() : this.locations;
    }

    public RemediationFiltersResponse(@Nullable List<String> locations) {
        this.locations = locations;
    }

    private RemediationFiltersResponse() {
        this.locations = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RemediationFiltersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> locations;

        public Builder() {
    	      // Empty
        }

        public Builder(RemediationFiltersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.locations = defaults.locations;
        }

        public Builder locations(@Nullable List<String> locations) {
            this.locations = locations;
            return this;
        }
        public RemediationFiltersResponse build() {
            return new RemediationFiltersResponse(locations);
        }
    }
}
