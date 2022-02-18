// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.outputs;

import io.pulumi.azurenative.devices.outputs.SharedAccessSignatureAuthorizationRuleResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListIotHubResourceKeysResult {
    /**
     * The next link.
     * 
     */
    private final String nextLink;
    /**
     * The list of shared access policies.
     * 
     */
    private final @Nullable List<SharedAccessSignatureAuthorizationRuleResponse> value;

    @OutputCustomType.Constructor({"nextLink","value"})
    private ListIotHubResourceKeysResult(
        String nextLink,
        @Nullable List<SharedAccessSignatureAuthorizationRuleResponse> value) {
        this.nextLink = Objects.requireNonNull(nextLink);
        this.value = value;
    }

    /**
     * The next link.
     * 
     */
    public String getNextLink() {
        return this.nextLink;
    }
    /**
     * The list of shared access policies.
     * 
     */
    public List<SharedAccessSignatureAuthorizationRuleResponse> getValue() {
        return this.value == null ? List.of() : this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListIotHubResourceKeysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String nextLink;
        private @Nullable List<SharedAccessSignatureAuthorizationRuleResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListIotHubResourceKeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextLink = defaults.nextLink;
    	      this.value = defaults.value;
        }

        public Builder setNextLink(String nextLink) {
            this.nextLink = Objects.requireNonNull(nextLink);
            return this;
        }

        public Builder setValue(@Nullable List<SharedAccessSignatureAuthorizationRuleResponse> value) {
            this.value = value;
            return this;
        }

        public ListIotHubResourceKeysResult build() {
            return new ListIotHubResourceKeysResult(nextLink, value);
        }
    }
}
