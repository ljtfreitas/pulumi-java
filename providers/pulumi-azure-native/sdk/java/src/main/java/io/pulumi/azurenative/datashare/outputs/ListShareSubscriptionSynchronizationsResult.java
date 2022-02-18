// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare.outputs;

import io.pulumi.azurenative.datashare.outputs.ShareSubscriptionSynchronizationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListShareSubscriptionSynchronizationsResult {
    /**
     * The Url of next result page.
     * 
     */
    private final @Nullable String nextLink;
    /**
     * Collection of items of type DataTransferObjects.
     * 
     */
    private final List<ShareSubscriptionSynchronizationResponse> value;

    @OutputCustomType.Constructor({"nextLink","value"})
    private ListShareSubscriptionSynchronizationsResult(
        @Nullable String nextLink,
        List<ShareSubscriptionSynchronizationResponse> value) {
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
    public List<ShareSubscriptionSynchronizationResponse> getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListShareSubscriptionSynchronizationsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String nextLink;
        private List<ShareSubscriptionSynchronizationResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListShareSubscriptionSynchronizationsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextLink = defaults.nextLink;
    	      this.value = defaults.value;
        }

        public Builder setNextLink(@Nullable String nextLink) {
            this.nextLink = nextLink;
            return this;
        }

        public Builder setValue(List<ShareSubscriptionSynchronizationResponse> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public ListShareSubscriptionSynchronizationsResult build() {
            return new ListShareSubscriptionSynchronizationsResult(nextLink, value);
        }
    }
}
