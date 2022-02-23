// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.azurenative.containerregistry.outputs.BuildArgumentResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListBuildStepBuildArgumentsResult {
    /**
     * The URI that can be used to request the next set of paged results.
     * 
     */
    private final @Nullable String nextLink;
    /**
     * The collection value.
     * 
     */
    private final @Nullable List<BuildArgumentResponse> value;

    @OutputCustomType.Constructor({"nextLink","value"})
    private ListBuildStepBuildArgumentsResult(
        @Nullable String nextLink,
        @Nullable List<BuildArgumentResponse> value) {
        this.nextLink = nextLink;
        this.value = value;
    }

    /**
     * The URI that can be used to request the next set of paged results.
     * 
     */
    public Optional<String> getNextLink() {
        return Optional.ofNullable(this.nextLink);
    }
    /**
     * The collection value.
     * 
     */
    public List<BuildArgumentResponse> getValue() {
        return this.value == null ? List.of() : this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListBuildStepBuildArgumentsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String nextLink;
        private @Nullable List<BuildArgumentResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListBuildStepBuildArgumentsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextLink = defaults.nextLink;
    	      this.value = defaults.value;
        }

        public Builder setNextLink(@Nullable String nextLink) {
            this.nextLink = nextLink;
            return this;
        }

        public Builder setValue(@Nullable List<BuildArgumentResponse> value) {
            this.value = value;
            return this;
        }
        public ListBuildStepBuildArgumentsResult build() {
            return new ListBuildStepBuildArgumentsResult(nextLink, value);
        }
    }
}
