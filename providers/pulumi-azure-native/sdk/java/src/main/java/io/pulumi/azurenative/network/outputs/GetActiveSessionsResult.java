// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.BastionActiveSessionResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetActiveSessionsResult {
    /**
     * The URL to get the next set of results.
     * 
     */
    private final @Nullable String nextLink;
    /**
     * List of active sessions on the bastion.
     * 
     */
    private final @Nullable List<BastionActiveSessionResponse> value;

    @OutputCustomType.Constructor({"nextLink","value"})
    private GetActiveSessionsResult(
        @Nullable String nextLink,
        @Nullable List<BastionActiveSessionResponse> value) {
        this.nextLink = nextLink;
        this.value = value;
    }

    /**
     * The URL to get the next set of results.
     * 
     */
    public Optional<String> getNextLink() {
        return Optional.ofNullable(this.nextLink);
    }
    /**
     * List of active sessions on the bastion.
     * 
     */
    public List<BastionActiveSessionResponse> getValue() {
        return this.value == null ? List.of() : this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetActiveSessionsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String nextLink;
        private @Nullable List<BastionActiveSessionResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetActiveSessionsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextLink = defaults.nextLink;
    	      this.value = defaults.value;
        }

        public Builder setNextLink(@Nullable String nextLink) {
            this.nextLink = nextLink;
            return this;
        }

        public Builder setValue(@Nullable List<BastionActiveSessionResponse> value) {
            this.value = value;
            return this;
        }

        public GetActiveSessionsResult build() {
            return new GetActiveSessionsResult(nextLink, value);
        }
    }
}
