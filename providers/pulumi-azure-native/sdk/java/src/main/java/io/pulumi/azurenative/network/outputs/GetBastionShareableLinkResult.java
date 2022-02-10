// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.BastionShareableLinkResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetBastionShareableLinkResult {
    private final @Nullable String nextLink;
    private final @Nullable List<BastionShareableLinkResponse> value;

    @OutputCustomType.Constructor({"nextLink","value"})
    private GetBastionShareableLinkResult(
        @Nullable String nextLink,
        @Nullable List<BastionShareableLinkResponse> value) {
        this.nextLink = nextLink;
        this.value = value;
    }

    public Optional<String> getNextLink() {
        return Optional.ofNullable(this.nextLink);
    }
    public List<BastionShareableLinkResponse> getValue() {
        return this.value == null ? List.of() : this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBastionShareableLinkResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String nextLink;
        private @Nullable List<BastionShareableLinkResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBastionShareableLinkResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextLink = defaults.nextLink;
    	      this.value = defaults.value;
        }

        public Builder setNextLink(@Nullable String nextLink) {
            this.nextLink = nextLink;
            return this;
        }

        public Builder setValue(@Nullable List<BastionShareableLinkResponse> value) {
            this.value = value;
            return this;
        }

        public GetBastionShareableLinkResult build() {
            return new GetBastionShareableLinkResult(nextLink, value);
        }
    }
}