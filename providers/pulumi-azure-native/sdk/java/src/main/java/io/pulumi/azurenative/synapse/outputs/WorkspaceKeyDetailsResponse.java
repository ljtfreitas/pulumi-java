// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WorkspaceKeyDetailsResponse {
    /**
     * Workspace Key sub-resource key vault url
     * 
     */
    private final @Nullable String keyVaultUrl;
    /**
     * Workspace Key sub-resource name
     * 
     */
    private final @Nullable String name;

    @OutputCustomType.Constructor({"keyVaultUrl","name"})
    private WorkspaceKeyDetailsResponse(
        @Nullable String keyVaultUrl,
        @Nullable String name) {
        this.keyVaultUrl = keyVaultUrl;
        this.name = name;
    }

    /**
     * Workspace Key sub-resource key vault url
     * 
     */
    public Optional<String> getKeyVaultUrl() {
        return Optional.ofNullable(this.keyVaultUrl);
    }
    /**
     * Workspace Key sub-resource name
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceKeyDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keyVaultUrl;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceKeyDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyVaultUrl = defaults.keyVaultUrl;
    	      this.name = defaults.name;
        }

        public Builder setKeyVaultUrl(@Nullable String keyVaultUrl) {
            this.keyVaultUrl = keyVaultUrl;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }
        public WorkspaceKeyDetailsResponse build() {
            return new WorkspaceKeyDetailsResponse(keyVaultUrl, name);
        }
    }
}
