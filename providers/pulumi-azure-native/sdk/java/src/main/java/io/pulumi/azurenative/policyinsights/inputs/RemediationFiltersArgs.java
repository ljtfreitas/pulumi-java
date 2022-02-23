// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.policyinsights.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The filters that will be applied to determine which resources to remediate.
 * 
 */
public final class RemediationFiltersArgs extends io.pulumi.resources.ResourceArgs {

    public static final RemediationFiltersArgs Empty = new RemediationFiltersArgs();

    /**
     * The resource locations that will be remediated.
     * 
     */
    @InputImport(name="locations")
        private final @Nullable Input<List<String>> locations;

    public Input<List<String>> getLocations() {
        return this.locations == null ? Input.empty() : this.locations;
    }

    public RemediationFiltersArgs(@Nullable Input<List<String>> locations) {
        this.locations = locations;
    }

    private RemediationFiltersArgs() {
        this.locations = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RemediationFiltersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> locations;

        public Builder() {
    	      // Empty
        }

        public Builder(RemediationFiltersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.locations = defaults.locations;
        }

        public Builder setLocations(@Nullable Input<List<String>> locations) {
            this.locations = locations;
            return this;
        }

        public Builder setLocations(@Nullable List<String> locations) {
            this.locations = Input.ofNullable(locations);
            return this;
        }
        public RemediationFiltersArgs build() {
            return new RemediationFiltersArgs(locations);
        }
    }
}
