// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare.outputs;

import io.pulumi.azurenative.datashare.outputs.ShareSynchronizationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListShareSynchronizationsResult {
    /**
     * The Url of next result page.
     * 
     */
    private final @Nullable String nextLink;
    /**
     * Collection of items of type DataTransferObjects.
     * 
     */
    private final List<ShareSynchronizationResponse> value;

    @OutputCustomType.Constructor({"nextLink","value"})
    private ListShareSynchronizationsResult(
        @Nullable String nextLink,
        List<ShareSynchronizationResponse> value) {
        this.nextLink = nextLink;
        this.value = Objects.requireNonNull(value);
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
    public List<ShareSynchronizationResponse> getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListShareSynchronizationsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String nextLink;
        private List<ShareSynchronizationResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListShareSynchronizationsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextLink = defaults.nextLink;
    	      this.value = defaults.value;
        }

        public Builder setNextLink(@Nullable String nextLink) {
            this.nextLink = nextLink;
            return this;
        }

        public Builder setValue(List<ShareSynchronizationResponse> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public ListShareSynchronizationsResult build() {
            return new ListShareSynchronizationsResult(nextLink, value);
        }
    }
}
