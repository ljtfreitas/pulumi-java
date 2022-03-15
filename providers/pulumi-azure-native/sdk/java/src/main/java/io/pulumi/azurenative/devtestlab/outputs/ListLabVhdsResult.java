// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.outputs;

import io.pulumi.azurenative.devtestlab.outputs.LabVhdResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListLabVhdsResult {
    /**
     * Link for next set of results.
     * 
     */
    private final @Nullable String nextLink;
    /**
     * Results of the list operation.
     * 
     */
    private final @Nullable List<LabVhdResponse> value;

    @CustomType.Constructor
    private ListLabVhdsResult(
        @CustomType.Parameter("nextLink") @Nullable String nextLink,
        @CustomType.Parameter("value") @Nullable List<LabVhdResponse> value) {
        this.nextLink = nextLink;
        this.value = value;
    }

    /**
     * Link for next set of results.
     * 
    */
    public Optional<String> getNextLink() {
        return Optional.ofNullable(this.nextLink);
    }
    /**
     * Results of the list operation.
     * 
    */
    public List<LabVhdResponse> getValue() {
        return this.value == null ? List.of() : this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListLabVhdsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String nextLink;
        private @Nullable List<LabVhdResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListLabVhdsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextLink = defaults.nextLink;
    	      this.value = defaults.value;
        }

        public Builder nextLink(@Nullable String nextLink) {
            this.nextLink = nextLink;
            return this;
        }

        public Builder value(@Nullable List<LabVhdResponse> value) {
            this.value = value;
            return this;
        }
        public ListLabVhdsResult build() {
            return new ListLabVhdsResult(nextLink, value);
        }
    }
}
