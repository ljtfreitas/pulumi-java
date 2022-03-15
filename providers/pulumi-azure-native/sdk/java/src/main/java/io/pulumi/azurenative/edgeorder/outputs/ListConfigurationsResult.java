// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.outputs;

import io.pulumi.azurenative.edgeorder.outputs.ConfigurationResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListConfigurationsResult {
    /**
     * Link for the next set of configurations.
     * 
     */
    private final @Nullable String nextLink;
    /**
     * List of configurations.
     * 
     */
    private final List<ConfigurationResponse> value;

    @CustomType.Constructor
    private ListConfigurationsResult(
        @CustomType.Parameter("nextLink") @Nullable String nextLink,
        @CustomType.Parameter("value") List<ConfigurationResponse> value) {
        this.nextLink = nextLink;
        this.value = value;
    }

    /**
     * Link for the next set of configurations.
     * 
    */
    public Optional<String> getNextLink() {
        return Optional.ofNullable(this.nextLink);
    }
    /**
     * List of configurations.
     * 
    */
    public List<ConfigurationResponse> getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListConfigurationsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String nextLink;
        private List<ConfigurationResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListConfigurationsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextLink = defaults.nextLink;
    	      this.value = defaults.value;
        }

        public Builder nextLink(@Nullable String nextLink) {
            this.nextLink = nextLink;
            return this;
        }

        public Builder value(List<ConfigurationResponse> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public ListConfigurationsResult build() {
            return new ListConfigurationsResult(nextLink, value);
        }
    }
}
