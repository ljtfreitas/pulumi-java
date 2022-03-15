// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare.outputs;

import io.pulumi.azurenative.datashare.outputs.SynchronizationDetailsResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListShareSynchronizationDetailsResult {
    /**
     * The Url of next result page.
     * 
     */
    private final @Nullable String nextLink;
    /**
     * Collection of items of type DataTransferObjects.
     * 
     */
    private final List<SynchronizationDetailsResponse> value;

    @CustomType.Constructor
    private ListShareSynchronizationDetailsResult(
        @CustomType.Parameter("nextLink") @Nullable String nextLink,
        @CustomType.Parameter("value") List<SynchronizationDetailsResponse> value) {
        this.nextLink = nextLink;
        this.value = value;
    }

    /**
     * The Url of next result page.
     * 
    */
    public Optional<String> getNextLink() {
        return Optional.ofNullable(this.nextLink);
    }
    /**
     * Collection of items of type DataTransferObjects.
     * 
    */
    public List<SynchronizationDetailsResponse> getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListShareSynchronizationDetailsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String nextLink;
        private List<SynchronizationDetailsResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListShareSynchronizationDetailsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextLink = defaults.nextLink;
    	      this.value = defaults.value;
        }

        public Builder nextLink(@Nullable String nextLink) {
            this.nextLink = nextLink;
            return this;
        }

        public Builder value(List<SynchronizationDetailsResponse> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public ListShareSynchronizationDetailsResult build() {
            return new ListShareSynchronizationDetailsResult(nextLink, value);
        }
    }
}
