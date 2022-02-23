// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.azurenative.logic.outputs.KeyVaultKeyResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListIntegrationAccountKeyVaultKeysResult {
    /**
     * The skip token.
     * 
     */
    private final @Nullable String skipToken;
    /**
     * The key vault keys.
     * 
     */
    private final @Nullable List<KeyVaultKeyResponse> value;

    @OutputCustomType.Constructor({"skipToken","value"})
    private ListIntegrationAccountKeyVaultKeysResult(
        @Nullable String skipToken,
        @Nullable List<KeyVaultKeyResponse> value) {
        this.skipToken = skipToken;
        this.value = value;
    }

    /**
     * The skip token.
     * 
     */
    public Optional<String> getSkipToken() {
        return Optional.ofNullable(this.skipToken);
    }
    /**
     * The key vault keys.
     * 
     */
    public List<KeyVaultKeyResponse> getValue() {
        return this.value == null ? List.of() : this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListIntegrationAccountKeyVaultKeysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String skipToken;
        private @Nullable List<KeyVaultKeyResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListIntegrationAccountKeyVaultKeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.skipToken = defaults.skipToken;
    	      this.value = defaults.value;
        }

        public Builder setSkipToken(@Nullable String skipToken) {
            this.skipToken = skipToken;
            return this;
        }

        public Builder setValue(@Nullable List<KeyVaultKeyResponse> value) {
            this.value = value;
            return this;
        }
        public ListIntegrationAccountKeyVaultKeysResult build() {
            return new ListIntegrationAccountKeyVaultKeysResult(skipToken, value);
        }
    }
}
